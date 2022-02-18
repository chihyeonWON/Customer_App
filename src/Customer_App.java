import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Customer_App {
	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private JTextField name;
	private JTextField phone;
	private JTextField age;
	private JTextField birthday;
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
		Customer customer = new Customer();
		frame = new JFrame();
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C://Users//ylose//eclipse-workspace//Swing Lessons//Image//welcome.jpg").getImage());
		welcomePanel.setBounds(0, -60, 952, 642);
		frame.setSize(welcomePanel.getWidth(), welcomePanel.getHeight());
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 952, 605);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		
		JLabel lbWelcomeThisIs = new JLabel("Welcome This is Main Panel");
		lbWelcomeThisIs.setFont(new Font("Arial Black", Font.BOLD, 25));
		lbWelcomeThisIs.setBounds(262, 27, 459, 53);
		mainPanel.add(lbWelcomeThisIs);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lbName = new JLabel("Name");
		lbName.setHorizontalAlignment(SwingConstants.CENTER);
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lbName.setBounds(129, 90, 214, 46);
		mainPanel.add(lbName);
		
		JLabel lbAge = new JLabel("Age");
		lbAge.setHorizontalAlignment(SwingConstants.CENTER);
		lbAge.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lbAge.setBounds(129, 165, 214, 46);
		mainPanel.add(lbAge);
		
		JLabel lblAge_1 = new JLabel("Age");
		lblAge_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblAge_1.setBounds(129, 165, 214, 46);
		mainPanel.add(lblAge_1);
		
		JLabel lbGender = new JLabel("Gender");
		lbGender.setHorizontalAlignment(SwingConstants.CENTER);
		lbGender.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lbGender.setBounds(129, 245, 214, 46);
		mainPanel.add(lbGender);
		
		JLabel lbPhone = new JLabel("Phone");
		lbPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lbPhone.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lbPhone.setBounds(507, 90, 214, 46);
		mainPanel.add(lbPhone);
		
		JLabel lbBirthday = new JLabel("Birthday");
		lbBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lbBirthday.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lbBirthday.setBounds(507, 165, 214, 46);
		mainPanel.add(lbBirthday);
		
		JLabel lbNote = new JLabel("Note");
		lbNote.setHorizontalAlignment(SwingConstants.CENTER);
		lbNote.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lbNote.setBounds(507, 245, 214, 46);
		mainPanel.add(lbNote);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 19));
		name.setBounds(289, 90, 241, 46);
		mainPanel.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 19));
		phone.setColumns(10);
		phone.setBounds(673, 90, 241, 46);
		mainPanel.add(phone);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 19));
		age.setColumns(10);
		age.setBounds(289, 165, 241, 46);
		mainPanel.add(age);
		
		birthday = new JTextField();
		birthday.setFont(new Font("Tahoma", Font.PLAIN, 19));
		birthday.setColumns(10);
		birthday.setBounds(673, 165, 241, 46);
		mainPanel.add(birthday);
		
		JComboBox gender = new JComboBox(new String[] {"Male","Female"});
		gender.setFont(new Font("Tahoma", Font.PLAIN, 19));
		gender.setBackground(Color.WHITE);
		gender.setBounds(289, 249, 241, 46);
		mainPanel.add(gender);
		
		JTextArea note = new JTextArea();
		note.setFont(new Font("Arial", Font.PLAIN, 19));
		note.setBounds(673, 245, 241, 181);
		note.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		mainPanel.add(note);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameTxt = name.getText();
				String ageTxt = age.getText();
				String phoneTxt = phone.getText();
				String genderTxt = gender.getSelectedItem().toString();
				String noteTxt = note.getText();
			
				customer.createCustomer(nameTxt, phoneTxt, genderTxt, ageTxt, noteTxt);
				JOptionPane.showMessageDialog(null, "Your data has been saved successfully");
				mainPanel.setVisible(false);
			}
		});
		btnNewButton.setBounds(383, 455, 297, 63);
		mainPanel.add(btnNewButton);
		frame.getContentPane().add(welcomePanel);
		welcomePanel.setLayout(null);
		frame.getContentPane().add(welcomePanel);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(403, 470, 116, 65);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		welcomePanel.add(lblNewLabel);
		
		id = new JTextField();
		id.setBounds(374, 315, 281, 42);
		id.setFont(new Font("Arial", Font.PLAIN, 30));
		id.setToolTipText("Enter ID");
		welcomePanel.add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(374, 393, 281, 42);
		welcomePanel.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("ID  : ");
		lblNewLabel_1.setBounds(292, 320, 116, 30);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 33));
		welcomePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PW :");
		lblNewLabel_2.setBounds(292, 392, 84, 30);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		welcomePanel.add(lblNewLabel_2);
		
		JButton btnLogIn = new JButton("");
		btnLogIn.setBounds(514, 470, 65, 65);
		btnLogIn.setIcon(new ImageIcon("C:\\Users\\ylose\\eclipse-workspace\\Swing Lessons\\Image\\login_button.jpg"));
		btnLogIn.setPressedIcon(new ImageIcon("C:\\Users\\ylose\\eclipse-workspace\\Swing Lessons\\Image\\login_button (2).png"));
		btnLogIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("Danny")&& Arrays.equals(password.getPassword(), "hello".toCharArray())) {
					System.out.println("Welcome Danny");
					welcomePanel.setVisible(false);
					mainPanel.setVisible(true);
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