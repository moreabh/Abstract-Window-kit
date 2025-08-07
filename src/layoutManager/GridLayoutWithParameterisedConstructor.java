package layoutManager;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GridLayoutWithParameterisedConstructor extends Frame {

	public GridLayoutWithParameterisedConstructor() {
		
		this.setVisible(true);
		this.setTitle("Example of Gridlayout class: using GridLayout(rows,column)");
		this.setSize(500,500);
		
		//Window Closing 
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		//creating buttons
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		
		//Adding Buttons to the Frame
		
		this.add(b1);this.add(b2);this.add(b3);
		this.add(b4);this.add(b5);this.add(b6);
		this.add(b7);this.add(b8);this.add(b9);
		
		//Setting GridLayout of 3 row and 3 column
		GridLayout gl = new GridLayout(3, 3);
		
		this.setLayout(gl);
	}
	
	public static void main(String[] args) {
		GridLayoutWithParameterisedConstructor glc = new GridLayoutWithParameterisedConstructor();
	}
}
