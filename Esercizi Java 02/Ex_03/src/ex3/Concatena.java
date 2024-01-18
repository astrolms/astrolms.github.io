package ex3;

import java.util.Scanner;

public class Concatena {
	public static void main (String[] args) {
		System.out.println("Inserisca tre parole:");
		
		Scanner pI = new Scanner (System.in);
		String p1 = pI.nextLine();
		
		Scanner pII = new Scanner (System.in);
		String p2 = pII.nextLine();
		
		Scanner pIII = new Scanner (System.in);
		String p3 = pIII.nextLine();
		
		System.out.println(aux(p1, p2, p3));
	}
	
	public static String aux (String p1, String p2, String p3) {
		return p1 + '*' + p2 + '*' + p3;
	}	
}

