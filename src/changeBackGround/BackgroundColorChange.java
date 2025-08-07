package changeBackGround;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BackgroundColorChange extends Frame implements ActionListener {

	//Declaring buttons
	Label lb;
	Button b1,b2,b3;
	
	public BackgroundColorChange() {
	this.setVisible(true);
	this.setSize(500,500);
	this.setTitle("Change Background Color");
	this.setLayout(new FlowLayout());
	
	//window Closing 
	
	this.addWindowListener(new WindowAdapter() {
	
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	
	//creating buttons
	
	b1 = new Button("RED");
	b2 = new Button("GREEN");
	b3 = new Button("YELLOW");

	//changing the background Color
	
	b1.setBackground(Color.red);
	b2.setBackground(Color.green);
	b3.setBackground(Color.yellow);
	
	//register buttons with ActionListener
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	//adding these button to the Frame
	this.add(b1);this.add(b2);this.add(b3);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		if (label.equals("RED")) 
		{
			this.setBackground(Color.red);
		}
		else if (label.equals("GREEN")) 
		{
			this.setBackground(Color.green);
			
		}
		else if(label.equals("YELLOW"))
		{
			this.setBackground(Color.yellow);
		}
	}

	public static void main(String[] args) {
		BackgroundColorChange bg = new BackgroundColorChange();

	}

}
