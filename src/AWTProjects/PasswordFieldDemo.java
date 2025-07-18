package AWTProjects;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class PasswordFieldDemo extends Frame{

	public PasswordFieldDemo() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setLayout(null);
		
		Font f = new Font("consolas",Font.BOLD,15);
		this.setFont(f);
		
		Label l1 = new Label("Password");
		TextField tf = new TextField(30);
		
		
		l1.setBounds(50, 100, 100, 50);
		tf.setBounds(150, 100, 200, 30);
		tf.setEchoChar('*');        //To Hide the password with the Char '*'
		this.add(l1);
		this.add(tf);
		
	}
	
	public static void main(String[] args) {
		PasswordFieldDemo pfd = new PasswordFieldDemo();
	}

}
