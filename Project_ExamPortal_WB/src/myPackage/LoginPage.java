package myPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class LoginPage {

	private JFrame frmEducationCenter;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private boolean viewPass = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmEducationCenter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducationCenter = new JFrame();
		frmEducationCenter.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/ExamImages/v1033-a-06-c.jpg")));
		frmEducationCenter.getContentPane().setBackground(new Color(255, 255, 255));
		frmEducationCenter.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(221, 230, 253));
		mainPanel.setBounds(264, 126, 990, 621);
		frmEducationCenter.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/SideImage.jpg")));
		lblNewLabel_1.setBounds(450, 10, 530, 601);
		mainPanel.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(450, 10, 530, 601);
		mainPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Portal Login");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(137, 139, 185, 50);
		mainPanel.add(lblNewLabel_2);
		
		JPanel panelUsername = new JPanel();
		panelUsername.setBounds(25, 199, 400, 65);
		panelUsername.setBackground(new Color(255, 255, 255));
		mainPanel.add(panelUsername);
		panelUsername.setLayout(null);
		
		JPanel pnlUsername = new JPanel();
		pnlUsername.setBackground(new Color(111, 33, 173));
		pnlUsername.setBounds(0, 0, 15, 65);
		panelUsername.add(pnlUsername);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/imgUserSmall.jpg")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(25, 10, 45, 45);
		panelUsername.add(lblNewLabel_3);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(new Color(255, 255, 255));
		txtUsername.setBorder(null);
		txtUsername.setBounds(84, 10, 306, 45);
		panelUsername.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBackground(new Color(255, 255, 255));
		panelPassword.setBounds(25, 286, 400, 65);
		mainPanel.add(panelPassword);
		panelPassword.setLayout(null);
		
		JPanel pnlPassword = new JPanel();
		pnlPassword.setBackground(new Color(111, 33, 173));
		pnlPassword.setBounds(0,0,15,65);
		panelPassword.add(pnlPassword);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/imgPassSmall.jpg")));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(25, 10, 45, 45);
		panelPassword.add(lblNewLabel_3_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(255, 255, 255));
		txtPassword.setBorder(null);
		txtPassword.setBounds(80, 10, 272, 45);
		panelPassword.add(txtPassword);
		
		JLabel lblShowPass = new JLabel("");
		lblShowPass.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/ShowPassSmall.jpg")));
		lblShowPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(viewPass) {
					txtPassword.setEchoChar('●');
					lblShowPass.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/ShowPassSmall.jpg")));
					viewPass = false;
				}else {
					txtPassword.setEchoChar('\u0000');
					
					lblShowPass.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/HidePassSmall.png")));
					viewPass = true;
				}
			}
		});
		
		lblShowPass.setBounds(360, 17, 30, 31);
		panelPassword.add(lblShowPass);
		
		JLabel lblForgotPass = new JLabel("Forgot Password");
		lblForgotPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblForgotPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPass.setBounds(282, 361, 143, 26);
		mainPanel.add(lblForgotPass);
		
		JCheckBox chckbxRemember = new JCheckBox("Remember Me");
		chckbxRemember.setBackground(new Color(221, 230, 253));
		chckbxRemember.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxRemember.setBounds(28, 364, 123, 21);
		mainPanel.add(chckbxRemember);
		
		JButton btnLogin = new JButton("Sign In");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBounds(25, 435, 400, 42);
		mainPanel.add(btnLogin);
		btnLogin.setBackground(new Color(111, 33, 173));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/SmallLogo.jpg")));
		lblNewLabel_4.setBounds(176, 29, 100, 100);
		mainPanel.add(lblNewLabel_4);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String LoginName = txtUsername.getText();
				String Password = txtPassword.getText();
				
				
				if(LoginName.equals("ashu123") && Password.equals("dev123")) {
					
				}else {
					JOptionPane.showMessageDialog(null,"Invalid Login", "Login Failure Error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/5556661.jpg")));
		lblNewLabel.setBounds(0, 0, 1522, 827);
		frmEducationCenter.getContentPane().add(lblNewLabel);
		frmEducationCenter.setTitle("Education Center");
		frmEducationCenter.setResizable(false);
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		

		frmEducationCenter.setSize(width, height);
		frmEducationCenter.setLocationRelativeTo(null);
		frmEducationCenter.setResizable(false);
	}
}
