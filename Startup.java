package handPrint;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Startup {
	ArrayList<String> NamesOfUsers = new ArrayList<String>();
	

	private JFrame frame;
	private JTextField textField;
	
	public void setVisibility(boolean val){
		if(val){
			frame.setVisible(true);
			
		}else{
			frame.setVisible(false);
		}
	}
	
	public void Add(String name){
		NamesOfUsers.add(name);
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startup window = new Startup();
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
	public Startup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 432, 352);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome !");
		lblWelcome.setBounds(188, 26, 85, 44);
		panel.add(lblWelcome);
		
		textField = new JTextField();
		textField.setBounds(157, 74, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {

				String user_name = textField.getText();
				if(user_name.isEmpty()){
					System.out.println("User name field is mandatory");
				}else{
					ArrayList<String> names = new ArrayList<String>();
					File file = new File("file.txt");
					try {

						Scanner sc = new Scanner(file);
						ArrayList<String> lines = new ArrayList<String>();
						//
						while (sc.hasNextLine()) {
						  lines.add(sc.nextLine());
						}

						String[] arr = lines.toArray(new String[0]);
						for(String x: arr){
							String[] s = x.split(" ");
							
							names.add(s[0]);
							//System.out.println(s[0]);
						}
						
					}catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					
					if(names.contains(user_name)){
						System.out.println("login successful as " + user_name);
						TestApp ta = new TestApp();
						ta.getName(user_name);
						ta.setVisibility(true);
						frame.setVisible(false);
					}else{
						System.out.println("You are not a registered user");
					}
					
					HandMeasurement HDTwo = new HandMeasurement();
					HDTwo.getUserName(user_name);
				}
				ArrayList<String> names = new ArrayList<String>();
				File file = new File("file.txt");
				try {

					Scanner sc = new Scanner(file);
					ArrayList<String> lines = new ArrayList<String>();
					//
					while (sc.hasNextLine()) {
					  lines.add(sc.nextLine());
					}

					String[] arr = lines.toArray(new String[0]);
					for(String x: arr){
						String[] s = x.split(" ");
						
						names.add(s[0]);
						//System.out.println(s[0]);
					}
					
				}catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(300, 73, 75, 25);
		panel.add(btnNewButton);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(86, 76, 68, 19);
		panel.add(lblUsername);
		
		JLabel lblNewUser = new JLabel("New User ?");
		lblNewUser.setBounds(231, 274, 68, 16);
		panel.add(lblNewUser);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestApp_2 ta2 = new TestApp_2();
				ta2.setVisibility(true);
				frame.setVisible(false);
			}
		});
		btnSignup.setBounds(231, 303, 75, 25);
		panel.add(btnSignup);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				System.out.println("System Terminated");
			}
		});
		btnNewButton_1.setBounds(329, 303, 75, 25);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		//Image img = new ImageIcon(this.getClass().getResource("/User-Interface-Login-icon.png")).getImage();
		//lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(23, 120, 128, 128);
		panel.add(lblNewLabel);
	}
}
