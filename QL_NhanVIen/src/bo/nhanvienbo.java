package bo;

import java.util.ArrayList;
import java.util.Date;

import bean.*;
import dao.*;

public class nhanvienbo {
	nhanviendao nvdao = new nhanviendao();
	ArrayList<nhanvienbean> ds;
	public ArrayList<nhanvienbean> getnv() throws Exception {
		ds= nvdao.getnv();
		return ds;
	}
	public ArrayList<nhanvienbean> Them(String manv, String hoten, Date ngaysinh, Double hsl, String madv)
	throws Exception {
		for(nhanvienbean nv: ds)
			if(nv.getManv().toLowerCase().trim().equals(manv.toLowerCase().trim()))
				return null;
		ds.add(new nhanvienbean(manv, hoten, ngaysinh, hsl, madv));
		return ds;
	}
	public ArrayList<nhanvienbean> Sua(String manv, String hoten, Date ngaysinh, Double hsl, String madv)
	throws Exception {
		for(nhanvienbean nv: ds)
			if(nv.getManv().toLowerCase().trim().equals(manv.toLowerCase().trim())){
				nv.setManv(manv);
				nv.setHoten(hoten);
				nv.setNgaysinh(ngaysinh);
				nv.setHsl(hsl);
				nv.setMadv(madv);
			}
		return ds;
	}
	public ArrayList<nhanvienbean> Xoa(String manv) throws Exception {
		for(nhanvienbean nv: ds) {
			if(nv.getManv().toLowerCase().trim().equals(manv.toLowerCase().trim())) {
				ds.remove(nv);
				break;
			}
		}
		return ds;
	}
	public void Luu(ArrayList<nhanvienbean> ds) throws Exception {
		nvdao.setnv(ds);
	}
}
