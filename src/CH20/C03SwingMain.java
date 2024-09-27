package CH20;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	C03GUI(){
		super("세번째 프레임 입니다.");
		setBounds(100,100,500,500);
		
		// Panel 생성
		JPanel panel = new JPanel();
		
		
		//Panel을 Frame에 추가
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C03SwingMain {

	public static void main(String[] args) {
		new C03GUI();
	}

}
