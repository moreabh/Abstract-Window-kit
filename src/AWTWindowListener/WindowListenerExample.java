//Using Other Class
package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;

public class WindowListenerExample extends Frame {

	public WindowListenerExample() {
		//Setting the size visibility and layout of the frame
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setLayout(null);
		this.setTitle("Window Listener Example");
		
		//Setting the Background Color of Frame
		
		this.setBackground(Color.cyan); 
		
		//Adding or register windowListener to the Frame
		
		this.addWindowListener(new WindowListenerImp());
		
		
	}
	
	public static void main(String[] args) {
		WindowListenerExample wle = new WindowListenerExample();
	}

}
