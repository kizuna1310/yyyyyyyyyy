import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX03_ALL extends JFrame {
	
	private int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
	private String [] text = {"������", "����", "õ��", "500��", "100��", "50��", "10��", "1��"}; // ȯ���� ���� �̸�. ���̺�� ��µ�
	private JTextField inputText; // ����ڷκ��� �ݾ��� �Էµ� �ؽ�Ʈ �ʵ�
	private JTextField [] tf = new JTextField [8]; // ȯ��� ���� ������ ��µ� �ؽ�Ʈ�ʵ�
	
	public EX03_ALL() 
	{
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setContentPane(new MyPanel());
		Container c = getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(null); // �г��� ��ġ������ ����
		
		// �ݾ� ���̺�
		JLabel la = new JLabel("�ݾ�");
		la.setHorizontalAlignment(JLabel.RIGHT);
		la.setSize(50, 20);
		la.setLocation(20, 20);
		c.add(la);
		
		// �ݾ��� �Է��ϴ� JTextField
		inputText = new JTextField(30);
		inputText.setSize(100, 20);
		inputText.setLocation(100, 20);
		c.add(inputText);
		
		// ��� ��ư
		JButton calcBtn = new JButton("���");
		calcBtn.setSize(70, 20);
		calcBtn.setLocation(210, 20);
		c.add(calcBtn);
		
		// ���� �׼��� ���� ����
		for(int i=0; i<text.length; i++) {
			la = new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(50, 50+i*20);
			c.add(la);
			tf[i] = new JTextField(30);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setSize(70, 20);
			tf[i].setLocation(120, 50+i*20);
			
			c.add(tf[i]);
		}
		
		// ��� ��ư�� Action ������
		calcBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = inputText.getText(); // �Էµ� �ݾ� ���ڿ�
				if(str.length() == 0) return; // �Էµ� �ݾ��� ����
				
				int money = Integer.parseInt(str); // �Էµ� �ݾ��� ������ ��ȯ
				int res;
				for(int i=0; i<unit.length; i++) {
					res = money/unit[i]; // unit[i]�� ���� ���
					tf[i].setText(Integer.toString(res));
					if(res > 0) 
						money = money%unit[i]; // money ����
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new EX03_ALL();
	}
}
