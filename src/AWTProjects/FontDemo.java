package AWTProjects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontDemo extends Frame{

	public FontDemo() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Font Demo");
		
		Color c = Color.cyan;
		
		this.setBackground(c);
	}
	
	@Override
	public void paint(Graphics g) {
		Font f = new Font("consolas",Font.BOLD,30);
		g.setFont(f);
		g.setColor(Color.DARK_GRAY);
		g.drawString("This is Font Demo ",50, 100);
		g.fillRect(50, 200, 80, 40);
	}

	public static void main(String[] args) {
		FontDemo fd = new FontDemo();

	}

}
