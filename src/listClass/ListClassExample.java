package listClass;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListClassExample extends Frame implements ItemListener 
{
	//Declaration 
	List l;
	Label label;

	
	public ListClassExample() 
	{
		this.setVisible(true);
		this.setTitle("List Example");
		this.setSize(500,500);
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
		
		//Creating label 
		label = new Label();
		label.setAlignment(Label.CENTER);
		label.setFont(f);
		label.setSize(400,100);
		
		//Creating list 
		l = new List();
		l.setFont(f);
		l.setBounds(100, 100, 200, 100);
		
		//adding items to the list
		l.add("Java");
		l.add("C Language");
		l.add("C++ ");
		l.add("Python"); 
		l.add("Javascript");
		
		//adding these GUI components to the Frame
		this.add(label);this.add(l);
		
		//register list with the Itemlistener interface
		l.addItemListener(this);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		String selectItem = l.getSelectedItem();
		
		label.setText("Selected Language: "+selectItem);	
	}
	public static void main(String[] args) {
		ListClassExample ls = new ListClassExample(); 
	}
}
