package choiceMenuAPK;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceMenuManuallyAddItems extends Frame implements ItemListener,ActionListener
{
	//Declaration
	Choice c;
	Label label;
	Button b1,b2,b3;
	TextField tf;

	public ChoiceMenuManuallyAddItems() {
		this.setVisible(true);
		this.setTitle("Java program to create menu and manually adds items to it");
		this.setSize(500, 500);
		this.setLayout(null);
		
		//Creating Font class Object
		Font f = new Font("consolas",Font.BOLD,20);
		
		//Creating Label
		label = new Label();
		label.setAlignment(Label.CENTER);
		label.setFont(f);
		label.setSize(400, 100);
		
		//Creating empty choice menu
		c = new Choice();
		c.setFont(f);
		c.setBounds(200, 220, 100, 75);
		
		//Creating TextField
		tf = new TextField(" Enter an Item");
		tf.setFont(f);
		tf.setBounds(200, 100, 170, 30);
		
		//Creating Button
		b1 = new Button("Add");
		b1.setFont(f);
		b1.setBounds(50, 150, 100, 30);
		
		b2 = new Button("Remove");
		b2.setFont(f);
		b2.setBounds(200, 150, 100, 30);
		
		b3 = new Button("Remove All");
		b3.setFont(f);
		b3.setBounds(350, 150, 110, 30);
		
		//Adding this GUI component to the Frame
		this.add(b1);this.add(b2);this.add(b3);
		this.add(c);this.add(label);this.add(tf);
		
		//Register choice menu to the ItemListener interface
		c.addItemListener(this);
		
		//Register button to the ActionListener Interface
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
//window closing 
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String button_label = e.getActionCommand();
		
		if (button_label.equals("Add"))
		{
			c.add(tf.getText());
			label.setText(" Item added ----> "+tf.getText());
		}
		else if (button_label.equals("Remove")) 
		{
			String selected_item = c.getSelectedItem();
			c.remove(selected_item);
			label.setText("Selected Item Removed ---->"+selected_item);
		}
		else if (button_label.equals("Remove All"))
		{
			c.removeAll();
			label.setText("Removed all items from the choice menu ");
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		label.setText("Selected Item --->"+c.getSelectedItem());
		
	}

	public static void main(String[] args) {
		ChoiceMenuManuallyAddItems cm = new  ChoiceMenuManuallyAddItems();

	}
}
