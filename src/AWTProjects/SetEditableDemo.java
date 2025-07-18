package AWTProjects;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class SetEditableDemo extends Frame {
	public SetEditableDemo() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setLayout(null);
		
		Font f = new Font("consolas",Font.BOLD,15);
		this.setFont(f);
		 
		Label l = new Label("User Name");
		
		TextField tf = new TextField("Enter User Name");
		tf.setEditable(false);
		System.out.println(tf.isEditable());
		
		
		l.setBounds(50, 100, 100, 50);
		tf.setBounds(150, 100, 200, 40);
		
		this.add(l);
		this.add(tf);
		
	}

	public static void main(String[] args) {
		SetEditableDemo st = new SetEditableDemo();

	}

}
