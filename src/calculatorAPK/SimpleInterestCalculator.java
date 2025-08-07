package calculatorAPK;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleInterestCalculator extends Frame implements ActionListener
{
	//Declaration
	 Label plabel,rlabel,tlabel,silabel,alabel;
	 TextField principaltf, ratetf, timetf, sittf, amounttf;
	 Button clear,calculate;
	
	 public SimpleInterestCalculator()
	{
		 this.setVisible(true);
		 this.setTitle("Simple Interest Calculator");
		 this.setSize(500, 500);
		 this.setLayout(null);
	
 //Window Closing
		 
		 this.addWindowListener(new WindowAdapter() {
		
			 @Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		 });
//Creating Font class object
		 Font f = new Font("consolas",Font.BOLD,20);
		 
//Creating Labels 
		 plabel = new Label("Principal ");
		 plabel.setFont(f);
		 plabel.setBounds(50, 50, 100, 30);
		 
		 rlabel = new Label("Rate ");
		 rlabel.setFont(f);
		 rlabel.setBounds(50,100,100,30);
		 
		 tlabel = new Label("Time ");
		 tlabel.setFont(f);
		 tlabel.setBounds(50,150,100,30);
		 
		 silabel = new Label("Simple Interest ");
		 silabel.setFont(f);
		 silabel.setBounds(50, 200, 150, 30);
		 
		 alabel = new Label("Amount ");
		 alabel.setFont(f);
		 alabel.setBounds(50,250,100,30);
		 
//Creating Textfield
		 principaltf = new TextField("Enter Principal");
		 principaltf.setFont(f);
		 principaltf.setBounds(200,50,200,40);
		 
		 ratetf = new TextField("Enter Rate");
		 ratetf.setFont(f);
		 ratetf.setBounds(200, 100, 200, 40);
		 
		 timetf = new TextField("Time in Year");
		 timetf.setFont(f);
		 timetf.setBounds(200, 150, 200, 40);
		 
		 //simple interest textfield
		 //making simple interest uneditable
		 sittf = new TextField();
		 sittf.setEditable(false);
		 sittf.setFont(f);
		 sittf.setBounds(200, 200, 200, 40);
		 
		 //making amount uneditable
		 amounttf = new TextField();
		 amounttf.setEditable(false);
		 amounttf.setFont(f);
		 amounttf.setBounds(200, 250, 200, 40);
		 
//Creating Buttons
		 clear = new Button("Clear");
		 clear.setFont(f);
		 clear.setBounds(50, 350, 100, 40);
		 
		 calculate = new Button("Calculate");
		 calculate.setFont(f);
		 calculate.setBounds(300, 350, 150, 40);
		 
//Adding this GUI component to the frame
		 this.add(alabel);this.add(amounttf);this.add(calculate);
		 this.add(clear);this.add(plabel);this.add(principaltf);
		 this.add(ratetf);this.add(rlabel);this.add(silabel);
		 this.add(sittf);this.add(timetf);this.add(tlabel);
		 
//Register Buttons with the ActionListener interface
		 clear.addActionListener(this);
		 calculate.addActionListener(this);	 
	}
	 
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Button clickButton = (Button)e.getSource();
			
			String clickButtonLabel = clickButton.getLabel();
			
			//if block execute when user click on calculate Button
			
			if(clickButtonLabel.equals("Calculate"))
			{
				//Declaration 
				float p,si,amount;
				int rate,time;
				
				p = Float.parseFloat(principaltf.getText());
				rate = Integer.parseInt(ratetf.getText());
				time = Integer.parseInt(timetf.getText());
				
				//calculating simple interest using formulas
				
				si = (p*rate*time)/100;
				
				sittf.setText(Float.toString(si));
				
				//calculating amount 
				
				amount = p + si;
				amounttf.setText(Float.toString(amount));
			}
			else
			{
				principaltf.setText("");
				ratetf.setText("");
				sittf.setText("");
				amounttf.setText("");
				timetf.setText("");
				
				
			}
			
		}

	public static void main(String[] args) {
		SimpleInterestCalculator sic = new SimpleInterestCalculator();

	}
}
