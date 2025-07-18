package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowClosing  extends Frame{
	
	public WindowClosing() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Window Event Handling using Annonymous Inner Class");
		this.setBackground(Color.CYAN);
		
		//adding or register window listner to the frame
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window CLosing");
				System.exit(0);
			}
		
		});
	
	}
	public static void main(String[] args) {
		WindowClosing wc = new WindowClosing();
	}

}
