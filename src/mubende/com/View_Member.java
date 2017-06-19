package mubende.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class View_Member {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Member window = new View_Member();
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
	public View_Member() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("View Member");
		frame.setBounds(150,20,1000,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(10, 79, 382, 571);
		frame.getContentPane().add(desktopPane);
		
		DefaultListModel<String> myModel = new DefaultListModel<>();
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		myModel.addElement("Sembusi Kenny");
		myModel.addElement("Kuteesa Sam");
		myModel.addElement("Samuel Male");
		
		JList<String> list = new JList<>(myModel);
		JScrollPane pane = new JScrollPane(list);
		pane.setBounds(25, 50, 333, 497);
		desktopPane.add(pane);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setBounds(167, 11, 89, 23);
		desktopPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(57, 12, 86, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.LIGHT_GRAY);
		desktopPane_1.setBounds(402, 79, 706, 571);
		frame.getContentPane().add(desktopPane_1);
		
		JLabel lblNewLabel = new JLabel("Contact");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblNewLabel.setBounds(36, 139, 124, 14);
		desktopPane_1.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblAge.setBounds(36, 178, 46, 22);
		desktopPane_1.add(lblAge);
		
		JLabel lblBaptismStatus = new JLabel("Baptism Status");
		lblBaptismStatus.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblBaptismStatus.setBounds(35, 224, 124, 14);
		desktopPane_1.add(lblBaptismStatus);
		
		JLabel lblNewLabel_1 = new JLabel("Services");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblNewLabel_1.setBounds(36, 263, 91, 14);
		desktopPane_1.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(59, 333, 503, 2);
		desktopPane_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(59, 346, 503, 2);
		desktopPane_1.add(separator_1);
		
		JLabel lblMaleSamuel = new JLabel("Male Samuel");
		lblMaleSamuel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblMaleSamuel.setBounds(162, 33, 256, 33);
		desktopPane_1.add(lblMaleSamuel);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(59, 89, 503, 2);
		desktopPane_1.add(separator_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SAM\\workspace3\\Mubende\\images\\man_standing.png"));
		lblNewLabel_2.setBounds(483, 11, 55, 55);
		desktopPane_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		textField_1.setEditable(false);
		textField_1.setText("0704202234");
		textField_1.setBounds(170, 132, 207, 30);
		desktopPane_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		textField_2.setEditable(false);
		textField_2.setText("20");
		textField_2.setBounds(170, 175, 207, 30);
		desktopPane_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		textField_3.setEditable(false);
		textField_3.setText("Baptised");
		textField_3.setBounds(170, 217, 207, 30);
		desktopPane_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		textField_4.setEditable(false);
		textField_4.setText("Not Serving");
		textField_4.setBounds(170, 256, 207, 30);
		desktopPane_1.add(textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(32, 160, 116, 2);
		desktopPane_1.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(32, 198, 116, 2);
		desktopPane_1.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(32, 245, 116, 2);
		desktopPane_1.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(32, 284, 116, 2);
		desktopPane_1.add(separator_6);
		
		JLabel lblMinistries = new JLabel("Ministries");
		lblMinistries.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblMinistries.setBounds(193, 359, 165, 33);
		desktopPane_1.add(lblMinistries);
		
		table = new JTable();
	
		table.setBounds(36, 391, 502, 156);
		desktopPane_1.add(table);
		
		JLabel lblWelcomeToMubendesda = new JLabel("Welcome To MubendeSDA Church Member's DashBorad.");
		lblWelcomeToMubendesda.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblWelcomeToMubendesda.setBounds(10, 11, 974, 27);
		frame.getContentPane().add(lblWelcomeToMubendesda);
		
		JLabel lblNoteThatAll = new JLabel("Note that all the listed below are registered Members of MubendeSDA Church.");
		lblNoteThatAll.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblNoteThatAll.setBounds(162, 54, 617, 14);
		frame.getContentPane().add(lblNoteThatAll);
		frame.setVisible(true);
	}
}
