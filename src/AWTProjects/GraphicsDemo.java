package AWTProjects;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class GraphicsDemo extends Frame {

	public GraphicsDemo() {
		
		this.setVisible(true);
		this.setSize(600,500);
		this.setTitle("Graphics Demo");
		this.setBackground(Color.ORANGE);
	}
	
	//Here Overriding paint method Of Graphics 
	
	@Override
	public void paint(Graphics g) {
		g.drawString("Welcome To Graphics Demo",50, 50);
		g.drawRect(50, 70, 80, 40);
		g.fillRect(200, 70, 80, 40);
		g.drawOval(20, 120, 80, 40);
		g.fillOval(120, 120, 80, 40);
		g.drawLine(300, 200, 350, 250);
	}
	
	public static void main(String[] args) {
		GraphicsDemo gd = new GraphicsDemo();
	}

}
