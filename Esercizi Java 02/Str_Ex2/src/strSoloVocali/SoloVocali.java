package strSoloVocali;

import java.util.Scanner;

public class SoloVocali {
	
	public static void main (String[] args) {
		
		System.out.println("Inserisca una stringa: ");
		
		Scanner svOb = new Scanner(System.in);
		
		String sv = svOb.nextLine();
		
		int len = sv.length();
		
		for (int i = 0; i < len; i++)
			if (sv.charAt(i) == 'a' || sv.charAt(i) == 'o' || sv.charAt(i) == 'u' ||
				sv.charAt(i) == 'i' || sv.charAt(i) == 'e') 
			System.out.print(sv.charAt(i));
	}
	
}