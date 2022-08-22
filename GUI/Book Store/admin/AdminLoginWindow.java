package admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import welcome.WelcomeWindow;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AdminLoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginWindow frame = new AdminLoginWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminLoginWindow() {
		setTitle("ADMIN LOGIN");
		setBackground(new Color(240, 255, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 102), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(72, 61, 139), 2, true));
		panel.setBounds(10, 11, 603, 354);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(153, 0, 153), 2, true));
		panel_1.setBackground(new Color(153, 204, 153));
		panel_1.setBounds(10, 11, 583, 63);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdminLogin.setBounds(169, 11, 249, 41);
		panel_1.add(lblAdminLogin);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(102, 153, 153), 2, true));
		panel_2.setBackground(new Color(255, 255, 204));
		panel_2.setBounds(10, 85, 583, 258);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUserName.setBounds(10, 28, 105, 20);
		panel_2.add(lblUserName);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUserName.setBounds(121, 25, 202, 26);
		panel_2.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(10, 73, 105, 20);
		panel_2.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(121, 67, 202, 26);
		panel_2.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 104, 563, 12);
		panel_2.add(separator);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName = textFieldUserName.getText();
				String password = passwordField.getText();
				
				String line;
				String[] values = null;
				
				File file = new File("Admin.txt");
				FileReader fr;
				BufferedReader br;
				
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					while((line = br.readLine()) != null) {
						values = line.split(" ");
					}
				}
				catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
				
				if(userName.equals(values[0]) && password.equals(values[1])) {
					dispose();
					AdminPanelWindow adminPanel = new AdminPanelWindow();
					adminPanel.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid User Name or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
					textFieldUserName.setText(null);
					passwordField.setText(null);
				}
			}
		});
		btnLogin.setForeground(new Color(153, 0, 204));
		btnLogin.setBackground(UIManager.getColor("Button.background"));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(10, 127, 136, 31);
		panel_2.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldUserName.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setForeground(new Color(153, 0, 204));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBackground(UIManager.getColor("Button.background"));
		btnReset.setBounds(226, 127, 136, 31);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.showConfirmDialog(null, "Are You Sure?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(dialogButton == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(153, 0, 204));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBackground(UIManager.getColor("Button.background"));
		btnExit.setBounds(437, 127, 136, 31);
		panel_2.add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(10, 178, 563, 2);
		panel_2.add(separator_1);
		
		JButton btnGoBackTo = new JButton("GO BACK TO WELCOME PAGE");
		btnGoBackTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				WelcomeWindow welcome = new WelcomeWindow();
				welcome.main(null);
			}
		});
		btnGoBackTo.setForeground(new Color(153, 0, 204));
		btnGoBackTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGoBackTo.setBackground(UIManager.getColor("Button.background"));
		btnGoBackTo.setBounds(107, 201, 378, 31);
		panel_2.add(btnGoBackTo);
	}
}
