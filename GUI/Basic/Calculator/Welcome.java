import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	private JFrame frame;
	private JPanel panel, panel_1, panel_2;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
                             
                                        
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public Welcome() {

		frame = new JFrame();
		frame.setTitle("Simple Calculator");
		frame.getContentPane().setBackground(new Color(51, 225, 0));
		frame.setBounds(350, 350, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(0, 204, 153));
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel.setBounds(26, 10, 495, 341);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 51), 2, true));
		panel_1.setBounds(10, 11, 473, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);

		label = new JLabel("Welcome Screen");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(204, 0, 153));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(84, 11, 238, 29);
		panel_1.add(label);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(204, 51, 204), 2, true));
		panel_2.setBounds(10, 71, 473, 214);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton btnGoToSimple = new JButton("Go To Simple Calculator");
		btnGoToSimple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Calculator c = new Calculator();
				c.setVisible(true);
			}
		});

		btnGoToSimple.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoToSimple.setBackground(UIManager.getColor("Button.background"));
		btnGoToSimple.setForeground(new Color(204, 0, 153));
		btnGoToSimple.setBounds(36, 122, 383, 31);
		panel_2.add(btnGoToSimple);
	}

}
