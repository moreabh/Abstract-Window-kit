package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MouseAdapterExample extends Frame {

	public MouseAdapterExample() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Mouse Adapter Example");
		this.setBackground(Color.darkGray);
		
		//adding or register windowListener to the frame
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				System.exit(0);
			}
		});
		
		//adding or ragister mouse event to the frame
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Clicked at point :"+e.getX()+","+e.getY());
			}
		});
		
	}
	public static void main(String[] args) {
		MouseAdapterExample ma = new MouseAdapterExample();
	}

}
