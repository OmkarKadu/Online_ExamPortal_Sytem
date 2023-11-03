package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PanelCreateNewTestAdmin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTestName;
	private JTextField textField;
	private JTextField txtDuration;
	private JTextField textField_1;


	public PanelCreateNewTestAdmin() {
		setSize(1238,653);
		setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(46, 61, 176));
		panel_4.setBounds(0, 0, 1238, 47);
		add(panel_4);

		JLabel lblNewLabel_1 = new JLabel("Manage Test -  Create New Test");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(420, 10, 398, 27);
		panel_4.add(lblNewLabel_1);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(46, 61, 176));
		panel_4_1.setBounds(0, 628, 1238, 25);
		add(panel_4_1);

		JLabel lblCopyrightseducation = new JLabel("Copyrights 2022 @Education Centre");
		lblCopyrightseducation.setBounds(410, 0, 418, 25);
		panel_4_1.add(lblCopyrightseducation);
		lblCopyrightseducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyrightseducation.setForeground(Color.WHITE);
		lblCopyrightseducation.setFont(new Font("Dialog", Font.BOLD, 15));

		JLabel lblTestName = new JLabel("Test Name : ");
		lblTestName.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblTestName.setBounds(41, 76, 134, 25);
		add(lblTestName);

		txtTestName = new JTextField();
		txtTestName.setBackground(new Color(192, 192, 192));
		txtTestName.setBounds(210, 76, 220, 25);
		add(txtTestName);
		txtTestName.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.setFont(new Font("Dialog", Font.BOLD, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Java\t\t\t\t\t", "Python", "C++"}));
		comboBox.setBounds(825, 75, 220, 27);
		add(comboBox);

		JLabel lblSubject = new JLabel("Subject : ");
		lblSubject.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSubject.setBounds(648, 76, 134, 25);
		add(lblSubject);

		JLabel lblNumberOfQuestions = new JLabel("No. of Ques : ");
		lblNumberOfQuestions.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblNumberOfQuestions.setBounds(41, 142, 141, 25);
		add(lblNumberOfQuestions);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(210, 142, 220, 25);
		add(textField);

		JLabel lblDuration = new JLabel("Duration : ");
		lblDuration.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblDuration.setBounds(648, 142, 134, 25);
		add(lblDuration);

		txtDuration = new JTextField();
		txtDuration.setColumns(10);
		txtDuration.setBackground(Color.LIGHT_GRAY);
		txtDuration.setBounds(825, 142, 220, 25);
		add(txtDuration);

		JRadioButton radiobtnRandomQuesSet = new JRadioButton("Random Set");
		radiobtnRandomQuesSet.setFont(new Font("Dialog", Font.BOLD, 17));
		radiobtnRandomQuesSet.setBounds(211, 208, 125, 25);
		add(radiobtnRandomQuesSet);

		JRadioButton radiobtnCustomiseQuesSet = new JRadioButton("Custom Set");
		radiobtnCustomiseQuesSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("In Custom Set ActionPerformed");


			}
		});
		radiobtnCustomiseQuesSet.setFont(new Font("Dialog", Font.BOLD, 17));
		radiobtnCustomiseQuesSet.setBounds(338, 208, 125, 25);
		add(radiobtnCustomiseQuesSet);

		JLabel lblQuesSet = new JLabel("Ques. Set : ");
		lblQuesSet.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblQuesSet.setBounds(41, 208, 134, 25);
		add(lblQuesSet);

		JLabel lblMarks = new JLabel("Marks : ");
		lblMarks.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblMarks.setBounds(648, 207, 141, 25);
		add(lblMarks);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(825, 208, 220, 25);
		add(textField_1);

		JLabel lblInstructions = new JLabel("Instructions : ");
		lblInstructions.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblInstructions.setBounds(41, 267, 154, 25);
		add(lblInstructions);

		JTextArea txtrbeginByCarefully = new JTextArea();
		txtrbeginByCarefully.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrbeginByCarefully.setBackground(new Color(192, 192, 192));
		txtrbeginByCarefully.setText("1.Begin by carefully reading all the instructions provided on the computer screen.\r\n2.Note the time limit for the exam. Ensure you are aware of when the exam will end.\r\n3.Check the total number of questions in the exam so that you can manage your time accordingly.\r\n4.Understand the format of the questions. Are they single-choice (choose one correct answer) or multiple\r\n-choice (choose multiple correct answers)?\r\n5.Unattempated Questions will be indicated by red colour and attempated questions will be indicated by\r\n green colour.");
		txtrbeginByCarefully.setBounds(210, 271, 835, 245);
		add(txtrbeginByCarefully);

		JButton btnNewButton = new JButton("Back ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

				PanelExamAdmin.panelbtnCreateTest.setVisible(true);
				PanelExamAdmin.panelBtnDeployTest.setVisible(true);
				PanelExamAdmin.panelbtnAddQuestions.setVisible(true);
				PanelExamAdmin.panelBtnBlank.setVisible(true);	
			}
		});
		btnNewButton.setBackground(new Color(230, 0, 0));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(250, 563, 112, 37);
		add(btnNewButton);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(17, 89, 238));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnClear.setBounds(550, 563, 112, 37);
		add(btnClear);

		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(0, 255, 0));
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnSave.setBounds(850, 563, 112, 37);
		add(btnSave);





	}
}
