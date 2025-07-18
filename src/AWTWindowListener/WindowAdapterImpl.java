package AWTWindowListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterImpl extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
		System.exit(0);
	}
	public WindowAdapterImpl() {
		
	}

}
