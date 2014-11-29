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


public class Keypad extends Frame implements ActionListener {
	
	TextField display;
	

	public Keypad(){
		setTitle("°è»ê±â");
		display = new TextField();
		add(display,"North");
		add(buildKeypanel(),"Center");
		
		setSize(300,400);
		setVisible(true);
		
		
		
		addWindowListener (new WindowAdapter (){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

		
		
		
		private Panel buildKeypanel(){
		
		Panel panel = new Panel();
		
		panel.setLayout(new GridLayout(6,5));
		panel.add(new keyButton ("MC"));
		panel.add(new keyButton("MC"));
		panel.add(new keyButton("MR"));
		panel.add(new keyButton("MS"));
		panel.add(new keyButton("M+"));
		panel.add(new keyButton("M-"));
		
		panel.add(new keyButton("¡ç"));
		panel.add(new keyButton("CE"));
		panel.add( new keyButton("C"));
		panel.add( new keyButton("¡¾"));
		panel.add( new keyButton("¡î"));
		
		
		panel.add( new keyButton("7"));
		panel.add( new keyButton("8"));
		panel.add(new keyButton("9"));
		panel.add(new keyButton("/"));
		panel.add(new keyButton("%"));
		
		
		panel.add(new keyButton("4"));
	    panel.add( new keyButton("5"));
		panel.add( new keyButton("6"));
		panel.add(new keyButton("*"));
		panel.add(new keyButton("1/x"));
		
		
		panel.add( new keyButton("1"));
		panel.add (new keyButton("2"));
		panel.add( new keyButton("3"));
		panel.add( new keyButton("-"));
		panel.add( new keyButton("="));
		
		
		
		
		
		panel.add( new keyButton("0"));
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
			if(e.getSource() instanceof Button){
				Button btn = (Button)e.getSource();
				display.setText(display.getText()+btn.getLabel());
				
			}
			
		}
		
		

}
