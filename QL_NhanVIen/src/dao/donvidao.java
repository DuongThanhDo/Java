package dao;

import bean.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class donvidao {
	
	public ArrayList<donvibean> getdv() throws Exception {
		//Tao 1 mang de luu all cac dv trong file donvi.txt
		ArrayList<donvibean> ds = new ArrayList<donvibean>();
		//Mo file
		FileReader fr = new FileReader("donvi.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line=="" || line==null) break;
			String[] t= line.split("[;]");
			String madv= t[0];
			String tendv= t[1];
			donvibean dv = new donvibean(madv, tendv);
			ds.add(dv);
		}
		br.close();
		return ds;
	}
	public void setdv(ArrayList<donvibean> ds) throws Exception {
		FileWriter fw = new FileWriter("donvi.txt");
		PrintWriter pw = new PrintWriter(fw);
		for(donvibean dv: ds) {
			String madv = dv.getMadv();
			String tendv = dv.getTendv();
			pw.println(madv+";"+tendv);
		}
		pw.close();
	}
}
