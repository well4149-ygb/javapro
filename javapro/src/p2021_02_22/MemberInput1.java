package p2021_02_22;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberInput1 extends JFrame {

	JTextField name, email, phone;
	JButton input, cancel;
	JPanel p1, p2, p3, p4;	

	public MemberInput1() {
		super("회원 가입");

		name = new JTextField(20);
		email = new JTextField(20);
		phone = new JTextField(20);

		input = new JButton("회원가입");
		cancel = new JButton("취  소");

		p1 = new JPanel(new GridLayout(3, 1));
		p1.add(new JLabel("이름"));
		p1.add(new JLabel("E-Mail"));
		p1.add(new JLabel("전화번호"));

		p2 = new JPanel(new GridLayout(3, 1));
		p2.add(name);
		p2.add(email);
		p2.add(phone);

		p3 = new JPanel();
		p3.add(p1);
		p3.add(p2);

		p4 = new JPanel();
		p4.add(input);
		p4.add(cancel);

		add(p3, "Center");
		add(p4, "South");

		setBounds(300, 300, 350, 180);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}	

	public static void main(String[] args) {
		MemberInput1 mi = new MemberInput1();
	}
}
