//Using Within Class
package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
public class WindowExample extends Frame implements WindowListener {

	public WindowExample() {
		//Setting Up The Frame
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLayout(null);
		this.setTitle("Window Event Example");
		this.setBackground(Color.orange);
		
		//Adding register Window Listener to the frame
		//this class itself is Implementation Class
		//this.addWindowListener(new WindowExample());
		this.addWindowListener(this);
	}

	public static void main(String[] args) {
		WindowExample  we = new WindowExample();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window DeIconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
		
	}

}
