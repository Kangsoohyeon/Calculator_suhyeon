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
	TextField textfield2;
	private String first = "";

	private String result = "";

	ArrayList<Double> ee = new ArrayList<Double>();

	ArrayList<String> store = new ArrayList<String>();

	public Keypad() {
		
		setTitle("계산기");
		textfield = new TextField("0");
		
		add(textfield2, "North");
		add(textfield,"Center");
		add(buildKeypanel(), "Center");

		setSize(300, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public Panel buildKeypanel() {

		Panel panel = new Panel();
		

		panel.setLayout(new GridLayout(6, 5));

		panel.add(new keyButton("MC"));
		panel.add(new keyButton("MR"));
		panel.add(new keyButton("MS"));
		panel.add(new keyButton("M+"));
		panel.add(new keyButton("M-"));

		panel.add(new keyButton("←"));
		panel.add(new keyButton("CE"));
		panel.add(new keyButton("C"));
		panel.add(new keyButton("±"));
		panel.add(new keyButton("√"));

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
		

		try{
		if (str != "/" && str != "*" && str != "-" && str != "+" && str != "C"
				&& str != "=" && str != "MR" && str != "MC" && str != "MS"
				&& str != "M+" && str != "M-") {
			textfield.setText(first);
			textfield.getText();
			textfield2.setText("");
			textfield2.getText();
			read = textfield.getText();
			first = read + str;
			textfield.setText(first);
			textfield.getText();

		}

		if (str == "+" || str == "-" || str == "*" || str == "/" || str == "MS"
				|| str == "MR" || str == "MC" || str == "M+" || str == "M-") {
			textfield2.setText(str); // 연산자 기호 저장

			textfield2.getText(); // 연산자 기호 출력

			ee.add(Double.parseDouble(first)); // 연산하려는 값 하나씩 ArrayList에 저장

			first = ""; // 다시 누적하도록 초기화

			store.add(str); // 연산자 ArrayList에 저장

		}

		if (str == "=") {

			Double sum = 0.0;

			sum = ee.get(0);

			for (int a = 0, h = 1; a < ee.size(); a++, h++) {
				int ss = store.size();
				if (ss > 0) {

					ss--;

					if (store.get(a) == "+") {

						sum = sum + ee.get(h);

					} else if (store.get(a) == "-") {

						sum = sum - ee.get(h);

					} else if (store.get(a) == "*") {

						sum = sum * ee.get(h);

					} else if (store.get(a) == "/") {

						try {

							sum = sum / ee.get(h);

						} catch (Exception exc) {

							sum = 0.0;

						}

					}

				}

			}

			result = sum + "";

			textfield.setText(result);

			textfield.getText();

		}

		if (str == "C" || str == "CE") {

			first = "";

			textfield.setText("0");

			textfield.getText();
			
			textfield2.setText("");
			
			textfield2.getText();

			ee.clear();

			store.clear();

		}
		}
		 catch (Exception ex) {

				textfield.setText("오류"); // 텍스트창 내용 전부 지우기

				textfield.getText();

			}

	}
}
