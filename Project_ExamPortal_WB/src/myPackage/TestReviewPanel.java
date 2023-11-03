package myPackage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TestReviewPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public TestReviewPanel() {
		setSize(619,327);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Test Name : ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(27, 66, 105, 21);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Test Code : ");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(332, 66, 105, 21);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Atmpted Ques. : ");
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(27, 153, 131, 21);
		add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(175, 67, 124, 19);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(447, 69, 124, 19);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(175, 153, 124, 19);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 239, 124, 19);
		add(textField_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Total Ques. : ");
		lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(27, 240, 131, 21);
		add(lblNewLabel_2_2_1);
		
		JButton btnEndTest = new JButton("End Test");
		btnEndTest.setBackground(new Color(255, 0, 0));
		btnEndTest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEndTest.setBounds(447, 284, 108, 33);
		add(btnEndTest);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(TestReviewPanel.class.getResource("/images/Test1.jpg")));
		btnNewButton.setBounds(344, 109, 248, 155);
		add(btnNewButton);

	}

}
