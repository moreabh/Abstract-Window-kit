package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyAdapterDemo extends Frame {

	public KeyAdapterDemo() {
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Key Adapter Demo ");
		this.setBackground(Color.CYAN);
		
		//Adding or register window closing to the frame
		
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				System.exit(0);
			}
		});
		
		//adding or register keyListener to the frame
		
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Key Typed----->["+e.getKeyChar()+"]");
			}
		});
	}

	public static void main(String[] args) {
		KeyAdapterDemo kd = new KeyAdapterDemo();
	}

}
