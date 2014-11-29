package Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Keypad extends Frame implements ActionListener {

	TextField textfield;
	private String first = ""; 

	private String result = ""; 

	ArrayList<Double> ee = new ArrayList<Double>();

	ArrayList<String> store = new ArrayList<String>(); 

	public Keypad() {
		setTitle("°è»ê±â");
		textfield = new TextField("");
		add(textfield, "North");
		add(buildKeypanel(), "Center");

		setSize(300, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	private Panel buildKeypanel() {

		Panel panel = new Panel();

		panel.setLayout(new GridLayout(6, 5));

		panel.add(new keyButton("MC"));
		panel.add(new keyButton("MR"));
		panel.add(new keyButton("MS"));
		panel.add(new keyButton("M+"));
		panel.add(new keyButton("M-"));

		panel.add(new keyButton("¡ç"));
		panel.add(new keyButton("CE"));
		panel.add(new keyButton("C"));
		panel.add(new keyButton("¡¾"));
		panel.add(new keyButton("¡î"));

		panel.add(new keyButton("7"));
		panel.add(new keyButton("8"));
		panel.add(new keyButton("9"));
		panel.add(new keyButton("/"));
		panel.add(new keyButton("%"));

		panel.add(new keyButton("4"));
		panel.add(new keyButton("5"));
		panel.add(new keyButton("6"));
		panel.add(new keyButton("*"));
		panel.add(new keyButton("1/x"));

		panel.add(new keyButton("1"));
		panel.add(new keyButton("2"));
		panel.add(new keyButton("3"));
		panel.add(new keyButton("-"));
		panel.add(new keyButton("="));

		panel.add(new keyButton("0"));
		panel.add(new keyButton("."));
		panel.add(new keyButton("+"));

		return panel;

	}

	class keyButton extends Button {

		public keyButton(String label) {
			super(label);
			addActionListener(Keypad.this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	   String str = e.getActionCommand();
	   String read;
	   
		   
	   
	   if(str=="1" && str=="2" && str=="3" && str=="4" && str=="5" && str=="6" && str=="7" 
			   && str=="8" && str=="9" && str=="0"){
		   textfield.setText(first);
		   textfield.getText();
		   textfield.setText("");
		   textfield.getText();
		   read=textfield.getText();
		   first=read+str;
		   textfield.setText(first);
		   textfield.getText();
		   
		   
		   
	   }  
	   
	

	}
	
	

}

