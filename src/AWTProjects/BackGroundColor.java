package AWTProjects;

import java.awt.Color;
import java.awt.Frame;

public class BackGroundColor extends Frame {

	public BackGroundColor() {
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("BackGround Color");
		
		//create new color
//		Color c = Color.red;	//1)Using Calling Color constant 
		
		Color c = new Color(200,150,13); //2)Using rgb color code
		
//		Color c = new Color(0Xddff00);  //3)Using RGB Hexcode
         this.setBackground(c);
	}

	
	public static void main(String[] args) {
		
		BackGroundColor bgc = new BackGroundColor();
	}
}
