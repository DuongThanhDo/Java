package bean;

public class ThongTinXe {
	protected String cmnd, hoten, gioitinh, maso, mauson;

	public ThongTinXe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThongTinXe(String cmnd, String hoten, String gioitinh, String maso, String mauson) {
		super();
		this.cmnd = cmnd;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.maso = maso;
		this.mauson = mauson;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getMaso() {
		return maso;
	}

	public void setMaso(String maso) {
		this.maso = maso;
	}

	public String getMauson() {
		return mauson;
	}

	public void setMauson(String mauson) {
		this.mauson = mauson;
	}
	
}
