package admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import main.*;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class AdminAddNewBook extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAuthorName;
	private JTextField textFieldAuthorEmail;
	private JTextField textFieldAuthorGender;
	private JTextField textFieldAuthorAge;
	private JTextField textFieldBookName;
	private JTextField textFieldBookPrice;
	private JTextField textFieldBookDiscount;
	private JTextField textFieldBookGenre;
	private JTextField textFieldBookSubGenre;
	private JTextField textFieldBookIsbn;
	private JTextField textFieldBookYearOfPublish;

	private Author author = null;
	private Book book = null;
	private BookCollection bookCollection = new BookCollection();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddNewBook frame = new AdminAddNewBook();
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
	public AdminAddNewBook() {
		setTitle("ADD NEW BOOK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBorder(new LineBorder(new Color(153, 0, 204), 2, true));
		panel.setBounds(10, 11, 812, 421);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(102, 0, 102), 2, true));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(10, 11, 393, 256);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblAuthorInformation = new JLabel("AUTHOR INFORMATION");
		lblAuthorInformation.setBounds(75, 11, 205, 20);
		panel_1.add(lblAuthorInformation);
		lblAuthorInformation.setForeground(new Color(102, 0, 204));
		lblAuthorInformation.setFont(new Font("Tahoma", Font.BOLD, 16));

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(63, 42, 222, 2);
		panel_1.add(separator);

		JLabel lblAuthorName = new JLabel("NAME");
		lblAuthorName.setForeground(new Color(0, 0, 0));
		lblAuthorName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAuthorName.setBounds(10, 70, 61, 21);
		panel_1.add(lblAuthorName);

		textFieldAuthorName = new JTextField();
		textFieldAuthorName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldAuthorName.setBounds(75, 68, 308, 26);
		panel_1.add(textFieldAuthorName);
		textFieldAuthorName.setColumns(10);

		JLabel lblAuthorEmail = new JLabel("EMAIL");
		lblAuthorEmail.setForeground(Color.BLACK);
		lblAuthorEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAuthorEmail.setBounds(10, 118, 61, 21);
		panel_1.add(lblAuthorEmail);

		textFieldAuthorEmail = new JTextField();
		textFieldAuthorEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldAuthorEmail.setColumns(10);
		textFieldAuthorEmail.setBounds(75, 116, 283, 26);
		panel_1.add(textFieldAuthorEmail);

		JLabel lblAuthorGender = new JLabel("GENDER");
		lblAuthorGender.setForeground(Color.BLACK);
		lblAuthorGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAuthorGender.setBounds(10, 164, 79, 21);
		panel_1.add(lblAuthorGender);

		textFieldAuthorGender = new JTextField();
		textFieldAuthorGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldAuthorGender.setEditable(false);

		textFieldAuthorGender.setBounds(89, 160, 103, 26);
		panel_1.add(textFieldAuthorGender);
		textFieldAuthorGender.setColumns(10);

		JLabel lblAuthorAge = new JLabel("AGE");
		lblAuthorAge.setForeground(Color.BLACK);
		lblAuthorAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAuthorAge.setBounds(10, 208, 45, 21);
		panel_1.add(lblAuthorAge);

		textFieldAuthorAge = new JTextField();
		textFieldAuthorAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldAuthorAge.setColumns(10);
		textFieldAuthorAge.setBounds(75, 206, 61, 26);
		panel_1.add(textFieldAuthorAge);

		JComboBox comboBoxAuthorGender = new JComboBox();
		comboBoxAuthorGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAuthorGender.setText(comboBoxAuthorGender.getSelectedItem().toString());
			}
		});
		String[] gen= {"male", "female"};
		comboBoxAuthorGender.setModel(new DefaultComboBoxModel(gen));
		comboBoxAuthorGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxAuthorGender.setForeground(Color.BLACK);
		comboBoxAuthorGender.setBackground(Color.WHITE);
		comboBoxAuthorGender.setBounds(220, 161, 84, 26);
		panel_1.add(comboBoxAuthorGender);
		
		textFieldAuthorGender.setText(gen[comboBoxAuthorGender.getSelectedIndex()]);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(102, 0, 102), 2, true));
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setBounds(409, 11, 393, 399);
		panel.add(panel_2);

		JLabel lblBookInformation = new JLabel("BOOK INFORMATION");
		lblBookInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookInformation.setForeground(new Color(102, 0, 204));
		lblBookInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBookInformation.setBounds(88, 11, 205, 20);
		panel_2.add(lblBookInformation);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(86, 42, 207, 2);
		panel_2.add(separator_1);

		JLabel lblBookName = new JLabel("NAME");
		lblBookName.setForeground(Color.BLACK);
		lblBookName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookName.setBounds(10, 70, 61, 21);
		panel_2.add(lblBookName);

		textFieldBookName = new JTextField();
		textFieldBookName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBookName.setColumns(10);
		textFieldBookName.setBounds(75, 68, 308, 26);
		panel_2.add(textFieldBookName);

		JLabel lblBookPrice = new JLabel("PRICE");
		lblBookPrice.setForeground(Color.BLACK);
		lblBookPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookPrice.setBounds(10, 118, 61, 21);
		panel_2.add(lblBookPrice);

		textFieldBookPrice = new JTextField();
		textFieldBookPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBookPrice.setColumns(10);
		textFieldBookPrice.setBounds(75, 116, 103, 26);
		panel_2.add(textFieldBookPrice);

		JLabel lblBookDiscount = new JLabel("DISCOUNT");
		lblBookDiscount.setForeground(Color.BLACK);
		lblBookDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookDiscount.setBounds(10, 164, 103, 21);
		panel_2.add(lblBookDiscount);

		textFieldBookDiscount = new JTextField();
		textFieldBookDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBookDiscount.setColumns(10);
		textFieldBookDiscount.setBounds(117, 162, 103, 26);
		panel_2.add(textFieldBookDiscount);

		JLabel lblBookGenre = new JLabel("GENRE");
		lblBookGenre.setForeground(Color.BLACK);
		lblBookGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookGenre.setBounds(10, 213, 61, 21);
		panel_2.add(lblBookGenre);

		textFieldBookGenre = new JTextField();
		textFieldBookGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBookGenre.setColumns(10);
		textFieldBookGenre.setBounds(74, 211, 126, 26);
		textFieldBookGenre.setEditable(false);
		panel_2.add(textFieldBookGenre);
	

		JComboBox comboBoxBookGenre = new JComboBox();
		comboBoxBookGenre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldBookGenre.setText(comboBoxBookGenre.getSelectedItem().toString());
			}
		});
		String[] bookgen= {"Fiction", "Adventure", "Thriller",  "Fantasy",  "Horror",  "Romance"};
		comboBoxBookGenre.setModel(new DefaultComboBoxModel(bookgen));
		comboBoxBookGenre.setForeground(Color.BLACK);
		comboBoxBookGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxBookGenre.setBackground(Color.WHITE);
		comboBoxBookGenre.setBounds(232, 211, 113, 26);
		panel_2.add(comboBoxBookGenre);
		textFieldBookGenre.setText(bookgen[comboBoxBookGenre.getSelectedIndex()]);

		JLabel lblBookSubGenre = new JLabel("SUB GENRE");
		lblBookSubGenre.setForeground(Color.BLACK);
		lblBookSubGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookSubGenre.setBounds(10, 266, 92, 21);
		panel_2.add(lblBookSubGenre);

		textFieldBookSubGenre = new JTextField();
		textFieldBookSubGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBookSubGenre.setColumns(10);
		textFieldBookSubGenre.setBounds(108, 263, 126, 26);
		panel_2.add(textFieldBookSubGenre);

		JLabel lblBookIsbn = new JLabel("ISBN");
		lblBookIsbn.setForeground(Color.BLACK);
		lblBookIsbn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookIsbn.setBounds(10, 318, 42, 21);
		panel_2.add(lblBookIsbn);

		textFieldBookIsbn = new JTextField();
		textFieldBookIsbn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBookIsbn.setColumns(10);
		textFieldBookIsbn.setBounds(56, 315, 191, 26);
		panel_2.add(textFieldBookIsbn);

		JLabel lblBookYearOfPublish = new JLabel("YEAR OF PUBLISH");
		lblBookYearOfPublish.setForeground(Color.BLACK);
		lblBookYearOfPublish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookYearOfPublish.setBounds(10, 367, 141, 21);
		panel_2.add(lblBookYearOfPublish);

		textFieldBookYearOfPublish = new JTextField();
		textFieldBookYearOfPublish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBookYearOfPublish.setColumns(10);
		textFieldBookYearOfPublish.setBounds(161, 362, 92, 26);
		panel_2.add(textFieldBookYearOfPublish);

		JButton btnAddBookToCollection = new JButton("ADD BOOK TO COLLECTION");
		btnAddBookToCollection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String authorName = textFieldAuthorName.getText();
				String authorEmail = textFieldAuthorEmail.getText();
				String authorGender = textFieldAuthorGender.getText();
				int authorAge = Integer.parseInt(textFieldAuthorAge.getText());

				String bookName = textFieldBookName.getText();
		
				double price = Double.parseDouble(textFieldBookPrice.getText());
				Author author = new Author(authorName, authorEmail, authorAge, authorGender);
				double discount = Double.parseDouble(textFieldBookDiscount.getText());
				Genre genre;
				String subGenre = textFieldBookSubGenre.getText();
				String isbn = textFieldBookIsbn.getText();
				int yearOfPublish = Integer.parseInt(textFieldBookYearOfPublish.getText());

				
				String[] bookgen= {"Fiction", "Adventure", "Thriller",  "Fantasy",  "Horror",  "Romance"};
				if(textFieldBookGenre.getText().equals("Fiction")) {
					genre = new Fiction(subGenre);
				}else if(textFieldBookGenre.getText().equals("Adventure")) {
					genre = new Adventure(subGenre);
				}else if(textFieldBookGenre.getText().equals("Thriller")) {
					genre = new Thriller(subGenre);
				}else if(textFieldBookGenre.getText().equals("Fantasy")) {
					genre = new Fantasy(subGenre);
				}else if(textFieldBookGenre.getText().equals("Horror")) {
					genre = new Horror(subGenre);
				}else
				{
					genre = new Romance(subGenre);
				}
			
				
				book = new Book(bookName, price, author, discount, genre, isbn, yearOfPublish);
					
				bookCollection.fillBooks();
				bookCollection.addBook(book);

				
				bookCollection.saveBooks();
				
				
				textFieldAuthorName.setText(null);
				textFieldAuthorEmail.setText(null);
				comboBoxAuthorGender.setSelectedIndex(0);
				textFieldAuthorGender.setText("male");
				textFieldAuthorAge.setText(null);
				textFieldBookName.setText(null);
				textFieldBookPrice.setText(null);
				textFieldBookDiscount.setText(null);
				comboBoxBookGenre.setSelectedIndex(0);
				textFieldBookGenre.setText("Fiction");
				textFieldBookSubGenre.setText(null);
				textFieldBookIsbn.setText(null);
				textFieldBookYearOfPublish.setText(null);

			}
		});
		btnAddBookToCollection.setBackground(UIManager.getColor("Button.background"));
		btnAddBookToCollection.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddBookToCollection.setBounds(60, 297, 264, 29);
		panel.add(btnAddBookToCollection);

		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdminPanelWindow adminPanel = new AdminPanelWindow();
				adminPanel.setVisible(true);
			}
		});
		btnGoBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGoBack.setBackground(UIManager.getColor("Button.background"));
		btnGoBack.setBounds(60, 347, 264, 29);
		panel.add(btnGoBack);
	}
}
