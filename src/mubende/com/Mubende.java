package mubende.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JDesktopPane;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Mubende 
{

	private JFrame frame;
	private JTextField txtSearch;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			try {
				UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mubende window = new Mubende();
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
	public Mubende() {
		initialize();
		addMember();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("MubendeSDA Church Database Application.");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SAM\\workspace3\\Mubende\\images\\church.jpg"));
		
		frame.getContentPane().setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		frame.setBounds(150, 20, 450, 300);
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnHelp = new JButton("Help?");
		btnHelp.setBounds(705, 611, 90, 28);
		frame.getContentPane().add(btnHelp);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(353, 84, 134, 20);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("search");
		btnSearch.setBounds(219, 80, 90, 28);
		frame.getContentPane().add(btnSearch);

		JPanel panel = new JPanel();
		panel.setBounds(30, 6, 115, 102); 
		try {
			Image image =  ImageIO.read(new File("images//sdaIcon.jpg"));
			JLabel sdaIcon = new JLabel(new ImageIcon(image));
			panel.add(sdaIcon);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		frame.getContentPane().add(panel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(197, 136, 611, 188);
		frame.getContentPane().add(desktopPane);
		
	    btnNewButton = new JButton("  Add ");
		
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnNewButton.setBounds(69, 108, 90, 28);
		desktopPane.add(btnNewButton);
		
	 btnNewButton_1 = new JButton(" View ");
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnNewButton_1.setBounds(291, 108, 90, 28);
		desktopPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ministries");
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnNewButton_2.setBounds(460, 108, 90, 28);
		desktopPane.add(btnNewButton_2);
		
		JLabel lblWelcomeToMubendersda = new JLabel("Welcome to MubenderSDA Church. You can add A church Member and as well View One! ");
		lblWelcomeToMubendersda.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblWelcomeToMubendersda.setBounds(37, 29, 535, 16);
		desktopPane.add(lblWelcomeToMubendersda);
		
		JLabel lblClickToAdd = new JLabel("Click to add Member");
		lblClickToAdd.setBounds(70, 148, 122, 16);
		desktopPane.add(lblClickToAdd);
		
		JLabel lblClickToView = new JLabel("Click to View Members");
		lblClickToView.setBounds(291, 148, 133, 16);
		desktopPane.add(lblClickToView);
		
		JLabel lblCheckMinisries = new JLabel("Check Minisries");
		lblCheckMinisries.setBounds(469, 148, 103, 16);
		desktopPane.add(lblCheckMinisries);
		
		JLabel lblThisSoftwareIs = new JLabel("This Software Is meant to maniplate and store information about Mubende SDA church members.");
		lblThisSoftwareIs.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblThisSoftwareIs.setBounds(37, 58, 552, 16);
		desktopPane.add(lblThisSoftwareIs);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(269, 69, 411, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblYouCanEnter = new JLabel("You Can Enter A Church Member's Name to View Details");
		lblYouCanEnter.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblYouCanEnter.setBounds(269, 52, 411, 16);
		frame.getContentPane().add(lblYouCanEnter);
		
		JLabel lblMubendeSda = new JLabel("Mubende SDA");
		lblMubendeSda.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblMubendeSda.setBounds(49, 120, 96, 16);
		frame.getContentPane().add(lblMubendeSda);
		
		JLabel lblChurch = new JLabel("Church");
		lblChurch.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblChurch.setBounds(55, 136, 55, 16);
		frame.getContentPane().add(lblChurch);
		
		JButton btnContactUs = new JButton("Contact Us?");
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnContactUs.setBounds(860, 611, 90, 28);
		frame.getContentPane().add(btnContactUs);
		try {
			Image image =  ImageIO.read(new File("images//contactus.png"));
			JLabel lblNewLabel = new JLabel(new ImageIcon(image));
		lblNewLabel.setBounds(877, 561, 55, 39);
			frame.getContentPane().add(lblNewLabel);
			JButton btnSermons = new JButton("Sermons");
			btnSermons.setBounds(549, 611, 90, 28);
			frame.getContentPane().add(btnSermons);
			Image image2 =  ImageIO.read(new File("images//download.png"));
			JLabel lblNewLabel_1 = new JLabel(new ImageIcon(image2));
			lblNewLabel_1.setBounds(566, 561, 55, 39);
			frame.getContentPane().add(lblNewLabel_1);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(30, 252, 115, 115);
			try {
				Image image3 =  ImageIO.read(new File("images//pastor.jpg"));
				JLabel pastor = new JLabel(new ImageIcon(image3));
				panel_1.add(pastor);
			} catch (IOException e) {

				e.printStackTrace();
			}
			frame.getContentPane().add(panel_1);
			
			JLabel Administrator = new JLabel("App Administrator.");
			Administrator.setFont(new Font("Dialog", Font.BOLD, 12));
			Administrator.setBounds(30, 190, 115, 16);
			frame.getContentPane().add(Administrator);
			
			JLabel lblTheDistricPastor = new JLabel("The distric pastor is ");
			lblTheDistricPastor.setFont(new Font("Dialog", Font.ITALIC, 12));
			lblTheDistricPastor.setBounds(30, 208, 115, 16);
			frame.getContentPane().add(lblTheDistricPastor);
			
			JLabel lblTheAdminstrstorOf = new JLabel("the Adminstrstor of the App");
			lblTheAdminstrstorOf.setFont(new Font("Dialog", Font.ITALIC, 12));
			lblTheAdminstrstorOf.setBounds(30, 224, 149, 16);
			frame.getContentPane().add(lblTheAdminstrstorOf);
			  
			JLabel lblPastorNserekoMale = new JLabel("Pastor Nsereko Male ");
			lblPastorNserekoMale.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
			lblPastorNserekoMale.setBounds(30, 379, 127, 16);
			frame.getContentPane().add(lblPastorNserekoMale);
			try {
				Image image4 =  ImageIO.read(new File("images//bible.jpg"));
			} catch (IOException e) {

				e.printStackTrace();
			}
			
			
			try {
				Image image5 =  ImageIO.read(new File("images//help.jpg"));
				JLabel lblNewLabel_2 = new JLabel(new ImageIcon(image5));
				lblNewLabel_2.setBounds(715, 552, 55, 48);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel lblMubendesdaChurchDatabasehomescreen = new JLabel("MubendeSDA Church Database_HOMESCREEN.");
			lblMubendesdaChurchDatabasehomescreen.setFont(new Font("Dialog", Font.BOLD, 16));
			lblMubendesdaChurchDatabasehomescreen.setBounds(272, 6, 469, 16);
			frame.getContentPane().add(lblMubendesdaChurchDatabasehomescreen);
			try {
				Image image6 =  ImageIO.read(new File("images//church.jpg"));
			} catch (IOException e) {

				e.printStackTrace();
			}
			
			JDesktopPane desktopPane_1 = new JDesktopPane();
			desktopPane_1.setBounds(12, 6, 183, 444);
			frame.getContentPane().add(desktopPane_1);
			
			JDesktopPane desktopPane_2 = new JDesktopPane();
			desktopPane_2.setBounds(977, 576, -146, 81);
			frame.getContentPane().add(desktopPane_2);
			
			JDesktopPane desktopPane_3 = new JDesktopPane();
			desktopPane_3.setBounds(406, 588, -18, -26);
			frame.getContentPane().add(desktopPane_3);
			
			JDesktopPane desktopPane_4 = new JDesktopPane();
			desktopPane_4.setBounds(197, 552, 781, 105);
			frame.getContentPane().add(desktopPane_4);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBounds(30, 476, 149, 149);
			try{
				Image image7 =  ImageIO.read(new File("images//church_pic.jpg"));
				JLabel church = new JLabel(new ImageIcon(image7));
				panel_4.add(church);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			frame.getContentPane().add(panel_4);
			Image image8 =  ImageIO.read(new File("images//bible.jpg"));
             JPanel panel_2 = new JPanel(){
            	 protected void paintComponent(Graphics g) {
                     super.paintComponent(g);
                     g.drawImage(image8, 0, 0, null);
                 }
             };
           
			
			panel_2.setBounds(219, 328, 591, 188);
			
			frame.getContentPane().add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblKjhdwoijpojwdpowjpojpeofpeo = new JLabel("Seventh-day Adventist beliefs are meant to permeate your whole life. ");
			lblKjhdwoijpojwdpowjpojpeofpeo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
			lblKjhdwoijpojwdpowjpojpeofpeo.setBounds(67, 28, 484, 16);
			panel_2.add(lblKjhdwoijpojwdpowjpojpeofpeo);
			
			JLabel lblNewLabel_3 = new JLabel("Growing out of scriptures that paint a compelling portrait of God,");
			lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_3.setBounds(77, 56, 462, 16);
			panel_2.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel(" you are invited to explore, experience and know the One who desires");
			lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_4.setBounds(67, 84, 484, 16);
			panel_2.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("to make us whole");
			lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_5.setBounds(266, 111, 122, 16);
			panel_2.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("OUR BELIEFS");
			lblNewLabel_6.setBackground(Color.WHITE);
			lblNewLabel_6.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_6.setBounds(254, 0, 99, 16);
			panel_2.add(lblNewLabel_6);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addMember(){
		 btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				 new Add_Member();
			}
			 
		 });
		 btnNewButton_1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					new View_Member();
				}
				 
			 }); }
		
		
	
	
}
