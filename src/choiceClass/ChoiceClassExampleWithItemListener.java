package choiceClass;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceClassExampleWithItemListener extends Frame implements ItemListener 
{
	//Declaration
	Choice c;
	Label label;

	public ChoiceClassExampleWithItemListener()
	{
		this.setVisible(true);
		this.setTitle("Java AWT Choice Example with ItemListener");
		this.setSize(500, 500);
		this.setLayout(null);
		
		//Window Closing 
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//creating Font class Object
		Font f = new Font("consolas",Font.BOLD,20);

		//Creating label
		label = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400, 100);
		label.setFont(f);
		
		//Creating choice object
		c = new Choice();
		c.setFont(f);
		c.setBounds(200, 100, 100, 75);
		
		//adding item to the choice menu
		c.add("Tea");
		c.add("Coffee");
		c.add("Milk");
		c.add("Juice");
		
		//adding this GUI components to the Frame 
		this.add(c);this.add(label);
		
		//register this choice menu to the ItemListener Interface 
		c.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		label.setText("Selected Item --->"+c.getSelectedItem());
		
	}

	public static void main(String[] args) {
		ChoiceClassExampleWithItemListener ci = new ChoiceClassExampleWithItemListener();
	}
}
