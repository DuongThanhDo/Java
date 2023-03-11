package bean;

import java.util.Date;

// microsoft sql server 2014 SP3

public class nhanvienbean {
	private String manv;
	private String hoten;
	private Date ngaysinh;
	private Double hsl;
	private String madv;
	public nhanvienbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public nhanvienbean(String manv, String hoten, Date ngaysinh, Double hsl, String madv) {
		super();
		this.manv = manv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.hsl = hsl;
		this.madv = madv;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public Double getHsl() {
		return hsl;
	}
	public void setHsl(Double hsl) {
		this.hsl = hsl;
	}
	public String getMadv() {
		return madv;
	}
	public void setMadv(String madv) {
		this.madv = madv;
	}
	@Override
	public String toString() {
		return "nhanvienbean [manv=" + manv + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", hsl=" + hsl + ", madv="
				+ madv + "]";
	}
	
}
