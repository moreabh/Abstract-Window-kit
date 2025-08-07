//without parameterized constructor
package layoutManager;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutExample extends Frame{

	public GridLayoutExample() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Example of GridLayout using Parameterless Constructor");
		
		//closing window
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
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
		
		//Adding button to the Frame 
		//since we are using parameterless constructor,
		//therefore the number of columns is equal to the number of buttons we 
		//are adding to the Frame. the row count remains one.
		
		this.add(b1);this.add(b2);this.add(b3);
		this.add(b4);this.add(b5);this.add(b6);
		this.add(b7);this.add(b8);this.add(b9);
		
		//Setting the GridLayout using parameterless constructor
		
		this.setLayout(new GridLayout() );
	}
	public static void main(String[] args) {
		
		GridLayoutExample ge = new GridLayoutExample();
		

	}

}
