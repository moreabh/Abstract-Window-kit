package itemEventClass;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemEventClass extends Frame implements ItemListener {

	//Declaration
	Checkbox cb1,cb2,cb3;
	Label label;
	public ItemEventClass() {
		this.setVisible(true);
		this.setTitle("ItemListener Example");
		this.setSize(500,500);
		this.setLayout(null);
		
		//window closing property
		this.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//creating Font class Object
		Font f = new Font("consolas",Font.BOLD,20);
		
		label = new Label();
		label.setAlignment(Label.CENTER);
		label.setFont(f);
		label.setSize(400,100);
		
		//creating checkboxes
		cb1 = new Checkbox("Tea");
		cb1.setFont(f);
		//setting location of checkbox
		cb1.setBounds(100, 100, 50, 50);
		
		cb2 = new Checkbox("Coffee");
		cb2.setFont(f);
		//setting location of checkbox
		cb2.setBounds(100, 150, 80, 50);
		
		cb3 = new Checkbox("Milk");
		cb3.setFont(f);
		//setting location of checkbox
		cb3.setBounds(100, 200, 70, 50);
		
		//register this checkboxes with Itemlistener interface
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		
		//adding GUI componant to the Frame
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.add(label);
}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		label.setText("Selected Item"+e.getItemSelectable());
//		label.setText("Selected Item"+e.getItem());
//		label.setText("State: "+e.getStateChange());
	}

	public static void main(String[] args) {
		ItemEventClass ie =new ItemEventClass();
	}

	
}
