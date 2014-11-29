package Calculator;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.*;

class Keypad implements ActionListener

{

	Frame frame;
	TextField textfield1;
	TextField textfield2;

	Panel panel1;
	Panel panel2;

	GridLayout grid;

	Button Button;

	String[] strGrid = { "MS", "MR", "MS", "M+", "M-", "7", "8", "9", "/", "4",
			"5", "6", "*", "1", "2", "3", "-", "0", "C", "+", "=" };

	private String first = "";

	private String result = "";

	ArrayList<Integer> ee = new ArrayList<Integer>();

	ArrayList<String> store = new ArrayList<String>();

	public Keypad() {

		frame = new JFrame("계산기");

		panel1 = new Panel();

		panel2 = new Panel();

		textfield2 = new TextField("0");

		textfield1 = new TextField("");

	}

	public void calBut() {

		panel2.setLayout(new BorderLayout());

		panel2.add(BorderLayout.NORTH, textfield1);
		panel2.add(BorderLayout.CENTER, textfield2);

		panel1.setLayout(new GridLayout(6, 5, 6, 6));

		for (int i = 0; i < strGrid.length; i++) {

			Button = new Button(strGrid[i]);

			Button.addActionListener(this);

			Button.setBackground(new Color(241, 244, 249));

			panel1.add(Button);

		}

		frame.add(BorderLayout.NORTH, panel2);

		frame.add(BorderLayout.CENTER, panel1);

		frame.setResizable(false);

		frame.setSize(220, 310);

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		String str = e.getActionCommand();

		String read;

		try {

			if (str != "/" && str != "*" && str != "-" && str != "+"
					&& str != "C" && str != "=" && str != "MS" && str != "MR"
					&& str != "MC" && str != "M+" && str != "M-") {

				textfield2.setText(first);

				textfield2.getText();

				textfield1.setText("");

				textfield1.getText();

				read = textfield2.getText();

				first = read + str;

				textfield2.setText(first);

				textfield2.getText();

			}

			if (str == "/" || str == "*" || str == "-" || str == "+"
					|| str == "=") {

				textfield1.setText(str);

				textfield1.getText();

				ee.add(Integer.parseInt(first));

				first = "";

				store.add(str);
			}

			if (str == "=") {

				int sum = 0;

				sum = ee.get(0);

				for (int a = 0, h = 1; a < ee.size(); a++, h++) {

					int ve = store.size();

					if (ve > 0) {

						ve--;

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

								sum = 0;

							}

						}

					}

				}

				result = sum + "";

				textfield2.setText(result);

				textfield2.getText();

			}

			if (str == "C") {

				first = "";

				textfield2.setText("0");

				textfield2.getText();

				textfield1.setText("");

				textfield1.getText();

				ee.clear();

				store.clear();

			}

		} catch (Exception ex) {

			textfield2.setText("Error 다시입력 C클릭.");

			textfield2.getText();

		}

	}

	public static void main(String[] args)

	{

		Keypad KP = new Keypad();

		KP.calBut();

	}

}
