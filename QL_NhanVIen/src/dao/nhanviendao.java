package dao;

import bean.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class nhanviendao {
	SimpleDateFormat dd= new SimpleDateFormat("dd/MM/yyyy");

	public ArrayList<nhanvienbean> getnv() throws Exception {
		ArrayList<nhanvienbean> ds = new ArrayList<nhanvienbean>();
		FileReader fr = new FileReader("nhanvien.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line=="" || line==null) break;
			String[] t= line.split("[;]");
			String manv= t[0];
			String hoten= t[1];
			Date ngaysinh= dd.parse(t[2]);
			Double hsl= Double.parseDouble(t[3]);
			String madv= t[4];
			nhanvienbean nv= new nhanvienbean(manv, hoten, ngaysinh, hsl, madv);
			ds.add(nv);
		}
		br.close();
		return ds;
	}
	public void setnv(ArrayList<nhanvienbean> ds) throws Exception {
		FileWriter fw = new FileWriter("nhanvien.txt");
		PrintWriter pw = new PrintWriter(fw);
		for(nhanvienbean nv: ds) {
			String manv = nv.getManv();
			String hoten = nv.getHoten();
			String ns= dd.format(nv.getNgaysinh());
			String hsl = nv.getHsl().toString();
			String madv = nv.getMadv();
			pw.println(manv+";"+hoten+";"+ns+";"+hsl+";"+madv);
		}
		pw.close();
	}
}
