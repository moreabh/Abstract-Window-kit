package layoutManager;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutWithHgapVgap extends Frame implements ActionListener {

	//Declaration 
			CardLayout card;
			Button b1,b2,b3,b4;
		
		public CardLayoutWithHgapVgap() {
			
			this.setVisible(true);
			this.setSize(500,500);
			this.setTitle("CardLayout Example with Horizontal Gap and Vertical Gap");
			
			//create card layout object with 40 pixel horizontal gap and 30 pixel Vertical gap 
			card = new CardLayout(40,30);
			this.setLayout(card);
			
			//window Closing property
			this.addWindowListener(new WindowAdapter() {
				
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			//creating Font class object 
			Font f = new Font("consolas", Font.BOLD, 30);
			
			//creating Buttons, setting color of button and font of button
			
			b1 = new Button("Button-1");
			b1.setFont(f);
			b1.setBackground(Color.CYAN);
			
			b2 = new Button("Button-2");
			b2.setFont(f);
			b2.setBackground(Color.blue);
			
			b3 = new Button("Button-3");
			b3.setFont(f);
			b3.setBackground(Color.green);
			
			b4 = new Button("Button-4");
			b4.setFont(f);
			b4.setBackground(Color.magenta);
			
			//Register this buttons with Action listener interface
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			
			//Adding all this buttons to the frame
			
			this.add(b1);this.add(b2);
			this.add(b3);this.add(b4);
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			card.next(this);
		
	}
	
	public static void main(String[] args) {
		CardLayoutWithHgapVgap cl = new CardLayoutWithHgapVgap();
	}

}
