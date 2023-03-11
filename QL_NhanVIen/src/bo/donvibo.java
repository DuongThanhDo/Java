package bo;

import java.util.ArrayList;

import bean.*;
import dao.*;

public class donvibo {
	donvidao dvdao = new donvidao();
	ArrayList<donvibean> ds;
	public ArrayList<donvibean> getdv() throws Exception {
		ds= dvdao.getdv();
		return ds;
	}
	public ArrayList<donvibean> Them(String madv, String tendv)throws Exception {
		for(donvibean dv: ds)
			if(dv.getMadv().toLowerCase().trim().equals(madv.toLowerCase().trim()))
				return null;
		ds.add(new donvibean(madv, tendv));
		return ds;
	}
	public ArrayList<donvibean> Sua(String madv, String tendv)throws Exception {
		for(donvibean dv: ds)
			if(dv.getMadv().toLowerCase().trim().equals(madv.toLowerCase().trim())){
				dv.setMadv(madv);
				dv.setTendv(tendv);
			}
		return ds;
	}
	public ArrayList<donvibean> Xoa(String madv) throws Exception {
		for(donvibean dv: ds) {
			if(dv.getMadv().toLowerCase().trim().equals(madv.toLowerCase().trim())) {
				ds.remove(dv);
				break;
			}
		}
		return ds;
	}
	public void Luu(ArrayList<donvibean> ds) throws Exception {
		dvdao.setdv(ds);
	}
}
