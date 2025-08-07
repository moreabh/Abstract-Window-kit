package layoutManager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayoutWithGap extends Frame {

	public BorderLayoutWithGap() {
		this.setVisible(true);
		this.setTitle("Border layout with gap");
		this.setSize(500,500);
		this.setBackground(Color.cyan);
		
		//creating gap between buttons   (hgap,vgap)
		BorderLayout bl = new BorderLayout(20,15);
		
		//set layout
		this.setLayout(bl);
		
		//Creating buttons
		Button b1 = new Button("NORTH");
		Button b2 = new Button("SOUTH");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		Button b5 = new Button("CENTER");
		
		//adding buttons to the Frame
		this.add(b1, BorderLayout.NORTH);
		this.add(b2, BorderLayout.SOUTH);
		this.add(b3, BorderLayout.EAST);
		this.add(b4, BorderLayout.WEST);
		this.add(b5, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		BorderLayoutWithGap blg = new BorderLayoutWithGap(); 

	}

}
