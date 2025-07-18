package AWTProjects;

import java.awt.Frame;
import java.awt.Label;


public class LabelDemo extends Frame{

	public LabelDemo() {
		Label l1 = new Label("User Name");
		
		Label l2 = new Label("Password");
		
		
		//set the location of label
		
		l1.setBounds(100, 100, 100, 30);
		
		l2.setBounds(150, 100, 100, 30);
		
		//adding label to the Frame
		this.add(l1);
		this.add(l2);
	
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Label Demo");
		 
	}
	public static void main(String[] args) {
		LabelDemo ld = new LabelDemo();

	}
}
