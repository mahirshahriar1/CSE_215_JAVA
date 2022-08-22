package admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import main.Book;
import main.BookCollection;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class AdminPanelWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanelWindow frame = new AdminPanelWindow();
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
	public AdminPanelWindow() {
		setTitle("ADMIN PANEL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 102), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new LineBorder(new Color(153, 0, 255), 2, true));
		panel.setBounds(10, 11, 556, 376);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 204));
		panel_1.setBounds(10, 11, 536, 62);
		panel_1.setBorder(new LineBorder(new Color(204, 0, 102), 2, true));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdminPanel = new JLabel("ADMIN PANEL");
		lblAdminPanel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminPanel.setBounds(140, 11, 236, 36);
		panel_1.add(lblAdminPanel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 204, 153));
		panel_2.setBorder(new LineBorder(new Color(204, 0, 204), 2, true));
		panel_2.setBounds(10, 84, 536, 281);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAddNewBook = new JButton("ADD NEW BOOK");
		btnAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminAddNewBook newBookAdd = new AdminAddNewBook();
				newBookAdd.setVisible(true);
			}
		});
		btnAddNewBook.setForeground(new Color(102, 0, 255));
		btnAddNewBook.setBackground(UIManager.getColor("Button.background"));
		btnAddNewBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddNewBook.setBounds(148, 25, 241, 38);
		panel_2.add(btnAddNewBook);
		
		JButton btnManageMyStore = new JButton("MANAGE MY STORE");
		btnManageMyStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				dispose();
				AdminStoreManagement storeManagement = new AdminStoreManagement();
				storeManagement.setVisible(true);
			}
		});
		btnManageMyStore.setForeground(new Color(102, 0, 255));
		btnManageMyStore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnManageMyStore.setBackground(UIManager.getColor("Button.background"));
		btnManageMyStore.setBounds(148, 87, 241, 38);
		panel_2.add(btnManageMyStore);
		
		JButton btnBooksInformation = new JButton("BOOKS INFORMATION");
		btnBooksInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBooksInformation.setForeground(new Color(102, 0, 255));
		btnBooksInformation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBooksInformation.setBackground(UIManager.getColor("Button.background"));
		btnBooksInformation.setBounds(148, 148, 241, 38);
		panel_2.add(btnBooksInformation);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.showConfirmDialog(null, "Are You Sure?", "LOG OUT", JOptionPane.YES_NO_OPTION);
				if(dialogButton == JOptionPane.YES_OPTION) {
					dispose();
					AdminLoginWindow adminLogin = new AdminLoginWindow();
					adminLogin.setVisible(true);
				}	
			}
		});
		btnLogOut.setForeground(new Color(102, 0, 255));
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogOut.setBackground(UIManager.getColor("Button.background"));
		btnLogOut.setBounds(148, 208, 241, 38);
		panel_2.add(btnLogOut);
	}

}
