package layoutManager;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutWIthAlignmentHgapVgap extends Frame {

	public FlowLayoutWIthAlignmentHgapVgap() {
		
		this.setVisible(true);
		this.setTitle("FlowLayout with alignment with Hgap & Vgap");
		this.setSize(300,300);
		this.setBackground(Color.green);
		
		//Window Closing 
		 
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
						}
		});
		
		//Adding 10 Buttons 
		 
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button b10 = new Button("10");
		
		//Adding buttons to the Frame
		
		this.add(b1);this.add(b2);this.add(b3);this.add(b4);this.add(b5);
		this.add(b6);this.add(b7);this.add(b8);this.add(b9);this.add(b10);
		
		/*parameterized constructor is used where alignment is left and horizontal gap is 20 unit 
		and vertical gap is 25 unit*/
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20, 25);
		
		//setting layout
		this.setLayout(fl);
	}

	public static void main(String[] args) {
		FlowLayoutWIthAlignmentHgapVgap flhv = new FlowLayoutWIthAlignmentHgapVgap(); 

	}

}
