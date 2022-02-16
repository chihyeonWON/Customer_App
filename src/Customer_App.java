import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Customer_App {
	private JFrame frame;
	private JTextField txtEnterId;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
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
	public Customer_App() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C://Users//ylose//eclipse-workspace//Swing Lessons//Image//welcome.jpg").getImage());
		frame.setSize(welcomePanel.getWidth(), welcomePanel.getHeight());
		frame.getContentPane().add(welcomePanel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(403, 470, 116, 65);
		welcomePanel.add(lblNewLabel);
		
		txtEnterId = new JTextField();
		txtEnterId.setFont(new Font("Arial", Font.PLAIN, 30));
		txtEnterId.setToolTipText("Enter ID");
		txtEnterId.setBounds(374, 315, 281, 42);
		welcomePanel.add(txtEnterId);
		txtEnterId.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(374, 393, 281, 42);
		welcomePanel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("ID  : ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 33));
		lblNewLabel_1.setBounds(292, 320, 116, 30);
		welcomePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PW :");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(292, 392, 84, 30);
		welcomePanel.add(lblNewLabel_2);
		
		JButton btnLogIn = new JButton("");
		btnLogIn.setIcon(new ImageIcon("C:\\Users\\ylose\\eclipse-workspace\\Swing Lessons\\Image\\login_button.jpg"));
		btnLogIn.setPressedIcon(new ImageIcon("C:\\Users\\ylose\\eclipse-workspace\\Swing Lessons\\Image\\login_button (2).png"));
		btnLogIn.setBounds(514, 470, 65, 65);
		
		welcomePanel.add(btnLogIn);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // �⺻��ġ��������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ImagePanel extends JPanel{
	 private Image img;

	 public ImagePanel(Image img) {
		 this.img = img;
		 setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		 setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		 setLayout(null);
	 }
	 public int getWidth() {
		 return img.getWidth(null);
	 }
	 
	 public int getHeight() {
		 return img.getHeight(null);
	 }

	 public void paintComponent(Graphics g) {
		 g.drawImage(img, 0, 0, null);
	 }
} 