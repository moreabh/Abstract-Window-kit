package AWTWindowListener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MouseEventDemo extends Frame  implements MouseListener{

	public MouseEventDemo() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Mouse Event Example");
		this.setBackground(Color.ORANGE);
		
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				System.exit(0);
			}
		});	
		//Adding or register mouse Listener to the Frame
		this.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked at point "+e.getX()+","+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed at point "+e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released at point "+e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered at point "+e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited at point "+e.getX()+","+e.getY());	
	}
	
	public static void main(String[] args) {
		MouseEventDemo md = new MouseEventDemo();
	}

}
