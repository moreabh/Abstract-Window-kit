package choiceClass;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceExample extends Frame {

	//Declaration 
	Choice c;
	
	public ChoiceExample() 
	{
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Java AWT Choice class example");
		this.setLayout(null);
		
		//Window Closing Property
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});	
		
		//Creating Font class object 
		Font f = new Font("consolas",Font.BOLD,20);
		
		//creating choice object 
		Choice c = new Choice();
		c.setFont(f);
		
		//setting location of choice menu
		c.setBounds(200, 100, 100, 75);
		
		//adding item to the choice menu
		c.add("Tea");
		c.add("Coffee");
		c.add("Milk");
		
		c.insert("Juice", 3);
	
	//Adding choice menu to the frame
		this.add(c);	
		
	}
	
	public static void main(String[] args) {
		ChoiceExample c = new ChoiceExample();
	}

}
