package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelRegisterAdmin extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public PanelRegisterAdmin() {
		setBackground(new Color(255, 255, 255));
		setSize(1238,653);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 61, 176));
		panel_1.setBounds(0, 0, 1238, 47);
		add(panel_1);
		
		JLabel lblAdminRegistration = new JLabel("Admin Registration");
		lblAdminRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminRegistration.setForeground(Color.WHITE);
		lblAdminRegistration.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblAdminRegistration.setBackground(Color.WHITE);
		lblAdminRegistration.setBounds(514, 0, 210, 47);
		panel_1.add(lblAdminRegistration);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(46, 61, 176));
		panel_1_1.setBounds(0, 628, 1238, 25);
		add(panel_1_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("Copyrights 2022 @ EDUCATION CENTER");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(442, 0, 353, 25);
		panel_1_1.add(lblNewLabel_2_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBackground(new Color(222, 222, 222));
		textField.setBounds(211, 173, 252, 27);
		add(textField);
		
		JLabel lblName1 = new JLabel("First Name : ");
		lblName1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1.setBounds(50, 170, 138, 30);
		add(lblName1);
		
		JLabel lblUid = new JLabel("Username :");
		lblUid.setHorizontalAlignment(SwingConstants.LEFT);
		lblUid.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblUid.setBounds(50, 77, 125, 30);
		add(lblUid);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(222, 222, 222));
		textField_1.setBounds(211, 80, 252, 27);
		add(textField_1);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblPassword.setBounds(521, 77, 146, 30);
		add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(222, 222, 222));
		textField_2.setBounds(677, 80, 252, 27);
		add(textField_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 141, 1157, 10);
		add(separator);
		
		JLabel lblName1_1 = new JLabel("Last Name : ");
		lblName1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1.setBounds(646, 170, 138, 30);
		add(lblName1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(222, 222, 222));
		textField_3.setBounds(824, 173, 252, 27);
		add(textField_3);
		
		JLabel lblEmailId = new JLabel("Email Id :");
		lblEmailId.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailId.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblEmailId.setBounds(50, 236, 138, 30);
		add(lblEmailId);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(222, 222, 222));
		textField_4.setBounds(211, 239, 252, 27);
		add(textField_4);
		
		JLabel lblName1_1_1 = new JLabel("Mobile :");
		lblName1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1_1.setBounds(646, 236, 138, 30);
		add(lblName1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(222, 222, 222));
		textField_5.setBounds(824, 236, 252, 27);
		add(textField_5);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblGender.setBounds(50, 302, 138, 30);
		add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(211, 311, 65, 21);
		add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(278, 311, 87, 21);
		add(rdbtnFemale);
		
		JRadioButton rdbtnNotToSay = new JRadioButton("Not To Say");
		rdbtnNotToSay.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnNotToSay.setBackground(Color.WHITE);
		rdbtnNotToSay.setBounds(361, 311, 111, 21);
		add(rdbtnNotToSay);
		
		JLabel lblDegree = new JLabel("Qualification :");
		lblDegree.setHorizontalAlignment(SwingConstants.LEFT);
		lblDegree.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDegree.setBounds(646, 302, 155, 30);
		add(lblDegree);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(222, 222, 222));
		textField_6.setBounds(824, 302, 252, 27);
		add(textField_6);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblAddress.setBounds(50, 368, 138, 30);
		add(lblAddress);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(222, 222, 222));
		textField_7.setBounds(211, 371, 252, 27);
		add(textField_7);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		lblState.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblState.setBounds(646, 368, 138, 30);
		add(lblState);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(222, 222, 222));
		textField_8.setBounds(824, 371, 252, 27);
		add(textField_8);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblCity.setBounds(50, 434, 138, 30);
		add(lblCity);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(222, 222, 222));
		textField_9.setBounds(211, 437, 252, 27);
		add(textField_9);
		
		JLabel lblPincode = new JLabel("Pincode :");
		lblPincode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPincode.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblPincode.setBounds(646, 434, 138, 30);
		add(lblPincode);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(222, 222, 222));
		textField_10.setBounds(824, 434, 252, 27);
		add(textField_10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnBack.setBackground(new Color(46, 61, 176));
		btnBack.setBounds(129, 527, 252, 33);
		add(btnBack);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnClear.setBackground(new Color(46, 61, 176));
		btnClear.setBounds(480, 527, 252, 33);
		add(btnClear);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnSubmit.setBackground(new Color(46, 61, 176));
		btnSubmit.setBounds(837, 527, 252, 33);
		add(btnSubmit);

	}
}
