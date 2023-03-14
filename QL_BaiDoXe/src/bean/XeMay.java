package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XeMay extends Xe {
	public XeMay(String loaixe, String bienso, String vexe, String timeIn, String timeOut, String tinhtrangVao,
			String tinhtrangRa) {
		super(loaixe, bienso, vexe, timeIn, timeOut, tinhtrangVao, tinhtrangRa);
		// TODO Auto-generated constructor stub
	}
	public String TienThue() throws Exception{
		SimpleDateFormat dd = new SimpleDateFormat("hh:mm dd/MM/yyyy");
		Date ti = dd.parse(timeIn);
		Date to = dd.parse(timeOut);
		long ans;
		long tis = ti.getTime();
		long tos = to.getTime();
		long tmp = Math.abs(tos - tis);
		
		Double time = (double) tmp/(24*60*60*1000);
		int timeint = (int) tmp/(24*60*60*1000);
		if(time - timeint > 0) {
			ans = timeint * 3000 + 3000;
			return String.valueOf(ans);
		}else {
			ans = timeint * 3000;
			return String.valueOf(ans);
		}
	}
	@Override
	public String toString() {
		return "XeMay [loaixe=" + loaixe + ", bienso=" + bienso + ", vexe=" + vexe + ", timeIn=" + timeIn + ", timeOut="
				+ timeOut + ", tinhtrangVao=" + tinhtrangVao + ", tinhtrangRa=" + tinhtrangRa + "]";
	}
}	
