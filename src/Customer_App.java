import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
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
		frame.getContentPane().add(welcomePanel);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(292, 229, 213, 65);
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
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setBounds(374, 471, 243, 50);
		welcomePanel.add(btnNewButton);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // 기본위치설정해제
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