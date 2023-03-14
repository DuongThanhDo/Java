package view;

import java.util.ArrayList;

import bean.*;
import bo.*;

public class Main {

	public static void main(String[] args) {
		try {
			QuanLyBaibo qlbb = new QuanLyBaibo();
			ArrayList<String> ds = new ArrayList<String>();
			ArrayList<Xe> dsv;
			ArrayList<Xe> dsr;
			dsv = qlbb.getTTVao();
			dsr = qlbb.getTTRa();
			System.out.println("Vao");
			for(Xe xe: dsv) {
				System.out.println(xe.toString());
			}
			System.out.println("Ra");
			for(Xe xe: dsr) {
				String tmp;
				System.out.println(xe.toString());
				if(xe instanceof XeOTo) {
					XeOTo oto = (XeOTo) xe;
					System.out.println(oto.TienThue());
					tmp = oto.getLoaixe()+";"+oto.getBienso()+";"+oto.getVexe()+";"+oto.getTimeIn()+";"+oto.getTimeOut()+";"+oto.TienThue();
					ds.add(tmp);
				}
				else if(xe instanceof XeMay) {
					XeMay xm = (XeMay) xe;
					System.out.println(xm.TienThue());
					tmp = xm.getLoaixe()+";"+xm.getBienso()+";"+xm.getVexe()+";"+xm.getTimeIn()+";"+xm.getTimeOut()+";"+xm.TienThue();
					ds.add(tmp);
				}
				else if(xe instanceof XeDap) {
					XeDap xd = (XeDap) xe;
					System.out.println(xd.TienThue());
					tmp = xd.getLoaixe()+";"+xd.getBienso()+";"+xd.getVexe()+";"+xd.getTimeIn()+";"+xd.getTimeOut()+";"+xd.TienThue();
					ds.add(tmp);
				}
			}
			qlbb.setTienThue(ds);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
