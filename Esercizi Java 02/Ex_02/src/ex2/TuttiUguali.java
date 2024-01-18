package ex2;

import java.util.Scanner;

public class TuttiUguali {
	public static void main (String[] args) {
		System.out.println("Inserisca tre numeri: ");
		
		Scanner nrI = new Scanner(System.in);
		int nr1 = nrI.nextInt();
		
		Scanner nrII = new Scanner(System.in);
		int nr2 = nrII.nextInt();
		
		Scanner nrIII = new Scanner(System.in);
		int nr3 = nrIII.nextInt();	
	
		
		if (aux(nr1, nr2, nr3) == true) System.out.println("Tutti uguali!");
		else System.out.println("Almeno uno e diverso");		
	}
	
	public static boolean aux (int nr1, int nr2, int nr3)
	{
		if (nr1 == nr2 && nr1 == nr3) return true;
		else return false;
	}
}