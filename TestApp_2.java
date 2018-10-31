package handPrint;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestApp_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	
	private float m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15;
	private float[] arr;
	private JTextField textField_15;
	public void setVisibility(boolean val){
		if(val){
			frame.setVisible(true);
			
		}else{
			frame.setVisible(false);
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestApp_2 window = new TestApp_2();
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
	public TestApp_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 666, 473);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Measure_10");
		lblNewLabel.setBounds(27, 294, 83, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thumb Length");
		lblNewLabel_1.setBounds(27, 33, 83, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Index Finger Length");
		lblNewLabel_2.setBounds(27, 58, 83, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Finger Length");
		lblNewLabel_3.setBounds(27, 87, 83, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ring Finger Length");
		lblNewLabel_4.setBounds(27, 116, 83, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pinkie Finger length");
		lblNewLabel_5.setBounds(27, 145, 83, 16);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Thumb width");
		lblNewLabel_6.setBounds(27, 174, 83, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Index Finger Width");
		lblNewLabel_7.setBounds(27, 203, 83, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Pinkie finger width");
		lblNewLabel_8.setBounds(27, 261, 83, 16);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Middle finger width ");
		lblNewLabel_9.setBounds(27, 232, 83, 16);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Thumb tip to first division");
		lblNewLabel_10.setBounds(27, 323, 83, 16);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Index tip to division");
		lblNewLabel_11.setBounds(27, 352, 83, 16);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Middle tip to division");
		lblNewLabel_12.setBounds(27, 381, 83, 16);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Ring tip to division");
		lblNewLabel_13.setBounds(27, 410, 83, 16);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Pinkie tip to division");
		lblNewLabel_14.setBounds(27, 439, 83, 16);
		panel.add(lblNewLabel_14);
		
		textField = new JTextField();
		textField.setBounds(166, 30, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 55, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 84, 116, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 113, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 142, 116, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(166, 171, 116, 22);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(166, 200, 116, 22);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(166, 229, 116, 22);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(166, 258, 116, 22);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(166, 291, 116, 22);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(166, 320, 116, 22);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(166, 349, 116, 22);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(166, 378, 116, 22);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(166, 407, 116, 22);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(166, 436, 116, 22);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lets check the thresould values here
				String strM1 = textField.getText();
				if(strM1.equals("")){
					m1 = 0f;
				}else{
					try{
						m1 = Float.parseFloat(strM1);
						textField_1.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM2 = textField_1.getText();
				if(strM1.equals("")){
					m2 = 0f;
				}else{
					try{
						m2 = Float.parseFloat(strM2);
						textField_2.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM3 = textField_2.getText();
				if(strM1.equals("")){
					m3 = 0f;
				}else{
					try{
						m3 = Float.parseFloat(strM3);
						textField_3.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM4 = textField_3.getText();
				if(strM1.equals("")){
					m4 = 0f;
				}else{
					try{
						m4 = Float.parseFloat(strM4);
						textField_4.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM5 = textField_4.getText();
				if(strM1.equals("")){
					m5 = 0f;
				}else{
					try{
						m5 = Float.parseFloat(strM5);
						textField_5.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM6 = textField_5.getText();
				if(strM1.equals("")){
					m6 = 0f;
				}else{
					try{
						m6 = Float.parseFloat(strM6);
						textField_6.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM7 = textField_6.getText();
				if(strM7.equals("")){
					m7 = 0f;
				}else{
					try{
						m7 = Float.parseFloat(strM7);
						textField_7.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM8 = textField_7.getText();
				if(strM8.equals("")){
					m8 = 0f;
				}else{
					try{
						m8 = Float.parseFloat(strM1);
						textField_8.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM9 = textField_8.getText();
				if(strM1.equals("")){
					m9 = 0f;
				}else{
					try{
						m9 = Float.parseFloat(strM9);
						textField_9.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM10 = textField_9.getText();
				if(strM1.equals("")){
					m10 = 0f;
				}else{
					try{
						m10 = Float.parseFloat(strM10);
						textField_10.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM11 = textField_10.getText();
				if(strM1.equals("")){
					m11 = 0f;
				}else{
					try{
						m11 = Float.parseFloat(strM11);
						textField_11.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM12 = textField_11.getText();
				if(strM1.equals("")){
					m12 = 0f;
				}else{
					try{
						m12 = Float.parseFloat(strM12);
						textField_12.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM13 = textField_12.getText();
				if(strM1.equals("")){
					m13 = 0f;
				}else{
					try{
						m13 = Float.parseFloat(strM13);
						textField_13.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM14 = textField_13.getText();
				if(strM1.equals("")){
					m14 = 0f;
				}else{
					try{
						m14 = Float.parseFloat(strM14);
						textField_14.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				
				String strM15 = textField_14.getText();
				if(strM15.equals("")){
					m15 = 0f;
				}else{
					try{
						m15 = Float.parseFloat(strM15);
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				
				String strM16 = textField_15.getText();
				if(strM16.equals("")){
					System.out.println("User name field is mandatory");
				}else{
					try{
						String name = strM16;
						Startup su = new Startup();
						su.Add(name);
						arr = new float[] {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15};
						int count = 0;
						for (float x : arr){
							System.out.println(x);
							if(x<0){
								System.out.println(x+ "is an invalid value. Please try again");
								//break;
							}else{
								if(x>0){
									count++;
								}
							}
						}
						if(count==15){
							//Main M = new Main();
							//M.getInput(arr);
							su.setVisibility(true);
							HandMeasurement HM = new HandMeasurement();
							HM.appendToCheckbook(arr, name);
							System.out.println("You are having access to the system from now onwards");
						}else{
							System.out.println("You have to enter the all 15 measurements to authenticate");
						}
						
						
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
				

			}
		});
		btnNewButton.setBounds(422, 410, 97, 45);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(557, 410, 97, 45);
		panel.add(btnNewButton_1);
		
		JLabel lblYourName = new JLabel("Your Name");
		lblYourName.setBounds(376, 48, 73, 37);
		panel.add(lblYourName);
		
		textField_15 = new JTextField();
		textField_15.setBounds(461, 40, 136, 45);
		panel.add(textField_15);
		textField_15.setColumns(10);
	}

}
