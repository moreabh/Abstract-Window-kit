package textArea;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaExample extends Frame  {

	public TextAreaExample() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("TextArea Example");
		this.setLayout(new FlowLayout()); 
		
		Font f = new Font("consolas",Font.BOLD,15);
		Label lb = new Label("Enter Address: ",Label.CENTER);
		lb.setFont(f);
		
		f = new Font("consolas", Font.BOLD,10);
		TextArea ta = new TextArea("Welcome to TextArea");
		ta.setFont(f);
		
		this.add(lb);this.add(ta);
		
		//window closing 
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
	}

	public static void main(String[] args) {
	
		TextAreaExample ta = new  TextAreaExample();
	}

}
