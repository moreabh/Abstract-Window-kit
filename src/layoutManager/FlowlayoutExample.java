package layoutManager;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowlayoutExample extends Frame {

	public FlowlayoutExample() {
		this.setVisible(true);
		this.setTitle("Flow Layout");
		this.setSize(500,500);
		this.setBackground(Color.CYAN);
		
		//Window closing
		
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
			}
		});
		
		//Creating 9 buttons
		Button b1 = new Button("button-1");
		Button b2 = new Button("button-2");
		Button b3 = new Button("button-3");
		Button b4 = new Button("button-4");
		Button b5 = new Button("button-5");
		Button b6 = new Button("button-6");
		Button b7 = new Button("button-7");
		Button b8 = new Button("button-8");
		Button b9 = new Button("button-9");
		
		//Adding Buttons to the Frame
		this.add(b1);this.add(b2);this.add(b3);
		this.add(b4);this.add(b5);this.add(b6);
		this.add(b7);this.add(b8);this.add(b9);
		
		//Setting Layout
		
		FlowLayout fl = new FlowLayout();
		
		this.setLayout(fl);
		
		
	}

	public static void main(String[] args) {
		
		FlowlayoutExample fl = new FlowlayoutExample();
	}

}
