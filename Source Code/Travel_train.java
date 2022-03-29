import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class Travel_train extends JFrame {

	private JPanel contentPane;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travel_train frame = new Travel_train();
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
	public Travel_train() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Railway Reservation System");
		lblNewLabel.setForeground(new Color(51, 102, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 908, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_9 = new JLabel("From");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(29, 73, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(99, 70, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("To");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(246, 73, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(291, 70, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Date");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(29, 133, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(85, 133, 91, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_12 = new JLabel("Available Train");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(29, 218, 86, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_17 = new JLabel("Quota");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(664, 97, 46, 14);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_19 = new JLabel("Class");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_19.setBounds(664, 161, 46, 14);
		contentPane.add(lblNewLabel_19);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"General ", "Tatkal", "Ladies"}));
		comboBox.setBounds(745, 93, 81, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2A (2 tier)", "3A(3 tier)", "Sleeper"}));
		comboBox_2.setBounds(745, 157, 108, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(158, 216, 272, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Depart Time");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(29, 264, 86, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Arrival Time");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(260, 264, 117, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(128, 263, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(354, 265, 99, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Book Seat");
		btnNewButton.setBackground(new Color(51, 102, 0));
		btnNewButton.setForeground(new Color(255, 255, 51));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_Availability seat = new seat_Availability();
				seat.setVisible(true);
			}
		});
		btnNewButton.setBounds(125, 370, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Previous Page");
		btnNewButton_2.setForeground(new Color(255, 255, 51));
		btnNewButton_2.setBackground(new Color(51, 102, 0));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchTrain train = new SearchTrain();
				train.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(447, 370, 127, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Depart Date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(29, 314, 86, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Arrival Date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(260, 314, 117, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 313, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(354, 315, 99, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
