package strContrario;

import java.util.Scanner;

public class Contrario {
	public static void main (String[] args) {
		
		System.out.println("Inserisca una stringa: ");
		
		Scanner cntrOb = new Scanner(System.in);
		
		String cntr = cntrOb.nextLine();
		
		int len = cntr.length();
		
		for (int i = len-1; i >= 0; i--)
			System.out.print(cntr.charAt(i));
	}
}