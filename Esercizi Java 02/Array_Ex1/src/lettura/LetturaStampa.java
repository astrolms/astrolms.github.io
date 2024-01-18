package lettura;

import java.util.Scanner;

public class LetturaStampa {
	public static void main (String[] args) {
		System.out.println("Inserisca i numeri: ");
		int[] intArray = new int[5];
		for (int i = 0; i < 5; i++)
		{
		Scanner nr = new Scanner(System.in);
		int n = nr.nextInt();
		intArray[i] = n;
		}
		
		System.out.println("Contenuto dell'array: ");
		for (int j = 0; j < 5; j++)
			System.out.println("el[" + j + "]=" + intArray[j]);		
	}
}