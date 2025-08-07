package layoutManager;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GridLayoutwithHgapVgap extends Frame {

	public GridLayoutwithHgapVgap() {
		this.setVisible(true);
		this.setTitle("Example of parameterized constructor with hgap ans vgap with rows and columns");
		this.setSize(500,500);
		
		//window closing
		
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
			
			}
		});
		
		//creating 9 buttons
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		
		//Adding all buttons to the Frame
		
		this.add(b1);this.add(b2);this.add(b3);
		this.add(b4);this.add(b5);this.add(b6);
		this.add(b7);this.add(b8);this.add(b9);
		
		//Setting the layout
		GridLayout gl = new GridLayout(3, 3, 20, 15);

		this.setLayout(gl);
	}

	public static void main(String[] args) {
		GridLayoutwithHgapVgap gl = new  GridLayoutwithHgapVgap();

	}

}
