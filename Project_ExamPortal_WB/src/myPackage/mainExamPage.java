package myPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class mainExamPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainExamPage window = new mainExamPage();
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
	public mainExamPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(202, 223, 255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frame.setSize(width, height);
		frame.getContentPane().setLayout(null);
		System.out.println(width);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(202, 223, 255));
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(new Color(0, 128, 255));;
			}
		});
		panel.setBounds(66, 366, 916, 58);
		frame.getContentPane().add(panel);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(0, 128, 255));
		panelTitle.setBounds(0, 0, 1522, 80);
		frame.getContentPane().add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblExamUniversity = new JLabel("● N Infinity Info Solutions ●");
		lblExamUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		lblExamUniversity.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblExamUniversity.setForeground(new Color(0, 0, 0));
		lblExamUniversity.setBounds(389, 10, 743, 31);
		panelTitle.add(lblExamUniversity);
		
		JLabel lblExamType = new JLabel("End Sem Exam 2022-23 If You want to take the exam then Go ahead");
		lblExamType.setHorizontalAlignment(SwingConstants.CENTER);
		lblExamType.setForeground(new Color(255, 255, 255));
		lblExamType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblExamType.setBounds(288, 55, 945, 19);
		panelTitle.add(lblExamType);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(389, 45, 743, 2);
		panelTitle.add(separator_1);
		
		JPanel panelQuestions = new JPanel();
		panelQuestions.setBounds(1082, 120, 442, 711);
		frame.getContentPane().add(panelQuestions);
		panelQuestions.setLayout(null);
		
		JButton btn01 = new JButton("New button");
		btn01.setBackground(new Color(207, 207, 207));
		btn01.setBounds(10, 75, 44, 44);
		panelQuestions.add(btn01);
		
		JButton btn02 = new JButton("New button");
		btn02.setBackground(new Color(207, 207, 207));
		btn02.setBounds(64, 75, 44, 44);
		panelQuestions.add(btn02);
		
		JButton btn03 = new JButton("New button");
		btn03.setBackground(new Color(207, 207, 207));
		btn03.setBounds(118, 75, 44, 44);
		panelQuestions.add(btn03);
		
		JButton btn04 = new JButton("New button");
		btn04.setBackground(new Color(207, 207, 207));
		btn04.setBounds(172, 75, 44, 44);
		panelQuestions.add(btn04);
		
		JButton btn05 = new JButton("New button");
		btn05.setBackground(new Color(207, 207, 207));
		btn05.setBounds(226, 75, 44, 44);
		panelQuestions.add(btn05);
		
		JButton btn06 = new JButton("New button");
		btn06.setBackground(new Color(207, 207, 207));
		btn06.setBounds(280, 75, 44, 44);
		panelQuestions.add(btn06);
		
		JButton btn07 = new JButton("New button");
		btn07.setBackground(new Color(207, 207, 207));
		btn07.setBounds(334, 75, 44, 44);
		panelQuestions.add(btn07);
		
		JButton btn08 = new JButton("New button");
		btn08.setBackground(new Color(207, 207, 207));
		btn08.setBounds(388, 75, 44, 44);
		panelQuestions.add(btn08);
		
		JButton btn09 = new JButton("New button");
		btn09.setBackground(new Color(207, 207, 207));
		btn09.setBounds(10, 129, 44, 44);
		panelQuestions.add(btn09);
		
		JButton btn10 = new JButton("New button");
		btn10.setBackground(new Color(207, 207, 207));
		btn10.setBounds(64, 129, 44, 44);
		panelQuestions.add(btn10);
		
		JButton btn11 = new JButton("New button");
		btn11.setBackground(new Color(207, 207, 207));
		btn11.setBounds(118, 129, 44, 44);
		panelQuestions.add(btn11);
		
		JButton btn12 = new JButton("New button");
		btn12.setBackground(new Color(207, 207, 207));
		btn12.setBounds(172, 129, 44, 44);
		panelQuestions.add(btn12);
		
		JButton btn13 = new JButton("New button");
		btn13.setBackground(new Color(207, 207, 207));
		btn13.setBounds(226, 129, 44, 44);
		panelQuestions.add(btn13);
		
		JButton btn14 = new JButton("New button");
		btn14.setBackground(new Color(207, 207, 207));
		btn14.setBounds(280, 129, 44, 44);
		panelQuestions.add(btn14);
		
		JButton btn15 = new JButton("New button");
		btn15.setBackground(new Color(207, 207, 207));
		btn15.setBounds(334, 129, 44, 44);
		panelQuestions.add(btn15);
		
		JButton btn16 = new JButton("New button");
		btn16.setBackground(new Color(207, 207, 207));
		btn16.setBounds(388, 129, 44, 44);
		panelQuestions.add(btn16);
		
		JButton btn17 = new JButton("New button");
		btn17.setBackground(new Color(207, 207, 207));
		btn17.setBounds(10, 183, 44, 44);
		panelQuestions.add(btn17);
		
		JButton btn18 = new JButton("New button");
		btn18.setBackground(new Color(207, 207, 207));
		btn18.setBounds(64, 183, 44, 44);
		panelQuestions.add(btn18);
		
		JButton btn19 = new JButton("New button");
		btn19.setBackground(new Color(207, 207, 207));
		btn19.setBounds(118, 183, 44, 44);
		panelQuestions.add(btn19);
		
		JButton btn20 = new JButton("New button");
		btn20.setBackground(new Color(207, 207, 207));
		btn20.setBounds(172, 183, 44, 44);
		panelQuestions.add(btn20);
		
		JButton btn21 = new JButton("New button");
		btn21.setBackground(new Color(207, 207, 207));
		btn21.setBounds(226, 183, 44, 44);
		panelQuestions.add(btn21);
		
		JButton btn22 = new JButton("New button");
		btn22.setBackground(new Color(207, 207, 207));
		btn22.setBounds(280, 183, 44, 44);
		panelQuestions.add(btn22);
		
		JButton btn23 = new JButton("New button");
		btn23.setBackground(new Color(207, 207, 207));
		btn23.setBounds(334, 183, 44, 44);
		panelQuestions.add(btn23);
		
		JButton btn24 = new JButton("New button");
		btn24.setBackground(new Color(207, 207, 207));
		btn24.setBounds(388, 183, 44, 44);
		panelQuestions.add(btn24);
		
		JButton btn25 = new JButton("New button");
		btn25.setBackground(new Color(207, 207, 207));
		btn25.setBounds(10, 237, 44, 44);
		panelQuestions.add(btn25);
		
		JButton btn26 = new JButton("New button");
		btn26.setBackground(new Color(207, 207, 207));
		btn26.setBounds(64, 237, 44, 44);
		panelQuestions.add(btn26);
		
		JButton btn27 = new JButton("New button");
		btn27.setBackground(new Color(207, 207, 207));
		btn27.setBounds(118, 237, 44, 44);
		panelQuestions.add(btn27);
		
		JButton btn28 = new JButton("New button");
		btn28.setBackground(new Color(207, 207, 207));
		btn28.setBounds(172, 237, 44, 44);
		panelQuestions.add(btn28);
		
		JButton btn29 = new JButton("New button");
		btn29.setBackground(new Color(207, 207, 207));
		btn29.setBounds(226, 237, 44, 44);
		panelQuestions.add(btn29);
		
		JButton btn30 = new JButton("New button");
		btn30.setBackground(new Color(207, 207, 207));
		btn30.setBounds(280, 237, 44, 44);
		panelQuestions.add(btn30);
		
		JButton btn31 = new JButton("New button");
		btn31.setBackground(new Color(207, 207, 207));
		btn31.setBounds(334, 237, 44, 44);
		panelQuestions.add(btn31);
		
		JButton btn32 = new JButton("New button");
		btn32.setBackground(new Color(207, 207, 207));
		btn32.setBounds(388, 237, 44, 44);
		panelQuestions.add(btn32);
		
		JButton btn33 = new JButton("New button");
		btn33.setBackground(new Color(207, 207, 207));
		btn33.setBounds(10, 291, 44, 44);
		panelQuestions.add(btn33);
		
		JButton btn34 = new JButton("New button");
		btn34.setBackground(new Color(207, 207, 207));
		btn34.setBounds(64, 291, 44, 44);
		panelQuestions.add(btn34);
		
		JButton btn35 = new JButton("New button");
		btn35.setBackground(new Color(207, 207, 207));
		btn35.setBounds(118, 291, 44, 44);
		panelQuestions.add(btn35);
		
		JButton btn36 = new JButton("New button");
		btn36.setBackground(new Color(207, 207, 207));
		btn36.setBounds(172, 291, 44, 44);
		panelQuestions.add(btn36);
		
		JButton btn37 = new JButton("New button");
		btn37.setBackground(new Color(207, 207, 207));
		btn37.setBounds(226, 291, 44, 44);
		panelQuestions.add(btn37);
		
		JButton btn38 = new JButton("New button");
		btn38.setBackground(new Color(207, 207, 207));
		btn38.setBounds(280, 291, 44, 44);
		panelQuestions.add(btn38);
		
		JButton btn39 = new JButton("New button");
		btn39.setBackground(new Color(207, 207, 207));
		btn39.setBounds(334, 291, 44, 44);
		panelQuestions.add(btn39);
		
		JButton btn40 = new JButton("New button");
		btn40.setBackground(new Color(207, 207, 207));
		btn40.setBounds(388, 291, 44, 44);
		panelQuestions.add(btn40);
		
		JButton btn41 = new JButton("New button");
		btn41.setBackground(new Color(207, 207, 207));
		btn41.setBounds(10, 345, 44, 44);
		panelQuestions.add(btn41);
		
		JButton btn42 = new JButton("New button");
		btn42.setBackground(new Color(207, 207, 207));
		btn42.setBounds(64, 345, 44, 44);
		panelQuestions.add(btn42);
		
		JButton btn43 = new JButton("New button");
		btn43.setBackground(new Color(207, 207, 207));
		btn43.setBounds(118, 345, 44, 44);
		panelQuestions.add(btn43);
		
		JButton btn44 = new JButton("New button");
		btn44.setBackground(new Color(207, 207, 207));
		btn44.setBounds(172, 345, 44, 44);
		panelQuestions.add(btn44);
		
		JButton btn45 = new JButton("New button");
		btn45.setBackground(new Color(207, 207, 207));
		btn45.setBounds(226, 345, 44, 44);
		panelQuestions.add(btn45);
		
		JButton btn46 = new JButton("New button");
		btn46.setBackground(new Color(207, 207, 207));
		btn46.setBounds(280, 345, 44, 44);
		panelQuestions.add(btn46);
		
		JButton btn47 = new JButton("New button");
		btn47.setBackground(new Color(207, 207, 207));
		btn47.setBounds(334, 345, 44, 44);
		panelQuestions.add(btn47);
		
		JButton btn48 = new JButton("New button");
		btn48.setBackground(new Color(207, 207, 207));
		btn48.setBounds(388, 345, 44, 44);
		panelQuestions.add(btn48);
		
		JButton btn49 = new JButton("New button");
		btn49.setBackground(new Color(207, 207, 207));
		btn49.setBounds(10, 399, 44, 44);
		panelQuestions.add(btn49);
		
		JButton btn50 = new JButton("New button");
		btn50.setBackground(new Color(207, 207, 207));
		btn50.setBounds(64, 399, 44, 44);
		panelQuestions.add(btn50);
		
		JLabel lblNewLabel = new JLabel("Question Palette");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 191, 32);
		panelQuestions.add(lblNewLabel);
		
		JLabel lblChooseAQuestion = new JLabel("Choose a Question");
		lblChooseAQuestion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseAQuestion.setBounds(10, 46, 124, 19);
		panelQuestions.add(lblChooseAQuestion);
		
		JButton btnNotVisited = new JButton("New button");
		btnNotVisited.setBackground(new Color(207, 207, 207));
		btnNotVisited.setBounds(16, 502, 44, 32);
		panelQuestions.add(btnNotVisited);
		
		JLabel lblNewLabel_1 = new JLabel("Not Visited");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(76, 502, 137, 32);
		panelQuestions.add(lblNewLabel_1);
		
		JButton btnNotAnswered = new JButton("New button");
		btnNotAnswered.setBackground(new Color(255, 60, 60));
		btnNotAnswered.setBounds(229, 502, 44, 32);
		panelQuestions.add(btnNotAnswered);
		
		JLabel lblNewLabel_1_2 = new JLabel("Not Answered");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(289, 502, 137, 32);
		panelQuestions.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Bookmark");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(289, 544, 137, 32);
		panelQuestions.add(lblNewLabel_1_2_1);
		
		JButton btnBookmark = new JButton("New button");
		btnBookmark.setBackground(new Color(0, 128, 255));
		btnBookmark.setBounds(229, 544, 44, 32);
		panelQuestions.add(btnBookmark);
		
		JLabel lblNewLabel_1_1 = new JLabel("Answered");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(76, 544, 137, 32);
		panelQuestions.add(lblNewLabel_1_1);
		
		JButton btnAnswered = new JButton("New button");
		btnAnswered.setBackground(new Color(0, 172, 86));
		btnAnswered.setBounds(16, 544, 44, 32);
		panelQuestions.add(btnAnswered);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 474, 422, 2);
		panelQuestions.add(separator);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Subject : ");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_1_1.setBounds(200, 2, 258, 40);
		panelQuestions.add(lblNewLabel_2_1_1_1);
		
		JPanel panelSubtitle = new JPanel();
		panelSubtitle.setBackground(new Color(0, 0, 0));
		panelSubtitle.setBounds(0, 80, 1522, 40);
		frame.getContentPane().add(panelSubtitle);
		panelSubtitle.setLayout(null);
		
		JLabel lblSubject = new JLabel("Subject : ");
		lblSubject.setForeground(Color.WHITE);
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubject.setBounds(10, 10, 192, 20);
		panelSubtitle.add(lblSubject);
		
		JLabel lblTime = new JLabel("Time Left : ");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(1096, 0, 180, 40);
		panelSubtitle.add(lblTime);
		
		JLabel lblUser = new JLabel("  Prasad Sase");
		lblUser.setIcon(new ImageIcon(mainExamPage.class.getResource("/ExamImages/imgUserSmall.jpg")));
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUser.setBounds(1286, 0, 226, 40);
		panelSubtitle.add(lblUser);
		
		JTextArea txtrHowManyConstructors = new JTextArea();
		txtrHowManyConstructors.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtrHowManyConstructors.setText("1)  How many constructors are there in java ?");
		txtrHowManyConstructors.setBackground(new Color(202, 223, 255));
		txtrHowManyConstructors.setBounds(66, 182, 916, 103);
		frame.getContentPane().add(txtrHowManyConstructors);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(202, 223, 255));
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.setBackground(new Color(0, 128, 255));
			}
		});
		panel_1.setBounds(66, 465, 916, 58);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(202, 223, 255));
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setBackground(new Color(0, 128, 255));
			}
		});
		panel_2.setBounds(66, 572, 916, 58);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(202, 223, 255));
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_3.setBackground(new Color(0, 128, 255));
			}
		});
		panel_3.setBounds(66, 670, 916, 58);
		frame.getContentPane().add(panel_3);
	}
}
