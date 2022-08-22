package welcome;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import admin.AdminLoginWindow;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeWindow {

	private JFrame frmHomepage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow window = new WelcomeWindow();
					window.frmHomepage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomepage = new JFrame();
		frmHomepage.setTitle("HOMEPAGE");
		frmHomepage.setBackground(Color.CYAN);
		frmHomepage.setBounds(100, 100, 501, 321);
		frmHomepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomepage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new LineBorder(new Color(0, 204, 255), 2, true));
		panel.setBounds(0, 0, 485, 282);
		frmHomepage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 153));
		panel_1.setBorder(new LineBorder(new Color(0, 204, 51), 2, true));
		panel_1.setBounds(10, 11, 465, 63);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNsuBookShop = new JLabel("NSU BOOK SHOP");
		lblNsuBookShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblNsuBookShop.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNsuBookShop.setBounds(103, 11, 271, 41);
		panel_1.add(lblNsuBookShop);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_2.setBackground(new Color(153, 204, 102));
		panel_2.setBounds(10, 85, 465, 186);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAdminLogin = new JButton("ADMIN LOGIN");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHomepage.dispose();
				AdminLoginWindow adminLogin = new AdminLoginWindow();
				adminLogin.setVisible(true);
			}
		});
		btnAdminLogin.setForeground(new Color(102, 0, 255));
		btnAdminLogin.setBackground(UIManager.getColor("Button.background"));
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdminLogin.setBounds(130, 44, 195, 31);
		panel_2.add(btnAdminLogin);
		
		JButton btnCashierLogin = new JButton("CASHIER LOGIN");
		btnCashierLogin.setForeground(new Color(102, 0, 255));
		btnCashierLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCashierLogin.setBackground(UIManager.getColor("Button.background"));
		btnCashierLogin.setBounds(130, 97, 195, 31);
		panel_2.add(btnCashierLogin);
	}
}
