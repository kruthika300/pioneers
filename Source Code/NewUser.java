import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
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
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Railway Reseravtion System");
		lblNewLabel.setForeground(new Color(51, 102, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 0, 908, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(150, 94, 91, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gmail ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(151, 133, 90, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(151, 166, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(151, 202, 136, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PhoneNo");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(151, 234, 103, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(151, 268, 73, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Age");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(151, 293, 46, 28);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(313, 100, 287, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(313, 133, 287, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(313, 165, 287, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(313, 201, 287, 20);
		contentPane.add(passwordField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 233, 287, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(313, 299, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		Button button = new Button("REGISTER");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(button,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					
					String Full_Name=textField.getText();
					String Gmail_ID=textField_1.getText();
					String passwor = passwordField.getText();
					String Confirm_password= passwordField_1.getText();
					String Phone = textField_2.getText();
					String gender="Male";
					//if(rdbtnNewRadioButton_1.isSelected()) {
						//gender="Female";
					//}
				   	int age=12;
					int j=0;
					Connection con=null;
				
					try{
						System.out.println("add");
						
						Class.forName("org.postgresql.Driver");
						
						
						con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SEproject",
							       "postgres", " sruthisubha23");
						
						PreparedStatement st=(PreparedStatement) con.prepareStatement("INSERT INTO SEproject(Full Name,Gmail ID,Password,Confirm Password,PhoneNo,Gender,Age) values(?,?,?,?,?,?,?)");

						st.setString(1, Full_Name);
						st.setString(2, Gmail_ID);
						st.setString(3, passwor);
						st.setString(4, Confirm_password);
						st.setString(5,Phone);
						st.setString(6, gender);
						st.setInt(7, age);
						
						
						j=st.executeUpdate();
						
					}
					catch(Exception w1)
					{
					System.out.println(w1);	
					}
					
					int i = 0;
					if(j==1)
					{
						String n="\n";
						
						
						JOptionPane.showMessageDialog(button,"Congratulations,"+n+"Events is added sucessfully"+n+"Thankyou.");
					}
					else
					{

						JOptionPane.showMessageDialog(button,"Please,enter the informations");
					}
				}
				
			
			}
		});
		button.setForeground(new Color(255, 255, 51));
		button.setBackground(new Color(51, 102, 51));
		
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.setBounds(313, 366, 127, 22);
		contentPane.add(button);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.setBounds(316, 266, 91, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		rdbtnNewRadioButton_1.setBounds(435, 266, 86, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("New User Registeration");
		lblNewLabel_8.setForeground(new Color(204, 153, 153));
		lblNewLabel_8.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(10, 55, 908, 34);
		contentPane.add(lblNewLabel_8);
	}
}
