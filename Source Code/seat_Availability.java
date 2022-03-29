import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;

public class seat_Availability extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seat_Availability frame = new seat_Availability();
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
	public seat_Availability() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Train Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(42, 93, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("No Of Seats Available");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(42, 229, 141, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Waiting List");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(42, 254, 92, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number Of Passengers");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(40, 300, 172, 25);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(275, 92, 201, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 228, 87, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(275, 260, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Class");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(42, 135, 61, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(276, 304, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ticket price");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(598, 118, 71, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("tax");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(598, 165, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Total cost");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(598, 213, 71, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(713, 115, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(713, 165, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(713, 210, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("Click here to enter the details");
		btnNewButton.setForeground(new Color(255, 255, 51));
		btnNewButton.setBackground(new Color(51, 102, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(424, 393, 201, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Previous Page");
		btnNewButton_1.setForeground(new Color(255, 255, 51));
		btnNewButton_1.setBackground(new Color(51, 102, 0));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Travel_train train1 = new Travel_train();
				train1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(713, 393, 125, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("Online Railway Reservation System");
		lblNewLabel_10.setForeground(new Color(51, 102, 0));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(10, 0, 898, 55);
		contentPane.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(275, 134, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Quota");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(42, 176, 46, 25);
		contentPane.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(276, 180, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
