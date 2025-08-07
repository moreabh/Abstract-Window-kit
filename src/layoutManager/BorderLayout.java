package layoutManager;


import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;


public class BorderLayout extends Frame {

	public BorderLayout() {
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("Border Layout");
		this.setBackground(Color.cyan);
		
		//creating button 
		//button will be labeled as north
		Button b1 = new Button("NORTH");
		
		//button will be labeled as SOUTH
		Button b2 = new Button("SOUTH");
		
		//button will be labeled as east
		Button b3 = new Button("EAST");
		
		//button will be labeled as west
		Button b4 = new Button("WEST");
		
		//button will be labeled as center
		Button b5 = new Button("CENTER");
		
		//b1 will be placed at north direction
		this.add(b1, java.awt.BorderLayout.NORTH);
		this.add(b2, java.awt.BorderLayout.SOUTH);
		this.add(b3, java.awt.BorderLayout.EAST);
		this.add(b4, java.awt.BorderLayout.WEST);
		this.add(b5, java.awt.BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		
		BorderLayout ble = new BorderLayout();
		
	}

}
