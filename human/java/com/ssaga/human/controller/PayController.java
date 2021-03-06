package com.ssaga.human.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.ssaga.human.dao.PayDao;
import com.ssaga.human.dto.ContractInfoDto;
import com.ssaga.human.dto.EmployeeDto;
import com.ssaga.human.service.PayService;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;

@Controller
@RequestMapping("/")
public class PayController {
	
	private static final Logger logger = LoggerFactory.getLogger(PayController.class);
	
	@Autowired
	PayService payService;
	
	@Autowired
	PayDao payDao;
	
	@Resource(name="saveDir")
	private String saveDir;
	
	//Root�뿉�꽌�뒗 Login Form �쓣 癒쇱� �몴�떆
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		return "pages/login";
	}
	
	//Login Form
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() {
		return "pages/login";
	}
	
	//Login Processing..... 
	@RequestMapping(value="/payLogin", method=RequestMethod.POST)
	public String payLogin(@RequestParam("comcode") String comcode,
			@RequestParam("pid") String pid, @RequestParam("pwd") String pwd,
			HttpSession session ) {
		return payService.payLogin(comcode, pid, pwd, session);
	}

	//�씤�궗�젙蹂� �쟾泥대�� Display....
	@RequestMapping(value="/tblEmpList", method=RequestMethod.GET)
	public String tblEmpList(Model model) {
		List<EmployeeDto> emplist = payService.empList();
		model.addAttribute("emplist", emplist);
		return "pages/tblEmpList";		
	}
	
	//媛쒕퀎 �긽�꽭 �씤�궗�젙蹂대��  Display
	@RequestMapping(value="/viewEmp", method=RequestMethod.GET)
	public String viewEmp(Model model, @RequestParam("EMPNO") String empno) {
		EmployeeDto employee = payService.viewEmp(empno);
		model.addAttribute("employee", employee);
		return "pages/frmViewEmp";		
	}

	//媛쒕퀎 �씤�궗�젙蹂대�� �닔�젙�븯湲� �쐞�븳 �솕硫� Display
	@RequestMapping(value="/frmUpdEmp", method=RequestMethod.GET)
	public String updateEmployee(@RequestParam("EMPNO") String empno, Model model, HttpSession session) {
		EmployeeDto employee = payService.empforUpd(empno, session);
		model.addAttribute("employee", employee);
		return "pages/frmUpdEmp";
	}
	
	//媛쒕퀎 湲곕낯 �씤�궗�젙蹂댁쓽 �벑濡앹쓣 �쐞�븳 �솕硫� Display
	@RequestMapping(value="/frmAddEmp", method=RequestMethod.GET)
	public String frmempAdd() {
		return "pages/frmAddEmp";
	}

	//媛쒕퀎 �씤�궗�젙蹂댁쓽 �벑濡� Processing....
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public String addEmployee(EmployeeDto employee, HttpSession session) {
		employee.setPID((String)session.getAttribute("pid"));
		employee.setCOMCODE((String)session.getAttribute("comcode"));
		payService.empAdd(employee);
		return "redirect:tblEmpList";
	}
	
	//媛쒕퀎 湲곕낯�씤�궗 �젙蹂댁쓽 �닔�젙 Processing....
	@RequestMapping(value="/updEmployee", method= RequestMethod.POST)
	public String updEmployee(EmployeeDto employee, HttpSession session) {
		employee.setPID((String)session.getAttribute("pid"));
		employee.setCOMCODE((String)session.getAttribute("comcode"));
		payService.updEmployee(employee);
		return "redirect:tblEmpList";
	}

	//媛쒕퀎 異붽� �씤�궗�젙蹂댁쓽 �닔�젙 Processing....
	@RequestMapping(value="/updEmployee2", method=RequestMethod.POST)
	public String updEmployee2(EmployeeDto employee, HttpSession session) {
		employee.setPID((String)session.getAttribute("pid"));
		employee.setCOMCODE((String)session.getAttribute("comcode"));
		payService.empUpd2(employee);
		return "redirect:tblEmpList";
	}

	@RequestMapping(value="/delEmployee", method=RequestMethod.POST)
	public String delEmployee(EmployeeDto employee, HttpSession session) {
		employee.setPID((String)session.getAttribute("pid"));
		employee.setCOMCODE((String)session.getAttribute("comcode"));
		payService.empDel(employee);
		return "redirect:tblEmpList";
	}
	
	//Employee Table via Excel File Batch Process.
	@RequestMapping(value="/addEmpFile", method=RequestMethod.POST)
	public String addEmpFile(EmployeeDto employee, @RequestPart("fname") MultipartFile empFile, HttpSession session) {
		String result = payService.addEmpFile(employee,empFile, session);
		if (result =="Success")
			return "redirect:tblEmpList";
		else
			return "";
	}

	@RequestMapping(value = "/prtCntrct", method = RequestMethod.POST)
	public String generateContract(EmployeeDto employee, HttpServletRequest req, HttpServletResponse res, HttpSession session) throws JRException, IOException {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("rptTitle", "�뿰遊됯렐濡쒓퀎�빟�꽌");
		String empno = employee.getEMPNO();
		String empname = employee.getEMPNAME();
		String comCode = (String) session.getAttribute("comcode");
		HashMap<String,String> hmForContract = new HashMap<>();
		hmForContract.put("comcode", comCode);
		hmForContract.put("empno", empno);
		employee.setPID((String)session.getAttribute("pid"));
		employee.setCOMCODE((String)session.getAttribute("comcode"));
		payService.empCntrctUpd(employee);
		
	    //File reportFile = new File(session.getServletContext().getRealPath("/reports/" + "yContract" + ".jasper"));
		File reportFile = new File( "/resources/reports/yContract.jasper");
		//jasper file for test.....
	    if (reportFile.exists()) {
	    	reportFile.delete();
	    }
		
	    // If compiled file is not found, then compile XML template
//	    if (!reportFile.exists()) {
        JasperCompileManager.compileReportToFile(session.getServletContext().getRealPath("/resources/reports/yContract.jrxml"),session.getServletContext().getRealPath("/resources/reports/yContract.jasper"));
//	    }
	    
	    JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(session.getServletContext().getRealPath("/resources/reports/yContract.jasper"));
	    
	    //Bring the data from Database for report
		List<ContractInfoDto> contractInfo = (List<ContractInfoDto>) payDao.contractInfo(hmForContract);
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(contractInfo);
	    
		//Fill the data in reprot
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JRPdfExporter exporter = new JRPdfExporter();
		
		//To make PDF File.........
		File savePath = new File(saveDir + comCode + "/Contract");
		if(!savePath.exists()) {
			savePath.mkdirs();
		}
		String fileName = saveDir + comCode + "/Contract/" + empno + empname + "yContract.pdf";
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(fileName));
		
		SimplePdfReportConfiguration reportConfig = new SimplePdfReportConfiguration();
		reportConfig.setSizePageToContent(true);
		reportConfig.setForceLineBreakPolicy(false);
		 
		SimplePdfExporterConfiguration exportConfig = new SimplePdfExporterConfiguration();
		exportConfig.setMetadataAuthor("SSAGA");
		exportConfig.setEncrypted(true);
		exportConfig.setAllowedPermissionsHint("PRINTING");
		 
		exporter.setConfiguration(reportConfig);
		exporter.setConfiguration(exportConfig);
		
		exporter.exportReport();
		//PDF file....
		res.setContentType("application/octet-stream");
		res.setHeader("Connection", "close");
		res.setHeader("Content-Disposition", "attachment;filename=\"" + new String(fileName.getBytes("utf-8"),"ISO-8859-1") + "\"");
		OutputStream ouputStream = res.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, ouputStream);
		
		return "redirect:tblEmpList";
	}
	
	
	@RequestMapping(value = "/rptEmpList", method = RequestMethod.GET)
	public String empList(EmployeeDto employee, HttpServletRequest req, HttpServletResponse res, HttpSession session) throws JRException, IOException {
		
		
		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("rptTitle", "사원리스트");

		String comCode = (String) session.getAttribute("comcode");
		
	    //File reportFile = new File(session.getServletContext().getRealPath("/reports/" + "yContract" + ".jasper"));
		File reportFile = new File( "/resources/reports/empList.jasper");
		//jasper file for test.....
	    if (reportFile.exists()) {
	    	reportFile.delete();
	    }
		
	    // If compiled file is not found, then compile XML template
//	    if (!reportFile.exists()) {
        JasperCompileManager.compileReportToFile(session.getServletContext().getRealPath("/resources/reports/empList.jrxml"),session.getServletContext().getRealPath("/resources/reports/empList.jasper"));
//	    }
	    
	    JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(session.getServletContext().getRealPath("/resources/reports/empList.jasper"));
	    
	    //Bring the data from Database for report
		List<EmployeeDto> empList = (List<EmployeeDto>) payDao.empList();
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(empList);
	    
		//Fill the data in reprot
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JRPdfExporter exporter = new JRPdfExporter();
		
		//To make PDF File.........
		File savePath = new File(saveDir + comCode + "/list");
		if(!savePath.exists()) {
			savePath.mkdirs();
		}
		String fileName = saveDir + comCode + "/list/" + "empList.pdf";
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(fileName));
		
		SimplePdfReportConfiguration reportConfig = new SimplePdfReportConfiguration();
		reportConfig.setSizePageToContent(true);
		reportConfig.setForceLineBreakPolicy(false);
		 
		SimplePdfExporterConfiguration exportConfig = new SimplePdfExporterConfiguration();
		exportConfig.setMetadataAuthor("SSAGA");
		exportConfig.setEncrypted(true);
		exportConfig.setAllowedPermissionsHint("PRINTING");
		 
		exporter.setConfiguration(reportConfig);
		exporter.setConfiguration(exportConfig);
		
		exporter.exportReport();
		//PDF file....
		res.setContentType("application/octet-stream");
		res.setHeader("Connection", "close");
		res.setHeader("Content-Disposition", "attachment;filename=\"" + new String(fileName.getBytes("utf-8"),"ISO-8859-1") + "\"");
		OutputStream ouputStream = res.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, ouputStream);
		
		return "redirect:tblEmpList";
	}
	
	
}
