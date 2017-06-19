package mubende.com;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.StatementImpl;
import com.mysql.jdbc.Wrapper;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JProgressBar;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Add_Member extends JFrame {
	//Instance variables for members.
	private String lastName;
	private int DAY;
	private int MONTH;
	private int YEAR;
	private String birthDay;
    private String gender;
    private boolean baptism;
    private boolean serving;
    static GregorianCalendar  date;
    static Add_Member addMember;
    int m;
    int  yearCounter;
    
    
    
    String FirstName;
    String LastName;
    int Day;
    int Month;
    int Year;
    String Gender;
    boolean Baptism;
    boolean Serving;
    

	//Instance variables for GUI
	JTextField textField;
	public JTextField textField_1;
	public JTextField textField_5;
	public JButton btnAdd;
	public JRadioButton rdbtnMale;
	public JRadioButton rdbtnFemale;
	JCheckBox chckbxNo_1;
	JCheckBox chckbxYes_1;
	JCheckBox chckbxNo;
	JCheckBox chckbxYes;
	protected String contact;
	protected String firstname;
	
	// * Launch the application.
	 
	public static void main(String[] args) {
		launchApp();
	}
		public static void launchApp(){try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Member frame = new Add_Member();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	public Add_Member() {
		setTitle("Add Member");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
	
	}
public Add_Member(String firstname, String lastname,int day,int month,int year,String gender,boolean baptism,boolean serving){
	this.FirstName=firstname;
	this.LastName=lastname;
	this.Day=day;
	this.Month=month;
	this.Year=year;
	this.Gender=gender;
	this.Baptism=baptism;
	this.Serving=serving;
	date = new GregorianCalendar(Year,Month,Day);	
}
String makeDateString( GregorianCalendar date){
	
	String sam = "sam";
	if(date!=null){
Integer year = date.get(Calendar.YEAR);

String Year = year.toString();
Integer month = date.get(Calendar.MONTH);
String Month = month.toString();
Integer day = date.get(Calendar.DATE);
String Day = day.toString();
String Date = Year+"/"+Month+"/"+Day;
return Date;
}
	else 
		return sam;

}
	private void initialize() {

	    int i;
        setBounds(150, 20, 450, 300);
	    setSize(1000, 700)	;
		JLabel lblFirstname = new JLabel("FirstName:");
		lblFirstname.setBounds(85, 160, 86, 14);
		
		textField = new JTextField();
		textField.setBounds(231, 157, 223, 20);
		
		textField.setColumns(10);
		getContentPane().setLayout(null);
		getContentPane().add(lblFirstname);
		getContentPane().add(textField);
		
		JLabel lblLastname = new JLabel("LastName:");
		lblLastname.setBounds(85, 211, 62, 14);
		getContentPane().add(lblLastname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(231, 208, 223, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(85, 270, 46, 18);
		getContentPane().add(lblGender);
		
		
		//Radio Buttons
		ActionListener action = new RadioActions();
	    rdbtnMale = new JRadioButton("male ");
		rdbtnMale.setToolTipText("");
		rdbtnMale.addActionListener(action);
		rdbtnMale.setBounds(240, 268, 62, 23);
		getContentPane().add(rdbtnMale);
		
        rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(330, 268, 109, 23);
		rdbtnFemale.addActionListener(action);
		getContentPane().add(rdbtnFemale);
		ButtonGroup grp = new ButtonGroup();
		grp.add(rdbtnMale);
		grp.add(rdbtnFemale);
	
		JLabel lblNewLabel = new JLabel("Date Of Birth:");
		lblNewLabel.setBounds(85, 322, 86, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(231, 322, 27, 14);
		getContentPane().add(lblDay);
		
		//forming lists for the JCombo boxes.
		JComboBox<Integer> comboBox = new JComboBox<>();
		for (i=1;i<=31;i++)
			comboBox.addItem(i);
		comboBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent ae) {
				JComboBox<Integer> days = (JComboBox<Integer>) ae.getSource();
				int x = (int) days.getSelectedItem();
				 DAY = x;
			
			}
		});
		
		comboBox.setBounds(256, 319, 72, 20);
		getContentPane().add(comboBox);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(378, 322, 46, 14);
		getContentPane().add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(573, 322, 27, 14);
		getContentPane().add(lblYear);
		
		
		JComboBox<Integer> comboBox_2 = new JComboBox<>();
		for( m=1;m<=100;m++){
			 yearCounter = 2018-m;
			 comboBox_2.addItem( yearCounter);;}
		comboBox_2.setBounds(610, 319, 113, 20);
comboBox_2.addActionListener(new ActionListener(){
			

			

			@Override
			public void actionPerformed(ActionEvent ae) {
				JComboBox<Integer> years = (JComboBox<Integer>) ae.getSource();
				int x = (int) years.getSelectedItem();
				 YEAR = x;
			}
		});
		getContentPane().add(comboBox_2);
		
		JLabel lblBaptised = new JLabel("Baptised?:");
		lblBaptised.setBounds(87, 363, 72, 19);
		getContentPane().add(lblBaptised);
		
		
		
		
		//check boxes of  
		 chckbxYes = new JCheckBox("Yes");
		 ActionListener checkbox_1 = new CheckBox_1();
		 chckbxYes.addActionListener(checkbox_1);
		chckbxYes.setBounds(231, 361, 51, 23);
		getContentPane().add(chckbxYes);

		
		 chckbxNo = new JCheckBox("No");
		 chckbxNo.addActionListener(checkbox_1);
		chckbxNo.setBounds(315, 361, 97, 23);
		getContentPane().add(chckbxNo);
		
		
		
		textField_5 = new JTextField();
		textField_5.setBounds(231, 444, 223, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblweNeedA = new JLabel("(We need a valid phone number in case its provided)");
		lblweNeedA.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblweNeedA.setBounds(218, 475, 252, 14);
		getContentPane().add(lblweNeedA);
		
		JLabel lblWelcomeToMubendesda = new JLabel("Welcome To MubendeSDA Add Member DashBoard");
		lblWelcomeToMubendesda.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWelcomeToMubendesda.setBounds(231, 11, 449, 14);
		getContentPane().add(lblWelcomeToMubendesda);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(180, 32, 772, 116);
		getContentPane().add(desktopPane);
		
		JLabel lblWeRequireValid = new JLabel("We Require valid information about every church member. All fields should be filled if known.");
		lblWeRequireValid.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblWeRequireValid.setBounds(26, 12, 655, 14);
		desktopPane.add(lblWeRequireValid);
		
		JLabel lblNoteAnAssumption = new JLabel("NOTE: An assumption is that every member added from this page is a MubendeSDA Church member.");
		lblNoteAnAssumption.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNoteAnAssumption.setBounds(26, 59, 655, 14);
		desktopPane.add(lblNoteAnAssumption);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.LIGHT_GRAY);
		desktopPane_1.setBounds(181, 150, 771, 358);
		getContentPane().add(desktopPane_1);
		
		//Check boxes.
		 chckbxNo_1 = new JCheckBox("No");
		 ActionListener CheckBox_2 = new CheckBox_2();
		 chckbxNo_1.addActionListener(CheckBox_2);
		chckbxNo_1.setBounds(131, 254, 97, 23);
		desktopPane_1.add(chckbxNo_1);
		
		 chckbxYes_1 = new JCheckBox("Yes");
		 chckbxYes_1.addActionListener(CheckBox_2);
		chckbxYes_1.setBounds(51, 254, 51, 23);
		desktopPane_1.add(chckbxYes_1);
		
		String[]months = new String[]{
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"	
		};
		//////////////////////////////////////////
		////////////////////////////////////////
		////////////////////////////////////////
		/////////////////////////////////////////
		JComboBox<String> comboBox_1 = new JComboBox<>(months);
		
comboBox_1.addActionListener(new ActionListener(){
	

			@Override
			public void actionPerformed(ActionEvent ae) {
				JComboBox<String> days = (JComboBox<String>) ae.getSource();
				String x = (String) days.getSelectedItem();
				 
				switch (x){
				case "Jan" :
					MONTH=1;
				break;
				
				case "Feb" :
					MONTH=2;
					break;
				case "Mar" :
					MONTH=3;
					break;
				case "Apr":
					MONTH=4;
					break;
				case "May" :
					MONTH=5;	
					break;
				case "Jun" :
					MONTH=6;	
					break;
				case "Jul" :
					MONTH=7;	
					break;	
				case "Aug" :
					MONTH=8;	
					break;
				case "Sep" :
					MONTH=9;	
					break;
				case "Oct" :
					MONTH=10;	
					break;
				case "Nov" :
					MONTH=11;
				case "Dec":
					MONTH = 12;
					break;
				}
				
			}
		});
		comboBox_1.setBounds(237, 169, 118, 20);
		desktopPane_1.add(comboBox_1);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.LIGHT_GRAY);
		desktopPane_2.setBounds(12, 32, 168, 476);
		getContentPane().add(desktopPane_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SAM\\workspace3\\Mubende\\images\\man_standing.png"));
		lblNewLabel_1.setBounds(79, 27, 50, 50);
		desktopPane_2.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 154, 118, 2);
		desktopPane_2.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(50, 266, 118, 2);
		desktopPane_2.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(50, 317, 118, 2);
		desktopPane_2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(50, 216, 118, 2);
		desktopPane_2.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(50, 363, 118, 2);
		desktopPane_2.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(50, 403, 118, 2);
		desktopPane_2.add(separator_6);
		
		JLabel lblServingInChurch = new JLabel("Serving In Church?");
		lblServingInChurch.setBounds(50, 376, 118, 14);
		desktopPane_2.add(lblServingInChurch);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setBounds(79, 416, 50, 14);
		desktopPane_2.add(lblContact);
		
	    btnAdd = new JButton("Add");
	    btnAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstname =textField.getText();
			lastName=textField_1.getText();
			contact = textField_5.getText();
			
			new Add_Member(firstname,lastName,DAY,MONTH,YEAR,gender,baptism,serving);
			birthDay=makeDateString(date);
			
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/mubendesda";
			String sql = "INSERT INTO members(FIRSTNAME,LASTNAME,SEX,BIRTH_DATE,BATISED?,SERVING_IN_CHURCH?,CONTACT) VALUES(?,?,?,?,?,?,?)";
			try {
				
				System.out.println("connecting....");
				conn = (Connection) DriverManager.getConnection(url,"root","#Tandy1997");
				 java.sql.PreparedStatement statement = ((Connection) conn).prepareStatement(sql);
				 
				 statement.setString(1,firstname );
				 statement.setString(2,lastName );
				 statement.setString(3,gender );
				 statement.setString(4,birthDay );
				 statement .setString(5, "baptised");
				 statement.setString(6,"serving"); 
				 statement .setString(7,contact);
				 System.out.println("adding member.....");
				 int row = statement.executeUpdate();
				 if(row>0){
					 System.out.println("member added.");
				 }
				 ((Connection) conn).close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
			
		});
		btnAdd.setBounds(275, 519, 89, 23);
		getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(622, 519, 89, 23);
		btnCancel.addActionListener(new ActionListener(){
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				
			}
			
		});
		getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SAM\\workspace3\\Mubende\\images\\prayer.jpg"));
		lblNewLabel_2.setBounds(12, 520, 150, 129);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Prayer is the simple act of having a conversation with God. It\u2019s about talking with the Creator of the Universe: whether aloud or in ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(180, 553, 772, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("our thoughts, during special or ordinary moments, when we\u2019re on the move or before we go to bed. It\u2019s the privilege we get as His ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(180, 577, 792, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("children\u2014a direct connection to God. No voicemail messages, no call waiting.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(180, 603, 603, 14);
		getContentPane().add(lblNewLabel_5);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.LIGHT_GRAY);
		desktopPane_3.setBounds(231, 509, 526, 41);
		getContentPane().add(desktopPane_3);
		
		
		
		setVisible(true);
		
		
	}

	class RadioActions implements ActionListener{
   String Gender;
		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton button = (JRadioButton) e.getSource();
			if(button==rdbtnMale){
			Gender="male";	
			}else if(button==rdbtnFemale){
			Gender="female";	
			}
		}}
		class CheckBox_1 implements ActionListener{
			   String Gender;
					@Override
					public void actionPerformed(ActionEvent e) {
						JCheckBox box = (JCheckBox) e.getSource();
						if(box.isSelected()){
							if(box==chckbxYes){
								baptism=true;
							}else if(box==chckbxNo){
								baptism=false;
							}
						}else{
							if(box==chckbxYes){
								baptism=false;
							}else if(box==chckbxNo){
								baptism=false;
							}
							
						}
					}
	}
	
	
	
	class CheckBox_2 implements ActionListener{
		   String Gender;
				@Override
				public void actionPerformed(ActionEvent e) {
					JCheckBox box2 = (JCheckBox) e.getSource();
					if(box2.isSelected()){
						if(box2==chckbxYes_1){
							serving=true;
						}else if(box2==chckbxNo_1){
							serving=false;
						}
					}else{
						if(box2==chckbxYes_1){
							serving=false;
						}else if(box2==chckbxNo_1){
							serving=false;
						}
						
					}
				}

	}







}
	
