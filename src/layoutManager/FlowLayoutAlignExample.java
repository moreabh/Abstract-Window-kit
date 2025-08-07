package layoutManager;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutAlignExample extends Frame{

	public FlowLayoutAlignExample() {
		
		this.setVisible(true);
		this.setSize(300,300);
		this.setTitle("FlowLayout with alignment");
		this.setBackground(Color.lightGray);
	
		//creating Buttons
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		
		//Adding all buttons to the Frame
		
		this.add(b1);this.add(b2);
		this.add(b3);this.add(b4);
		this.add(b5);
		
		//setting flowLayout of right alignment
		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
	}
	
	public static void main(String[] args) {
		FlowLayoutAlignExample fl = new FlowLayoutAlignExample();
	}

}
