package model;

public class Segreteria {
	
	public static String creaID (String n, String c, int a) {
		return n.substring(0,2) + c.substring(0,2) + a;
	}
}
