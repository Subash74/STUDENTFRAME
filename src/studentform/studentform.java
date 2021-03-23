package studentform;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class studentform {

	private JFrame frame;
	private JTextField textField;
	String fname,lname,gender;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentform window = new studentform();
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
	public studentform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("STUDENT DETAILS");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("FIRST NAME");
		lblName.setBounds(51, 58, 69, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(212, 55, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fname=textField.getText();
				lname=textField_1.getText();
				
				
				display newframe = new display(fname,lname,gender);
				
			}
		});
		btnNewButton.setBounds(209, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 107, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("LAST NAME");
		lblNewLabel.setBounds(51, 113, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				gender="male";
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(213, 155, 46, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("F");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				gender="female";
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(267, 155, 31, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		lblNewLabel_1 = new JLabel("GENDER");
		lblNewLabel_1.setBounds(54, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
