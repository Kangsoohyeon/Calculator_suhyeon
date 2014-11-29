package Calculator;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;


public class Keypad extends Frame {

	public Keypad(){
		setTitle("°è»ê±â");
		
		this.setLayout(new BorderLayout());
		Label l = new Label("       0");
		this.add(l,BorderLayout.NORTH);
		
		
		
		
		
		
		Panel p1 = new Panel(new GridLayout(5,5));
		
		
		Button a1 = new Button("MC");
		Button a2 = new Button("MR");
		Button a3 = new Button("MS");
		Button a4 = new Button("M+");
		Button a5 = new Button("M-");
		p1.add(a1);
		p1.add(a2);
		p1.add(a3);
		p1.add(a4);
		p1.add(a5);
		
	
		
		Button b1 = new Button("¡ç");
		Button b2 = new Button("CE");
		Button b3 = new Button("C");
		Button b4 = new Button("¡¾");
		Button b5 = new Button("¡î");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		Button c1 = new Button("7");
		Button c2 = new Button("8");
		Button c3 = new Button("9");
		Button c4 = new Button("/");
		Button c5 = new Button("%");
		p1.add(c1);
		p1.add(c2);
		p1.add(c3);
		p1.add(c4);
		p1.add(c5);
		
		Button d1 = new Button("4");
		Button d2 = new Button("5");
		Button d3 = new Button("6");
		Button d4 = new Button("*");
		Button d5 = new Button("1/x");
		p1.add(d1);
		p1.add(d2);
		p1.add(d3);
		p1.add(d4);
		p1.add(d5);
		
		Button e1 = new Button("1");
		Button e2 = new Button("2");
		Button e3 = new Button("3");
		Button e4 = new Button("-");
		Button e5 = new Button("=");
		p1.add(e1);
		p1.add(e2);
		p1.add(e3);
		p1.add(e4);
		p1.add(e5);
		
		this.add("Center",p1);
		
		Panel p2 = new Panel(new GridLayout(1,3));
		Button f1 = new Button("0");
		Button f2 = new Button(".");
		Button f3 = new Button("+");
        p2.add(f1);
        p2.add(f2);
        p2.add(f3);
        
        this.add("South",p2);
        
        setSize(300,400);
		setVisible(true);
		
		
		
		
		
		
		
	}
}
