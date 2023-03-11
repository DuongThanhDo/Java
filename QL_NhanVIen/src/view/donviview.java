package view;

import java.util.ArrayList;

import bean.*;
import bo.*;

public class donviview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			donvibo dvbo = new donvibo();
			ArrayList<donvibean> dsdv;
			dsdv = dvbo.getdv();
			for(donvibean dv: dsdv) {
				System.out.println(dv);
			}
			System.out.println("_____Them_____");
			dvbo.Them("dv15", "Khoa Tin");
			for(donvibean dv: dsdv) {
				System.out.println(dv);
			}
			System.out.println("_____Sua_____");
			dvbo.Sua("dv15", "Khoa Anh");
			for(donvibean dv: dsdv) {
				System.out.println(dv);
			}
			System.out.println("_____Xoa_____");
			dvbo.Xoa("dv15");
			for(donvibean dv: dsdv) {
				System.out.println(dv);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
