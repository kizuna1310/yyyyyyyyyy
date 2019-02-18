import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;

public class EX06 extends JFrame {
	private JTextArea ta = new JTextArea(5,10); // 5�� 10��
	private JSlider slider = new JSlider(0,100,0);
	
	public EX06() {
		super("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(slider, BorderLayout.CENTER);
		c.add(new JScrollPane(ta), BorderLayout.NORTH); // ��ũ���� �ǵ��� ��
		
		// �����̴��� �Ӽ� ����
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider s = (JSlider)e.getSource();
				if(ta.getText().length() <= s.getValue()) // �����̴��� ���ں��� �� ���� ������ ���
					s.setValue(ta.getText().length()); // ���ڼ� ũ�⿡ ���߾� �����̴� ����
				else {
					try {
						ta.setText(ta.getText(0, s.getValue()));
					} catch (BadLocationException e1) {}
				}
			}
		});
	
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				JTextArea t = (JTextArea)e.getSource();
				int size = t.getText().length(); // ���� �ؽ�Ʈ������ �Էµ� ���ڼ�
				try {
				if(size >= 100) // �̹� 100�� �̻��̶��
					t.setText(t.getText(0, 100));
				} catch(BadLocationException ex) {}
				
				slider.setValue(size); // �����̴��� �� ����. �����̴��� �����̰� ������
			}
		});

		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EX06();
	}
}
