package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XeOTo extends Xe {

	public XeOTo(String loaixe, String bienso, String vexe, String timeIn, String timeOut, String tinhtrangVao,
			String tinhtrangRa) {
		super(loaixe, bienso, vexe, timeIn, timeOut, tinhtrangVao, tinhtrangRa);
		// TODO Auto-generated constructor stub
	}
	public String TienThue() throws Exception{
		if(!tinhtrangVao.equals(tinhtrangRa)) return "Chua xac dinh - Dang xu ly boi thuong";
		SimpleDateFormat dd = new SimpleDateFormat("hh:mm dd/MM/yyyy");
		Date ti = dd.parse(timeIn);
		Date to = dd.parse(timeOut);
		long ans;
		long tis = ti.getTime();
		long tos = to.getTime();
		long tmp = Math.abs(tos - tis);
		
		Double time = (double) tmp/(60*60*1000);
		int timeint = (int) tmp/(60*60*1000);
		if(time - timeint > 0.5) {
			ans = timeint*10000 + 10000;
			return String.valueOf(ans);
		}else if(time - timeint > 0){
			ans = timeint*10000 + 5000;
			return String.valueOf(ans);
		}else {
			ans = timeint*10000;
			return String.valueOf(ans);
		}
	}
	@Override
	public String toString() {
		return "XeOTo [loaixe=" + loaixe + ", bienso=" + bienso + ", vexe=" + vexe + ", timeIn=" + timeIn + ", timeOut="
				+ timeOut + ", tinhtrangVao=" + tinhtrangVao + ", tinhtrangRa=" + tinhtrangRa + "]";
	}
	
	
}
