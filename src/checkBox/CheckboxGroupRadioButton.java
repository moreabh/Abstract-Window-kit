package checkBox;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxGroupRadioButton extends Frame implements ItemListener
{
	//Declaration 
	Checkbox cb1,cb2,cb3;
	Label label;
	

	public CheckboxGroupRadioButton() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("CheckBoxGroup Example");
		this.setLayout(null);
		
//Window Closing 
		
		this.addWindowListener(new WindowAdapter() {
		
			 @Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
		
		//creating Font class object
		Font f = new Font("consolas",Font.BOLD,20);
		
		label = new Label();
		label.setAlignment(Label.CENTER);
		label.setFont(f);
		label.setSize(400, 100);
		
	//Creating checkbox group object
		CheckboxGroup cbg = new CheckboxGroup();
		
		//creating checkboxes 
		cb1 = new Checkbox("Tea",cbg, false);
		cb1.setFont(f);
		//setting location of Checkbox
		cb1.setBounds(100, 100, 50, 50);
		
		cb2 = new Checkbox("Coffee",cbg, false);
		cb2.setFont(f);
		//setting location of Checkbox
		cb2.setBounds(100, 150, 80, 50);
		
		cb3 = new Checkbox("Milk",cbg, false);
		cb3.setFont(f);
		//setting location of Checkbox
		cb3.setBounds(100, 200, 70, 50);
	
	//adding this GUI componant to the Frame
		this.add(cb1);this.add(cb2);this.add(cb3);this.add(label);
		
	//Register these checkbox with ItemListener interface
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this); 
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{     
		Checkbox cb = (Checkbox) e.getItemSelectable();
		
		if (cb.getState()==true)
		{
			label.setText(cb.getLabel()+" is Checked");
		}
		else
		{
			label.setText(cb.getLabel()+"is Unchecked");
		}	
	}

	public static void main(String[] args) {
	CheckboxGroupRadioButton cr = new CheckboxGroupRadioButton();
	}
}
