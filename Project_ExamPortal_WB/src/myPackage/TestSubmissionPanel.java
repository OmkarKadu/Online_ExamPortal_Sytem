package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class TestSubmissionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtLogo;

	/**
	 * Create the panel.
	 */
	public TestSubmissionPanel() {
		setSize(1238,653);
		setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(46, 61, 176));
		panel_4.setBounds(0, 0, 1238, 75);
		add(panel_4);
		
		JButton btnNewButton = new JButton("Test");
		btnNewButton.setBounds(731, 29, 85, 21);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Test");
		btnNewButton_1.setBounds(851, 29, 85, 21);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Test");
		btnNewButton_2.setBounds(968, 29, 85, 21);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Test");
		btnNewButton_3.setBounds(1081, 29, 85, 21);
		panel_4.add(btnNewButton_3);
		
		txtLogo = new JTextField();
		txtLogo.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtLogo.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogo.setText("Logo");
		txtLogo.setBounds(29, 20, 96, 35);
		panel_4.add(txtLogo);
		txtLogo.setColumns(10);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(46, 61, 176));
		panel_4_1.setBounds(0, 628, 1238, 25);
		add(panel_4_1);
		
		JLabel lblCopyrightseducation = new JLabel("Copyrights 2022 @Education Centre");
		lblCopyrightseducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyrightseducation.setForeground(Color.WHITE);
		lblCopyrightseducation.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCopyrightseducation.setBounds(410, 0, 418, 25);
		panel_4_1.add(lblCopyrightseducation);
		
		JButton btnBackHome = new JButton("Back Home");
		btnBackHome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBackHome.setBounds(356, 564, 108, 33);
		add(btnBackHome);
		
		JButton btnViewTestResult = new JButton("View Result");
		btnViewTestResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnViewTestResult.setBounds(797, 564, 108, 33);
		add(btnViewTestResult);
		
		JLabel lblNewLabel = new JLabel("You have Successfully Submitted the test.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 26));
		lblNewLabel.setBounds(329, 298, 580, 42);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("This is the official Confirmation. Thanks for joining Education Centre.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(366, 350, 505, 67);
		add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(74, 167, 1089, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(74, 458, 1089, 2);
		add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("THANK YOU!!!");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(394, 221, 449, 67);
		add(lblNewLabel_2);

	}

}
