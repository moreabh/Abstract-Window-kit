package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyListenerDemo extends Frame implements KeyListener {

	public KeyListenerDemo() {
		this.setVisible(true);
		this.setTitle("Key Listener Example");
		this.setSize(500,500);
		this.setBackground(Color.orange);
		
		//Adding or register window closing to the frame
		
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				System.exit(0);
			}
		});
		
		//Adding or register key listener to the frame 
		this.addKeyListener(this);
	}

	public static void main(String[] args) {
		KeyListenerDemo kld = new KeyListenerDemo();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Typed ------> ["+e.getKeyChar()+"]");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key Pressed ------> ["+e.getKeyChar()+"]");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Released------> ["+e.getKeyChar()+"]");
		
	}

}
