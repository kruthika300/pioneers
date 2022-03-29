import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class loginpage1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage1 frame = new loginpage1();
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
	public loginpage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Railway Reservation System");
		lblNewLabel.setBounds(0, 0, 907, 74);
		lblNewLabel.setForeground(new Color(85, 107, 47));
		lblNewLabel.setBackground(new Color(34, 139, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Existing User");
		lblNewLabel_1.setBounds(189, 114, 151, 29);
		lblNewLabel_1.setForeground(new Color(188, 143, 143));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gmail ID");
		lblNewLabel_2.setBounds(152, 172, 151, 29);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(152, 221, 87, 29);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(270, 178, 186, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(270, 227, 186, 20);
		contentPane.add(passwordField);
		
		Button button = new Button("LOGIN");
		button.setBounds(270, 305, 70, 22);
		button.setForeground(new Color(255, 255, 51));
		button.setBackground(new Color(51, 102, 0));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchTrain search = new SearchTrain();
				search.setVisible(true);
				
				
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		contentPane.add(button);
		
		Button button_1 = new Button("Forgot Password");
		button_1.setBounds(391, 305, 121, 22);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		contentPane.add(button_1);
		
		Button button_2 = new Button("New User");
		button_2.setBounds(746, 202, 81, 22);
		button_2.setForeground(new Color(204, 0, 51));
		button_2.setBackground(new Color(255, 204, 255));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewUser newuser = new NewUser();
				newuser.setVisible(true);
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 16));
		contentPane.add(button_2);
		
		JLabel lblNewLabel_4 = new JLabel("Click this if you are new user\r\n");
		lblNewLabel_4.setBounds(590, 137, 205, 29);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setForeground(new Color(147, 112, 219));
		contentPane.add(lblNewLabel_4);
		Image img1 = new ImageIcon(this.getClass().getResource("/curved-arrow-png-transparent-hd-photo.png")).getImage();
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 907, 74);
		lblNewLabel_6.setBackground(new Color(230, 230, 250));
		contentPane.add(lblNewLabel_6);
	}
}
