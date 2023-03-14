package bean;

public class Xe extends ThongTinXe{
	protected String loaixe, bienso, vexe, timeIn, timeOut, tinhtrangVao, tinhtrangRa;
	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Xe(String loaixe, String bienso, String vexe, String timeIn, String timeOut, String tinhtrangVao,
			String tinhtrangRa) {
		super();
		this.loaixe = loaixe;
		this.bienso = bienso;
		this.vexe = vexe;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.tinhtrangVao = tinhtrangVao;
		this.tinhtrangRa = tinhtrangRa;
	}
	public String getLoaixe() {
		return loaixe;
	}
	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}
	public String getBienso() {
		return bienso;
	}
	public void setBienso(String bienso) {
		this.bienso = bienso;
	}
	public String getVexe() {
		return vexe;
	}
	public void setVexe(String vexe) {
		this.vexe = vexe;
	}
	public String getTimeIn() {
		return timeIn;
	}
	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}
	public String getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
	public String getTinhtrangVao() {
		return tinhtrangVao;
	}
	public void setTinhtrangVao(String tinhtrangVao) {
		this.tinhtrangVao = tinhtrangVao;
	}
	public String getTinhtrangRa() {
		return tinhtrangRa;
	}
	public void setTinhtrangRa(String tinhtrangRa) {
		this.tinhtrangRa = tinhtrangRa;
	}
	@Override
	public String toString() {
		return "Xe [loaixe=" + loaixe + ", bienso=" + bienso + ", vexe=" + vexe + ", timeIn=" + timeIn + ", timeOut="
				+ timeOut + ", tinhtrangVao=" + tinhtrangVao + ", tinhtrangRa=" + tinhtrangRa + "]";
	}
	
}
