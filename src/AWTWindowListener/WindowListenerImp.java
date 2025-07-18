//Using Other Class
package AWTWindowListener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerImp implements WindowListener 
{

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	System.out.println("Window Close");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.err.println("Window DeIconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.err.println("Window Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.err.println("Window Deactivated");
		
	}

}
