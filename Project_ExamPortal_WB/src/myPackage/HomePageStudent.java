package myPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;

public class HomePageStudent {

	private JFrame frame;
	private PanelRegisterAdmin panelRegisterAdmin;
	private JPanel panelMain; 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageStudent window = new HomePageStudent();
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
	public HomePageStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(58, 160, 209));
		frame.getContentPane().setLayout(null);
		//		frame.setBounds(100, 100, 450, 300);
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;


		frame.setSize(width, height);
		System.out.println(width+"<--width and height-->"+height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(46, 61, 176)));
		panelMenu.setBounds(10, 165, 254, 653);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);

		panelMain = new JPanel();
		panelMain.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(72, 61, 139)));
		panelMain.setBounds(274, 165, 1238, 653);
		panelMain.setLayout(null);
		frame.getContentPane().add(panelMain);
		panelMain.setVisible(true);
				
				JPanel panel_1_1 = new JPanel();
				panel_1_1.setLayout(null);
				panel_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 160), null));
				panel_1_1.setBackground(new Color(88, 139, 233));
				panel_1_1.setBounds(21, 141, 210, 55);
				panelMenu.add(panel_1_1);
				
				JLabel lblDashboard_1_1 = new JLabel("Dashboard");
				lblDashboard_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblDashboard_1_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
				lblDashboard_1_1.setBackground(new Color(221, 160, 221));
				lblDashboard_1_1.setBounds(0, 0, 207, 55);
				panel_1_1.add(lblDashboard_1_1);
				
				JPanel panel_1_3 = new JPanel();
				panel_1_3.setLayout(null);
				panel_1_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 160), null));
				panel_1_3.setBackground(new Color(88, 139, 233));
				panel_1_3.setBounds(21, 217, 210, 55);
				panelMenu.add(panel_1_3);
				
				JLabel lblDashboard_1_2 = new JLabel("Dashboard");
				lblDashboard_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblDashboard_1_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
				lblDashboard_1_2.setBackground(new Color(221, 160, 221));
				lblDashboard_1_2.setBounds(0, 0, 207, 55);
				panel_1_3.add(lblDashboard_1_2);
				
				JPanel panel_1_5 = new JPanel();
				panel_1_5.setLayout(null);
				panel_1_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 160), null));
				panel_1_5.setBackground(new Color(88, 139, 233));
				panel_1_5.setBounds(21, 366, 210, 55);
				panelMenu.add(panel_1_5);
				
				JLabel lblDashboard_1_4 = new JLabel("Dashboard");
				lblDashboard_1_4.setHorizontalAlignment(SwingConstants.CENTER);
				lblDashboard_1_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
				lblDashboard_1_4.setBackground(new Color(221, 160, 221));
				lblDashboard_1_4.setBounds(0, 0, 207, 55);
				panel_1_5.add(lblDashboard_1_4);
				
				JPanel panel_1_4 = new JPanel();
				panel_1_4.setLayout(null);
				panel_1_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 160), null));
				panel_1_4.setBackground(new Color(88, 139, 233));
				panel_1_4.setBounds(21, 290, 210, 55);
				panelMenu.add(panel_1_4);
				
				JLabel lblDashboard_1_3 = new JLabel("Dashboard");
				lblDashboard_1_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblDashboard_1_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
				lblDashboard_1_3.setBackground(new Color(221, 160, 221));
				lblDashboard_1_3.setBounds(0, 0, 207, 55);
				panel_1_4.add(lblDashboard_1_3);
		
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(21, 69, 210, 55);
				panelMenu.add(panel_1);
				panel_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelRegisterAdmin);

					}
				});
				panel_1.setLayout(null);
				panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 160), null));
				panel_1.setBackground(new Color(88, 139, 233));
				
						JLabel lblDashboard_1 = new JLabel("Dashboard");
						lblDashboard_1.setBounds(0, 0, 207, 55);
						panel_1.add(lblDashboard_1);
						lblDashboard_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblDashboard_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
						lblDashboard_1.setBackground(new Color(221, 160, 221));

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(HomePageStudent.class.getResource("/ExamImages/DashBoardPanelBack.jpg")));
		lblNewLabel_3.setBounds(5, 47, 244, 601);
		panelMenu.add(lblNewLabel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(46, 61, 176));
		panel_1_2.setBounds(0, 0, 254, 47);
		panelMenu.add(panel_1_2);
		
		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setBounds(39, 10, 176, 37);
		panel_1_2.add(lblProfile);
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setForeground(Color.WHITE);
		lblProfile.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblProfile.setBackground(Color.WHITE);



		JPanel panelTitle = new JPanel();
		panelTitle.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(46, 61, 176)));
		panelTitle.setBackground(new Color(255, 255, 255));
		panelTitle.setBounds(10, 7, 1502, 154);
		frame.getContentPane().add(panelTitle);
		panelTitle.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePageStudent.class.getResource("/ExamImages/TitePanelStudent.jpg")));
		lblNewLabel.setBounds(5, 5, 1492, 144);
		panelTitle.add(lblNewLabel);

		panelRegisterAdmin = new PanelRegisterAdmin();
		panelMain.add(panelRegisterAdmin);
		panelRegisterAdmin.setVisible(false);



	}
	public void menuClicked(JPanel selectedPanel) {
		panelRegisterAdmin.setVisible(false);
		selectedPanel.setVisible(true);

	}
}
