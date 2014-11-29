package Calculator;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Keypad extends Frame implements ActionListener {
	
	TextField display;
	

	public Keypad(){
		setTitle("°è»ê±â");
		display = new TextField();
		add(display,"NORTH");
		add(buildKeypanel(),"CENTER");
		
		
		
		
		
		addWindowListener (new WindowAdapter (){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

		
		
		
		private Panel buildKeypanel(){
		
		Panel panel = new Panel();
		
		panel.setLayout(new GridLayout(6,5));
		panel.add(new Button ("MC"));
		panel.add(new Button("MC"));
		panel.add(new Button("MR"));
		panel.add(new Button("MS"));
		panel.add(new Button("M+"));
		panel.add(new Button("M-"));
		
		panel.add(new Button("¡ç"));
		panel.add(new Button("CE"));
		panel.add( new Button("C"));
		panel.add( new Button("¡¾"));
		panel.add( new Button("¡î"));
		
		
		panel.add( new Button("7"));
		panel.add( new Button("8"));
		panel.add(new Button("9"));
		panel.add(new Button("/"));
		panel.add(new Button("%"));
		
		
		panel.add(new Button("4"));
	    panel.add( new Button("5"));
		panel.add( new Button("6"));
		panel.add(new Button("*"));
		panel.add(new Button("1/x"));
		
		
		panel.add( new Button("1"));
		panel.add (new Button("2"));
		panel.add( new Button("3"));
		panel.add( new Button("-"));
		panel.add( new Button("="));
		
		
		
		
		
		panel.add( new Button("0"));
		panel.add(new Button("."));
		panel.add(new Button("+"));
       
        
		
	
	
		return panel;
		
		
}




		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
