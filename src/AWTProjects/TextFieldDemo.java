package AWTProjects;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldDemo extends Frame {

	public TextFieldDemo() {
		
		Label l1 = new Label("User Name");
		TextField t = new TextField();
	
		t.setText("Enter User Name");
		
		
		//setting Location
		
		l1.setBounds(50, 100, 100, 50);
		t.setBounds(150, 100, 200, 50);
		
		//adding GUI component to the Frame 
		
		this.add(l1);
		this.add(t);
		
		Font f =new Font("consolas", Font.BOLD,15);
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(500, 500);
		
	}
	
	public static void main(String[] args) {
		TextFieldDemo td = new TextFieldDemo();
	}
 
}
