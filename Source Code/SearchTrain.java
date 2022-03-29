import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class SearchTrain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchTrain frame = new SearchTrain();
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
	public SearchTrain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Railway Reservation System");
		lblNewLabel.setForeground(new Color(51, 102, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 0, 908, 69);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(271, 248, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(504, 248, 137, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(271, 150, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("To");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(268, 197, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"karunagapalli(KPY)", "Ernakulam(ERS)", "Kayankulam(KYJ)", "Secundrabad(SC)", "Kollam(QLN)", "Kacheguda(KCG)", "Begampet(BMT)"}));
		comboBox.setBounds(504, 146, 137, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"karunagapalli(KPY)", "Ernakulam(ERS)", "Kayankulam(KYJ)", "Secundrabad(SC)", "Kollam(QLN)", "Kacheguda(KCG)", "Begampet(BMT)"}));
		comboBox_1.setBounds(504, 193, 137, 22);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Search Train");
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(new Color(204, 204, 51));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Travel_train travel = new Travel_train();
				travel.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(350, 351, 137, 23);
		contentPane.add(btnNewButton);
	}
}
