import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Customer_App {
	private JFrame frame;
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
		frame.setBounds(100, 100, 450, 300);
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

	 public void paintComponent(Graphics g) {
		 g.drawImage(img, 0, 0, null);
	 }
} 