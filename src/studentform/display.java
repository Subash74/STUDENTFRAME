package studentform;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class display {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					display window = new display();
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
	public display() {
		initialize();
	}
	
	public display(String name, String address,String gender) {
		initialize(name,address,gender);
	}
	
	private void initialize(String name, String address, String gender) {
		frame = new JFrame("student form");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(183, 37, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(name);
		frame.setVisible(true);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setBounds(183, 104, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(address);
		frame.setVisible(true);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(183, 150, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(gender);
		frame.setVisible(true);
		
		lblNewLabel = new JLabel("FIRST NAME");
		lblNewLabel.setBounds(41, 40, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		
		lblNewLabel_1 = new JLabel("LAST NAME");
		lblNewLabel_1.setBounds(41, 93, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		
		lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setBounds(41, 153, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(183, 37, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setBounds(183, 90, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(183, 150, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel = new JLabel("FIRST NAME");
		lblNewLabel.setBounds(41, 40, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("LAST NAME");
		lblNewLabel_1.setBounds(41, 93, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setBounds(41, 153, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
