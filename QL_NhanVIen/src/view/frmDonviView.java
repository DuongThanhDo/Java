package view;

import java.awt.EventQueue;
import bo.*;
import bean.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bean.donvibean;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmDonviView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtmadv;
	private JTextField txttendv;

	donvibo dvbo= new donvibo();
	ArrayList<donvibean> dsdv;
	
	void NapBang(ArrayList<donvibean> dsdv) {
		DefaultTableModel dvt = new DefaultTableModel();
		dvt.addColumn("Madv");
		dvt.addColumn("Tendv");
		for(donvibean dv: dsdv) {
			Object[] t = new Object[2];
			t[0]= dv.getMadv();
			t[1]= dv.getTendv();
			dvt.addRow(t);
		}
		table.setModel(dvt);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDonviView frame = new frmDonviView();
					frame.setTitle("Don Vi");
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
	public frmDonviView() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					dsdv = dvbo.getdv();
					NapBang(dsdv);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String madv = txtmadv.getText();
					String tendv = txttendv.getText();
					dsdv = dvbo.Them(madv, tendv);
					if(dsdv == null) {
						JOptionPane.showInternalMessageDialog(null, "Trung ma!");
					}else {
						NapBang(dsdv);
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 153, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(105, 116, 109, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String madv = txtmadv.getText();
					String tendv = txttendv.getText();
					dsdv = dvbo.Sua(madv, tendv);
					NapBang(dsdv);
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(0, 153, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(268, 116, 101, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int t = JOptionPane.showConfirmDialog(null, "Xoa hay ko?");
					if(t==0) {
						String madv = txtmadv.getText();
						dsdv = dvbo.Xoa(madv);
						NapBang(dsdv);
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(0, 153, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(437, 116, 101, 50);
		contentPane.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(55, 166, 705, 245);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dvbo.Luu(dsdv);
					JOptionPane.showInternalMessageDialog(null, "Luu thanh cong");
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBackground(new Color(0, 153, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(604, 116, 101, 50);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Madv:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(105, 20, 83, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tendv:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(105, 61, 83, 32);
		contentPane.add(lblNewLabel_1);
		
		txtmadv = new JTextField();
		txtmadv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtmadv.setBounds(248, 17, 457, 34);
		contentPane.add(txtmadv);
		txtmadv.setColumns(10);
		
		txttendv = new JTextField();
		txttendv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txttendv.setBounds(248, 58, 457, 35);
		contentPane.add(txttendv);
		txttendv.setColumns(10);

	}
}
