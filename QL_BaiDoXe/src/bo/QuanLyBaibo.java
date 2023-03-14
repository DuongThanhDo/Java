package bo;

import bean.Xe;
import java.util.ArrayList;

import dao.QuanLyBaidao;

public class QuanLyBaibo {
	QuanLyBaidao qlbd = new QuanLyBaidao();
	public ArrayList<Xe> getTTVao() throws Exception{
		ArrayList<Xe> ds;
		ds = qlbd.getTTVao();
		return ds;
	}
	public ArrayList<Xe> getTTRa() throws Exception{
		ArrayList<Xe> ds;
		ds = qlbd.getTTRa();
		return ds;
	}
	public void setTienThue(ArrayList<String> ds) throws Exception{
		qlbd.setTienThue(ds);
	}
}
