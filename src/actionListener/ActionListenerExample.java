package actionListener;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ActionListenerExample extends Frame implements ActionListener {

	Label lb;
	Button b;
	
	
	public ActionListenerExample() {
		
	this.setVisible(true);
	this.setSize(500,500);
	this.setTitle("Action Listener");
	this.setLayout(null);
	
	//creating Label
	lb = new Label();
	lb.setBounds(100, 100, 300, 20);
	
	//creating Button
	b = new Button("Click Here");
	b.setBounds(200, 200, 60, 30);
	
	//adding these components to the frame
	
	this.add(lb);
	this.add(b);
	
	//register button with ActionListener
	
	b.addActionListener(this);
	
	//window Closing
	
	this.addWindowListener(new WindowAdapter() {
	
		@Override
		public void windowClosing(WindowEvent e) {
			
			System.exit(0);
			
		}
	});

	}
	
	 @Override
	public void actionPerformed(ActionEvent e) {
		Font f = new Font("consolas", Font.BOLD, 20);
		lb.setFont(f);
		lb.setText("Welcome to ActionListener");
		
	}
	
	public static void main(String[] args) {
		ActionListenerExample ace = new ActionListenerExample();
	}

}
