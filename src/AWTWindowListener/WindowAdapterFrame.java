package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;

public class WindowAdapterFrame extends Frame {

	public WindowAdapterFrame() {
		//Settig up the Frame
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null);
		this.setTitle("Window Handling Using Adapter Class");
		this.setBackground(Color.pink);
		
		//Adding or Register WindowEvent in the Frame
		
		this.addWindowListener(new WindowAdapterImpl());
	}
	
	public static void main(String[] args) {
		WindowAdapterFrame waf = new WindowAdapterFrame();
	}

}
