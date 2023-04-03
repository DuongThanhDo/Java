package MayTinh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class frmMT extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtHienThi;
	String HienThi = "";
	long ketqua = 0;
	String pheptoan = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMT frame = new frmMT();
					frame.setTitle("Máy Tính");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmMT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "0";
				txtHienThi.setText(HienThi);
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBackground(new Color(128, 128, 128));
		button.setBounds(10, 381, 130, 38);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "1";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBounds(10, 324, 55, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "2";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setBounds(85, 324, 55, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "3";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		btnNewButton_2.setBounds(160, 324, 55, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "4";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBackground(new Color(128, 128, 128));
		btnNewButton_3.setBounds(10, 265, 55, 38);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "5";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBackground(new Color(128, 128, 128));
		btnNewButton_4.setBounds(85, 265, 55, 38);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "6";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBackground(new Color(128, 128, 128));
		btnNewButton_5.setBounds(160, 265, 55, 38);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "7";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBackground(new Color(128, 128, 128));
		btnNewButton_6.setBounds(10, 210, 55, 38);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "8";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_7.setBackground(new Color(128, 128, 128));
		btnNewButton_7.setBounds(85, 210, 55, 38);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi += "9";
				txtHienThi.setText(HienThi);
			}
		});
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.setBackground(new Color(128, 128, 128));
		btnNewButton_8.setBounds(160, 210, 55, 38);
		contentPane.add(btnNewButton_8);
		
		txtHienThi = new JTextField();
		txtHienThi.setEnabled(false);
		txtHienThi.setForeground(new Color(255, 255, 255));
		txtHienThi.setBackground(new Color(128, 128, 128));
		txtHienThi.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtHienThi.setBounds(10, 33, 283, 110);
		contentPane.add(txtHienThi);
		txtHienThi.setColumns(10);
		
		JButton btnNewButton_9 = new JButton(".");
//		btnNewButton_9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(HienThi.contains(".") == false && HienThi.length() != 0) {
//					HienThi += ".";
//					txtHienThi.setText(HienThi);
//				}
//			}
//		});
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_9.setBackground(new Color(128, 128, 128));
		btnNewButton_9.setBounds(160, 381, 55, 38);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("=");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HienThi.length() >= 19) {
					JOptionPane.showMessageDialog(null, "Kích thước quá lớn");
					txtHienThi.setText("");
					HienThi = "";
					txtHienThi.setFont(new Font("Tahoma", Font.PLAIN, 40));
				}else {
					switch (pheptoan) {
					case "+": {
						ketqua += Long.parseLong(HienThi);
						pheptoan = "";
						break;
					}
					case "-": {
						ketqua -= Long.parseLong(HienThi);
						pheptoan = "";
						break;
					}
					case "x": {
						ketqua *= Long.parseLong(HienThi);
						pheptoan = "";
						break;
					}
					case "/": {
						ketqua /= Long.parseLong(HienThi);
						pheptoan = "";
						break;
					}
					case "": {
						ketqua = Long.parseLong(HienThi);
						pheptoan = "";
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + pheptoan);
					}
					if(Long.toString(ketqua).length() <= 13) {
						txtHienThi.setText(Long.toString(ketqua));
						HienThi = txtHienThi.getText();
					}else if(Long.toString(ketqua).length() < 19) {
						txtHienThi.setFont(new Font("Tahoma", Font.PLAIN, 25));
						txtHienThi.setText(Long.toString(ketqua));
						HienThi = txtHienThi.getText();
					}else {
						JOptionPane.showMessageDialog(null, "Kích thước quá lớn");
						txtHienThi.setText("");
						HienThi = "";
						txtHienThi.setFont(new Font("Tahoma", Font.PLAIN, 40));
					}
				}
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.setBackground(new Color(255, 128, 0));
		btnNewButton_10.setBounds(238, 381, 55, 38);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_11.setBackground(new Color(255, 128, 0));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HienThi != "") {
					ketqua = Long.parseLong(HienThi);
					pheptoan = "+";
					HienThi = "";
					txtHienThi.setText(HienThi);
				}
			}
		});
		btnNewButton_11.setBounds(238, 324, 55, 38);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HienThi != "") {
					ketqua = Long.parseLong(HienThi);
					pheptoan = "-";
					HienThi = "";
					txtHienThi.setText(HienThi);
				}
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.setBackground(new Color(255, 128, 0));
		btnNewButton_12.setBounds(238, 265, 55, 38);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("x");
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_13.setBackground(new Color(255, 128, 0));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HienThi != "") {
					ketqua = Long.parseLong(HienThi);
					pheptoan = "x";
					HienThi = "";
					txtHienThi.setText(HienThi);
				}
			}
		});
		btnNewButton_13.setBounds(238, 210, 55, 38);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("/");
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_14.setBackground(new Color(255, 128, 0));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HienThi != "") {
					ketqua = Long.parseLong(HienThi);
					pheptoan = "/";
					HienThi = "";
					txtHienThi.setText(HienThi);
				}
			}
		});
		btnNewButton_14.setBounds(238, 153, 55, 38);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("%");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_15.setBackground(new Color(192, 192, 192));
		btnNewButton_15.setBounds(160, 153, 55, 38);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("+/-");
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_16.setBackground(new Color(192, 192, 192));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_16.setBounds(85, 153, 55, 38);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("C");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HienThi = "";
				txtHienThi.setText(HienThi);
				txtHienThi.setFont(new Font("Tahoma", Font.PLAIN, 40));
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_17.setBackground(new Color(192, 192, 192));
		btnNewButton_17.setForeground(new Color(0, 0, 0));
		btnNewButton_17.setBounds(10, 153, 55, 38);
		contentPane.add(btnNewButton_17);
		
		JLabel lblNewLabel = new JLabel("Casio 780");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setBounds(226, 10, 67, 13);
		contentPane.add(lblNewLabel);
	}
}
