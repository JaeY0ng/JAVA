package CH20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05GUI extends JFrame implements ActionListener{
	
	JButton btn1;
	JButton btn2;
	
	C05GUI(){
		super("네번째 프레임 입니다.");
		setBounds(100,100,500,500);
		
		// Panel 생성
		JPanel panel = new JPanel();
		
		// 버튼 추가
		btn1 = new JButton("BUTTON01");
		btn1.setBounds(10,10,100,30);
		btn1.addActionListener(this);
		
		btn2 = new JButton("BUTTON02");
		btn2.setBounds(120,10,100,30);
		btn2.addActionListener(this);
		
		// TextField 추가
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,50,210,30);
		// TextField 추가
		JTextField txt2 = new JTextField();
		txt2.setBounds(10,90,210,30);
		
		//TextArea추가
		JTextArea area1 = new JTextArea();
		area1.setBounds(10,130,210,200);
		
		// JScrollPanel 추가
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,130,210,200);
		
		// 컴포넌트를 Panel에 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);
		
		// panel의 Layout을 초기화
		panel.setLayout(null);
		
		//Panel을 Frame에 추가
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("CLICKED..."+e.getActionCommand());
		if(e.getSource()==btn1) {
			System.out.println("BTN1 CLICKED..");
		}
		if(e.getSource()==btn2) {
			System.out.println("BTN2 CLICKED..");
		}
	}
}

public class C05SwingMain {

	public static void main(String[] args) {
		new C05GUI();
	}

}
