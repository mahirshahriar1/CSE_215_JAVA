import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;

	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 0, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 51));
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel.setBounds(10, 11, 610, 391);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 255, 102), 2, true));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(10, 11, 588, 52);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblSimpleCalculator = new JLabel("Simple Calculator");
		lblSimpleCalculator.setForeground(new Color(102, 0, 102));
		lblSimpleCalculator.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSimpleCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleCalculator.setBounds(81, 0, 320, 41);
		panel_1.add(lblSimpleCalculator);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 51), 2, true));
		panel_2.setBackground(new Color(153, 204, 255));
		panel_2.setBounds(10, 74, 588, 312);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblEnterNumber1 = new JLabel("Enter Number 1:");
		lblEnterNumber1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterNumber1.setForeground(new Color(0, 0, 0));
		lblEnterNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNumber1.setBounds(10, 22, 148, 20);
		panel_2.add(lblEnterNumber1);

		JLabel lblEnterNumber2 = new JLabel("Enter Number 2:");
		lblEnterNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNumber2.setForeground(Color.BLACK);
		lblEnterNumber2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterNumber2.setBounds(290, 22, 162, 20);
		panel_2.add(lblEnterNumber2);

		JTextField textFieldNumber1 = new JTextField();
		textFieldNumber1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldNumber1.setBounds(168, 22, 102, 20);
		panel_2.add(textFieldNumber1);
		textFieldNumber1.setColumns(10);

		JTextField textFieldNumber2 = new JTextField();
		textFieldNumber2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldNumber2.setColumns(10);
		textFieldNumber2.setBounds(455, 22, 121, 20);
		panel_2.add(textFieldNumber2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 102));
		panel_3.setBorder(new LineBorder(new Color(153, 51, 51), 2, true));
		panel_3.setBounds(10, 66, 250, 194);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblChooseOperation = new JLabel("Choose Operation");
		lblChooseOperation.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseOperation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseOperation.setBounds(27, 11, 207, 27);
		panel_3.add(lblChooseOperation);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 0, 51));
		separator.setBounds(10, 40, 224, 2);
		panel_3.add(separator);

		JButton btnAdd = new JButton("ADD");
		
		btnAdd.setForeground(new Color(153, 0, 51));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBackground(UIManager.getColor("Button.background"));
		btnAdd.setBounds(52, 49, 138, 23);
		panel_3.add(btnAdd);
                
                JButton btnSUB = new JButton("SUBTRACT");
                btnSUB.setForeground(new Color(153, 0, 51));
		btnSUB.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSUB.setBackground(UIManager.getColor("Button.background"));
		btnSUB.setBounds(52, 84, 138, 23);
		panel_3.add(btnSUB);
                
                
                 JButton btnMUL = new JButton("MULTIPLY");
                btnMUL.setForeground(new Color(153, 0, 51));
		btnMUL.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMUL.setBackground(UIManager.getColor("Button.background"));
		btnMUL.setBounds(52, 119, 138, 23);
		panel_3.add(btnMUL);
                   
                JButton btnDIV = new JButton("DIVIDE");
                btnDIV.setForeground(new Color(153, 0, 51));
		btnDIV.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDIV.setBackground(UIManager.getColor("Button.background"));
		btnDIV.setBounds(52, 154, 138, 23);
		panel_3.add(btnDIV);

                
                JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 204, 204));
		panel_4.setBorder(new LineBorder(new Color(153, 51, 51), 2, true));
		panel_4.setBounds(270, 66, 300, 194);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
                
                JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblResult.setBounds(27, 50, 207, 27);
		panel_4.add(lblResult);
                
                JTextField textFieldNumber3 = new JTextField();
		textFieldNumber3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldNumber3.setBounds(120, 50, 150, 27);
		panel_4.add(textFieldNumber3);
		textFieldNumber3.setColumns(10);
                
                JButton btnClear = new JButton("CLEAR ALL");
                btnClear.setForeground(new Color(153, 0, 51));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBackground(UIManager.getColor("Button.background"));
		btnClear.setBounds(85, 100, 150, 27);
		panel_4.add(btnClear);
                
                 btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldNumber3.setText("");

			}

		});
                
                btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
					result = num1 + num2;
					textFieldNumber3.setText(Double.toString(result));
					JOptionPane.showMessageDialog(null, result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
                
                  btnSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
					result = num1 - num2;
					textFieldNumber3.setText(Double.toString(result));
					JOptionPane.showMessageDialog(null, result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
                    btnMUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
					result = num1 * num2;
					textFieldNumber3.setText(Double.toString(result));
					JOptionPane.showMessageDialog(null, result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
                      btnDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;
				try {
                          
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
                 			if (num2 == 0)
                                            throw new ArithmeticException();
                                        result = num1 / num2;
                                        textFieldNumber3.setText(Double.toString(result));
					JOptionPane.showMessageDialog(null, result);                                       
                                            
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
                
                

	}
}
