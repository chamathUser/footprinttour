package handPrint;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestApp {

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
	
	private float m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15;
	private float[] arr;
	String nameOfUser;
	int[] nl;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public void setVisibility(boolean val){
		if(val){
			frame.setVisible(true);
			
		}else{
			frame.setVisible(false);
		}
	}
	public void getName(String name){
		nameOfUser = name;

	}
	//public void getList(int[] list){
		//nl = list;
	//}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestApp window = new TestApp();
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
	public TestApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 699, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("Middle Finger Length");
		lbl1.setBounds(44, 124, 93, 16);
		panel.add(lbl1);
		
		JLabel lblNewLabel = new JLabel("Thumb Length");
		lblNewLabel.setBounds(44, 51, 112, 22);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(165, 51, 107, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 86, 107, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(167, 121, 107, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(165, 156, 107, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(165, 191, 107, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(165, 233, 107, 22);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(165, 268, 107, 22);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(165, 303, 107, 22);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(165, 338, 107, 22);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(165, 373, 107, 22);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Index Finger Length");
		lblNewLabel_1.setBounds(44, 86, 93, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ring Finger Length");
		lblNewLabel_2.setBounds(44, 159, 93, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pinkie Finger length");
		lblNewLabel_3.setBounds(44, 194, 93, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ring finger width");
		lblNewLabel_4.setBounds(44, 341, 107, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pinkie finger width");
		lblNewLabel_5.setBounds(44, 376, 107, 16);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Thumb width");
		lblNewLabel_6.setBounds(44, 236, 93, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Index Finger Width");
		lblNewLabel_7.setBounds(44, 271, 93, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Middle finger width ");
		lblNewLabel_8.setBounds(44, 306, 93, 16);
		panel.add(lblNewLabel_8);
		

		
		JButton btnNewButton_1 = new JButton("Terminate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr = null;
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(499, 524, 140, 45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				
			}
		});
		btnNewButton_2.setBounds(284, 51, 78, 22);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Submit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM2 = textField_1.getText();
				if(strM2.equals("")){
					m2 = 0f;
				}else{
					try{
						m2 = Float.parseFloat(strM2);
						textField_2.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_3.setBounds(284, 86, 78, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Submit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM3 = textField_2.getText();
				if(strM3.equals("")){
					m3 = 0f;
				}else{
					try{
						m3 = Float.parseFloat(strM3);
						textField_3.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_4.setBounds(286, 121, 76, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Submit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM4 = textField_3.getText();
				if(strM4.equals("")){
					m4 = 0f;
				}else{
					try{
						m4 = Float.parseFloat(strM4);
						textField_4.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_5.setBounds(284, 155, 78, 25);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Submit");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM5 = textField_4.getText();
				if(strM5.equals("")){
					m5 = 0f;
				}else{
					try{
						m5 = Float.parseFloat(strM5);
						textField_5.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_6.setBounds(284, 190, 78, 25);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Submit");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM6 = textField_5.getText();
				if(strM6.equals("")){
					m6 = 0f;
				}else{
					try{
						m6 = Float.parseFloat(strM6);
						textField_6.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_7.setBounds(284, 232, 78, 25);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Submit");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM7 = textField_6.getText();
				//System.out.println(strM7+" aaa");
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
			}
		});
		btnNewButton_8.setBounds(284, 267, 78, 25);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Submit");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM8 = textField_7.getText();
				if(strM8.equals("")){
					m8 = 0f;
				}else{
					try{
						m8 = Float.parseFloat(strM8);
						textField_8.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_9.setBounds(284, 302, 78, 25);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Submit");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM9 = textField_8.getText();
				if(strM9.equals("")){
					m9 = 0f;
				}else{
					try{
						m9 = Float.parseFloat(strM9);
						textField_9.getCursor();
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_10.setBounds(286, 337, 76, 25);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Submit");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM10 = textField_9.getText();
				if(strM10.equals("")){
					m10 = 0f;
				}else{
					try{
						m10 = Float.parseFloat(strM10);
						
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_11.setBounds(286, 372, 76, 25);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Cancel");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m1 = 0f;
			}
		});
		btnNewButton_12.setBounds(374, 51, 71, 22);
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Cancel");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m2 = 0f;
			}
		});
		btnNewButton_13.setBounds(374, 85, 71, 25);
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Cancel");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m3 = 0f;
			}
		});
		btnNewButton_14.setBounds(374, 120, 71, 25);
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Cancel");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m4 = 0f;
			}
		});
		btnNewButton_15.setBounds(374, 152, 71, 25);
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Cancel");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m5 = 0f;
			}
		});
		btnNewButton_16.setBounds(374, 190, 71, 25);
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(362, 229, 57, -1);
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Cancel");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m6 = 0f;
			}
		});
		btnNewButton_18.setBounds(374, 229, 71, 25);
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("Cancel");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m7 = 0f;
			}
		});
		btnNewButton_19.setBounds(374, 264, 71, 25);
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("Cancel");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m8 = 0f;
			}
		});
		btnNewButton_20.setBounds(374, 299, 71, 25);
		panel.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("Cancel");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m9 = 0f;
			}
		});
		btnNewButton_21.setBounds(374, 334, 71, 25);
		panel.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("Cancel");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m10 = 0f;
			}
		});
		btnNewButton_22.setBounds(374, 369, 71, 25);
		panel.add(btnNewButton_22);
		
		JButton btnNewButton = new JButton("Authenticate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arr = new float[] {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m1,m14,m15};
				int countOne = 0;
				for (float x:arr){
					if(x<0){
						System.out.println(x+ "is an invalid value. Please try again");
					}else{
						if(x>0){
							countOne++;
						}
					}
				}
				if(countOne>=5){
					Main N = new Main();
					N.authenticate(arr,nameOfUser);
					//N.map(nl);
					
				}else{
					System.out.println("The number of input measures are not enough for authentication progress");
				}

				
			}
		});
		btnNewButton.setBounds(499, 51, 140, 45);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("Thumb tip to first division");
		lblNewLabel_9.setBounds(44, 405, 107, 16);
		panel.add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(165, 408, 107, 22);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Index tip to division");
		lblNewLabel_10.setBounds(44, 440, 112, 16);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Middle tip to division");
		lblNewLabel_11.setBounds(44, 481, 112, 16);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Ring tip to division");
		lblNewLabel_12.setBounds(44, 524, 112, 16);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Pinkie tip to division");
		lblNewLabel_13.setBounds(44, 553, 112, 16);
		panel.add(lblNewLabel_13);
		
		textField_11 = new JTextField();
		textField_11.setBounds(165, 443, 107, 22);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(165, 478, 107, 22);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(165, 515, 107, 22);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(165, 547, 107, 22);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JButton btnNewButton_23 = new JButton("Submit");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM11 = textField_10.getText();
				if(strM11.equals("")){
					m11 = 0f;
				}else{
					try{
						m11 = Float.parseFloat(strM11);
						
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_23.setBounds(284, 410, 78, 25);
		panel.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("Submit");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM12 = textField_11.getText();
				if(strM12.equals("")){
					m12 = 0f;
				}else{
					try{
						m12 = Float.parseFloat(strM12);
						
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_24.setBounds(284, 442, 78, 25);
		panel.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Submit");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM13 = textField_12.getText();
				if(strM13.equals("")){
					m13 = 0f;
				}else{
					try{
						m13 = Float.parseFloat(strM13);
						
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_25.setBounds(284, 477, 78, 25);
		panel.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("Submit");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM14 = textField_13.getText();
				if(strM14.equals("")){
					m14 = 0f;
				}else{
					try{
						m14 = Float.parseFloat(strM14);
						
					}catch(NumberFormatException w){
						System.out.println("wrong input");
					}
				}
			}
		});
		btnNewButton_26.setBounds(284, 514, 78, 25);
		panel.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("Submit");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			}
		});
		btnNewButton_27.setBounds(284, 549, 78, 25);
		panel.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("Cancel");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m11 = 0f;
			}
		});
		btnNewButton_28.setBounds(374, 407, 71, 25);
		panel.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("Cancel");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m12 = 0f;
			}
		});
		btnNewButton_29.setBounds(374, 440, 71, 25);
		panel.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("Cancel");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m13 = 0f;
			}
		});
		btnNewButton_30.setBounds(374, 477, 71, 25);
		panel.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("Cancel");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m14 = 0f;
			}
		});
		btnNewButton_31.setBounds(374, 514, 71, 25);
		panel.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("Cancel");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m15 = 0f;
			}
		});
		btnNewButton_32.setBounds(374, 549, 71, 25);
		panel.add(btnNewButton_32);
	}
}
