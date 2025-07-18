package AWTProjects;

import java.awt.Frame;

public class MyFrame extends Frame{

	public MyFrame() {
		
		this.setVisible(true);
		
		this.setSize(500,400);
		
		this.setTitle("User Defined Frame");
		
		
	}

	public static void main(String[] args) {
		
		MyFrame fm = new MyFrame();

	}

}
