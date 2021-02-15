package p2021_02_15;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {

	private Frame f;					// 필드, 멤버변수

	public FrameTest() {				// 생성자
		f = new Frame("Frame Test");
		f.setSize(400, 300);
		f.setLocation(100, 100);
		f.setBackground(Color.green);
		f.setVisible(true);
		f.setResizable(false);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// 생성자 end

	public static void main(String[] args) {
		FrameTest ft = new FrameTest();	//생성자 호출
	}
}



