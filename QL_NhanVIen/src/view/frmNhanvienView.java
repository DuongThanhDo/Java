package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bean.nhanvienbean;
import bo.nhanvienbo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class frmNhanvienView extends JFrame {

	private JPanel contentPane;
	private JTextField txtmanv;
	private JTextField txttennv;
	private JTextField txtns;
	private JTextField txthsl;
	private JTextField txtmadv;
	private JTable table;

	nhanvienbo nvbo = new nhanvienbo();
	ArrayList<nhanvienbean> dsnv;
	void NapBang(ArrayList<nhanvienbean> dsnv) {
		DefaultTableModel nvt = new DefaultTableModel();
		nvt.addColumn("Manv");
		nvt.addColumn("Tennv");
		nvt.addColumn("NgaySinh");
		nvt.addColumn("HSL");
		nvt.addColumn("Madv");
		for(nhanvienbean nv: dsnv) {
			Object[] t= new Object[5];
			t[0]= nv.getManv();
			t[1]= nv.getHoten();
			SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
			t[2]= dd.format(nv.getNgaysinh());
			t[3]= nv.getHsl();
			t[4]= nv.getMadv();
			nvt.addRow(t);
		}
		table.setModel(nvt);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmNhanvienView frame = new frmNhanvienView();
					frame.setTitle("Nhan Vien");
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
	public frmNhanvienView() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					dsnv = nvbo.getnv();
					NapBang(dsnv);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 963, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Manv:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(36, 27, 89, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tennv:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(36, 75, 89, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NgaySinh:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(36, 127, 89, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("HSL:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(36, 178, 89, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Madv:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(36, 230, 89, 26);
		contentPane.add(lblNewLabel_4);
		
		txtmanv = new JTextField();
		txtmanv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtmanv.setBounds(184, 26, 382, 28);
		contentPane.add(txtmanv);
		txtmanv.setColumns(10);
		
		txttennv = new JTextField();
		txttennv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txttennv.setBounds(184, 74, 382, 27);
		contentPane.add(txttennv);
		txttennv.setColumns(10);
		
		txtns = new JTextField();
		txtns.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtns.setBounds(184, 126, 382, 27);
		contentPane.add(txtns);
		txtns.setColumns(10);
		
		txthsl = new JTextField();
		txthsl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txthsl.setBounds(184, 177, 382, 27);
		contentPane.add(txthsl);
		txthsl.setColumns(10);
		
		txtmadv = new JTextField();
		txtmadv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtmadv.setBounds(184, 229, 382, 27);
		contentPane.add(txtmadv);
		txtmadv.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(36, 295, 878, 303);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(0, 153, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String manv= txtmanv.getText();
					String tennv= txttennv.getText();
					SimpleDateFormat dd= new SimpleDateFormat("dd/MM/yyyy");
					Date ns= dd.parse(txtns.getText());
					Double hsl= Double.parseDouble(txthsl.getText());
					String madv= txtmadv.getText();
					dsnv= nvbo.Them(manv, tennv, ns, hsl, madv);
					if(dsnv==null) {
						JOptionPane.showInternalMessageDialog(null, "Trung Ma!");
					}
					else {
						NapBang(dsnv);
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(648, 32, 108, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String manv= txtmanv.getText();
					String tennv= txttennv.getText();
					SimpleDateFormat dd= new SimpleDateFormat("dd/MM/yyyy");
					Date ns= dd.parse(txtns.getText());
					Double hsl= Double.parseDouble(txthsl.getText());
					String madv= txtmadv.getText();
					dsnv= nvbo.Sua(manv, tennv, ns, hsl, madv);
					NapBang(dsnv);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(0, 153, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(791, 32, 108, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int t = JOptionPane.showConfirmDialog(null, "Xoa hay ko?");
					if(t==0) {
						String manv= txtmanv.getText();
						dsnv= nvbo.Xoa(manv);
						NapBang(dsnv);
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(0, 153, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(648, 115, 108, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					nvbo.Luu(dsnv);
					JOptionPane.showInternalMessageDialog(null, "Luu thanh cong");
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setBackground(new Color(0, 153, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(791, 115, 108, 39);
		contentPane.add(btnNewButton_3);
	}
}
