package CoCaRo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MainCCR extends JFrame {
	String HienThi= "";
	String KqPlayer01 = "";
	String KqPlayer02 = "";
	int dem = 0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCCR frame = new MainCCR();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public boolean KetQua(String a) {
		if(		a.contains("1")&&a.contains("2")&&a.contains("3")||
				a.contains("4")&&a.contains("5")&&a.contains("6")||
				a.contains("7")&&a.contains("8")&&a.contains("9")||
				a.contains("1")&&a.contains("4")&&a.contains("7")||
				a.contains("2")&&a.contains("5")&&a.contains("8")||
				a.contains("3")&&a.contains("6")&&a.contains("9")||
				a.contains("1")&&a.contains("5")&&a.contains("9")||
				a.contains("3")&&a.contains("7")&&a.contains("5")) {
			return true;
		}
		return false;
	}
	public void end() {
		if(KetQua(KqPlayer01)) {
			JOptionPane.showInternalMessageDialog(null, "Player 01 Win");
			KqPlayer01 = "";
			KqPlayer02 = "";
		}
		else if(KetQua(KqPlayer02)) {
			JOptionPane.showInternalMessageDialog(null, "Player 02 Win");
			KqPlayer01 = "";
			KqPlayer02 = "";
		}
		else if(dem == 9 && KqPlayer01.length() >= 4) {
			JOptionPane.showInternalMessageDialog(null, "Draw");
		}
	}
	/**
	 * Create the frame.
	 */
	public MainCCR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayer01 = new JLabel("Player 01");
		lblPlayer01.setForeground(new Color(0, 0, 0));
		lblPlayer01.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPlayer01.setBounds(10, 208, 90, 43);
		contentPane.add(lblPlayer01);
		
		JLabel lblPlayer02 = new JLabel("Player 02");
		lblPlayer02.setForeground(new Color(0, 0, 0));
		lblPlayer02.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPlayer02.setBounds(589, 208, 100, 43);
		contentPane.add(lblPlayer02);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
//			1
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("1")==false) {
					if(dem%2==0) {
						btnNewButton.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "1";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
						
					}else {
						btnNewButton.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "1";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "1";
					end();
				}
			}
		});
		btnNewButton.setBounds(157, 43, 100, 100);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
//			2
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("2")==false) {
					if(dem%2==0) {
						btnNewButton_1.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "2";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_1.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "2";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "2";
					end();
				}
			}
		});
		btnNewButton_1.setBounds(300, 43, 100, 100);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
//			3
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("3")==false) {
					if(dem%2==0) {
						btnNewButton_2.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "3";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_2.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "3";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "3";
					end();
				}
			}
		});
		btnNewButton_2.setBounds(443, 43, 100, 100);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
//			4
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("4")==false) {
					if(dem%2==0) {
						btnNewButton_3.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "4";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_3.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "4";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "4";
					end();
				}
			}
		});
		btnNewButton_3.setBounds(157, 184, 100, 100);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
//			5
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("5")==false) {
					if(dem%2==0) {
						btnNewButton_4.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "5";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_4.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "5";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "5";
					end();
				}
			}
		});
		btnNewButton_4.setBounds(300, 184, 100, 100);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
//			6
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("6")==false) {
					if(dem%2==0) {
						btnNewButton_5.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "6";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_5.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "6";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "6";
					end();
				}
			}
		});
		btnNewButton_5.setBounds(443, 184, 100, 100);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.addActionListener(new ActionListener() {
//			7
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("7")==false) {
					if(dem%2==0) {
						btnNewButton_6.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "7";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_6.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "7";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "7";
					end();
				}
			}
		});
		btnNewButton_6.setBounds(157, 316, 100, 100);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.addActionListener(new ActionListener() {
//			8
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("8")==false) {
					if(dem%2==0) {
						btnNewButton_7.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "8";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_7.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "8";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "8";
					end();
				}
			}
		});
		btnNewButton_7.setBounds(300, 316, 100, 100);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.addActionListener(new ActionListener() {
//			9
			public void actionPerformed(ActionEvent e) {
				if(HienThi.contains("9")==false) {
					if(dem%2==0) {
						btnNewButton_8.setBackground(new Color(0, 204, 255));
						KqPlayer01 += "9";
						lblPlayer01.setForeground(new Color(0, 0, 0));
						lblPlayer02.setForeground(new Color(0, 255, 0));
					}else {
						btnNewButton_8.setBackground(new Color(255, 51, 102));
						KqPlayer02 += "9";
						lblPlayer02.setForeground(new Color(0, 0, 0));
						lblPlayer01.setForeground(new Color(0, 255, 0));
					}
					dem++;
					HienThi += "9";
					end();
				}
			}
		});
		btnNewButton_8.setBounds(443, 316, 100, 100);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(new Color(0, 204, 255));
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(10, 261, 85, 35);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(new Color(255, 51, 102));
		btnNewButton_10.setForeground(new Color(0, 204, 255));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(589, 261, 85, 35);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Reset");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton_1.setBackground(new Color(255, 255, 255));
				btnNewButton_2.setBackground(new Color(255, 255, 255));
				btnNewButton_3.setBackground(new Color(255, 255, 255));
				btnNewButton_4.setBackground(new Color(255, 255, 255));
				btnNewButton_5.setBackground(new Color(255, 255, 255));
				btnNewButton_6.setBackground(new Color(255, 255, 255));
				btnNewButton_7.setBackground(new Color(255, 255, 255));
				btnNewButton_8.setBackground(new Color(255, 255, 255));
				lblPlayer01.setForeground(new Color(0, 0, 0));
				lblPlayer02.setForeground(new Color(0, 0, 0));
				dem = 0;
				HienThi = "";
				KqPlayer01 = "";
				KqPlayer02 = "";
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_11.setBounds(284, 470, 140, 47);
		contentPane.add(btnNewButton_11);
	}
}
