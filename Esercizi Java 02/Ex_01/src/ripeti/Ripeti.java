package ripeti;

import java.util.Scanner;

class Ripeti {
	
	public static void main (String[] args) {
		
		Scanner str = new Scanner(System.in);
		System.out.println("Inserisca una stringa: ");
		String stringa = str.nextLine();
		
		Scanner intr = new Scanner(System.in);
		System.out.println("Inserisca un numero intero: ");
		int nr = intr.nextInt();
		
		aux(nr, stringa);
	}
	
	public static void aux (int nr, String stringa) {
		if (nr >= 0)
			for (int i = 0; i < nr; i++)
				System.out.println(stringa);
		else System.out.println("Errore: numero negativo!");
	}
}