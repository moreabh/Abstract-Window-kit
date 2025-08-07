package checkBox;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxExample extends Frame  {

	public CheckBoxExample() {
		//setting size layout and visibility of frame
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Checkbox Example");
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		
		//window closing 
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//Creating font class object 
		Font f = new Font("Consolas", Font.BOLD, 20);
		
		//Creating checkboxes
		Checkbox cb1 = new Checkbox("Tea");
		cb1.setFont(f);
		//setting location of checkbox
		cb1.setBounds(100, 100, 50, 50);
		
	
		Checkbox cb2 = new Checkbox("Coffee");
		cb2.setFont(f);
		cb2.setBounds(100, 150, 80, 50);
		
		Checkbox cb3 = new Checkbox("Milk");
		cb3.setFont(f);
		cb3.setBounds(100, 200, 70, 50);
		
		//adding these checkboxes to the Frame
		this.add(cb1);this.add(cb2);this.add(cb3);
	}
	
	public static void main(String[] args) {
	
		CheckBoxExample cb = new  CheckBoxExample();
	}

}
