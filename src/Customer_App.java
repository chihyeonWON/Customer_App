import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Customer_App {
	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
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
		
		id = new JTextField();
		id.setFont(new Font("Arial", Font.PLAIN, 30));
		id.setToolTipText("Enter ID");
		id.setBounds(374, 315, 281, 42);
		welcomePanel.add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(374, 393, 281, 42);
		welcomePanel.add(password);
		
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
		btnLogIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("Danny")&& Arrays.equals(password.getPassword(), "hello".toCharArray())) {
					System.out.println("Welcome Danny");
					welcomePanel.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		
		welcomePanel.add(btnLogIn);
		frame.setJMenuBar(menuBar());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // 기본위치설정해제
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		
		bar.add(fileMenu);
		bar.add(aboutMenu);
		
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(openFile);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		return bar;
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