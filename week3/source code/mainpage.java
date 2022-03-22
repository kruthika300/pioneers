import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JButton;

public class LoginPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 924, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Railway Reservatoin System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(185, 33, 474, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/first image interface.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		Image newImage = img.getScaledInstance(70, 100, Image.SCALE_DEFAULT);
		lblNewLabel_1.setBounds(0, 0, 908, 458);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Click Here To Book Tickets");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(323, 255, 177, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
