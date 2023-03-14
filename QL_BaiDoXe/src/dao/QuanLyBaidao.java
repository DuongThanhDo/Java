package dao;

import bean.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import bean.Xe;

public class QuanLyBaidao{
	public ArrayList<Xe> getTTVao() throws Exception{
		ArrayList<Xe> ds = new ArrayList<Xe>();
		FileReader fr = new FileReader("input1.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null || line == "") break;
			String[] t = line.split("[;]");
			if(t[0].equals("0")) {
				ds.add(new XeDap(t[0], t[1], t[2], t[3], "", t[4], ""));
			}else if(t[0].equals("2")) {
				ds.add(new XeMay(t[0], t[1], t[2], t[3], "", t[4], ""));
			}else {
				ds.add(new XeOTo(t[0], t[1], t[2], t[3], "", t[4], ""));
			}
		}
		br.close();
		return ds;
	}
	public ArrayList<Xe> getTTRa() throws Exception{
		ArrayList<Xe> ds = new ArrayList<Xe>();
		ds = getTTVao();
		FileReader fr = new FileReader("input2.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null || line == "") break;
			String[] t = line.split("[;]");
			for(Xe s : ds) {
				if(t[0].equals("0")) {
					if(s instanceof XeDap) {
						XeDap xd = (XeDap) s;
						if(t[2].equals(xd.getVexe())) {
							xd.setTimeOut(t[3]);
							xd.setTinhtrangRa(t[4]);
						}
					}
				}else  {
					if(s instanceof XeMay) {
						XeMay xm = (XeMay) s;
						if(t[1].equals(xm.getBienso())) {
							xm.setTimeOut(t[3]);
							xm.setTinhtrangRa(t[4]);
						}
					}else if(s instanceof XeOTo) {
						XeOTo xo = (XeOTo) s;
						if(t[1].equals(xo.getBienso())) {
							xo.setTimeOut(t[3]);
							xo.setTinhtrangRa(t[4]);
						}
					}
				}
			}
		}
		br.close();
		return ds;
	}
	public void setTienThue(ArrayList<String> ds) throws Exception{
		FileWriter fw = new FileWriter("output.txt");
		PrintWriter pw = new PrintWriter(fw);
		for(String s: ds) {
			pw.println(s);
		}
		pw.close();
	}
}
