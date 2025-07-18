package AWTProjects;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;

public class ButtonExample extends Frame {

	public ButtonExample() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Button Demo");
		this.setLayout(null);
		
		Font f = new Font("consolas", Font.BOLD,15);
		this.setFont(f);
		
		Button b1 = new Button();
		b1.setLabel("Submit");
		b1.setBounds(100, 100, 150, 40);
		
		Button b2 = new Button();
		b2.setLabel("Cancel");
		b2.setBounds(300, 100, 150, 40);
		
		this.add(b1);
		this.add(b2);
		
		System.out.println(b1.getLabel());
		
	}

	public static void main(String[] args) {
		ButtonExample b = new ButtonExample();
		

	}

}
