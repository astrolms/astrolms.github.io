package minimo;

import java.util.Scanner;

public class MinimoArray {
	public static void main (String[] args) {
		System.out.println("Inserisca 10 numeri: ");
		int[] intArray = new int[10];
		for (int i = 0; i < 10; i++)
		{
		Scanner nr = new Scanner(System.in);
		int n = nr.nextInt();
		intArray[i] = n;
		}
		
		int nrMin = intArray[0];
		int pos = 0;
		System.out.println("Contenuto dell'array: ");
		for (int i = 0; i < 10; i++) {
			if (intArray[i] < nrMin) {nrMin=intArray[i];
			pos = i;
			break;
			}
		}
		System.out.println("Il numero minimo e: " + nrMin + " Posizione: " + pos);
			
	}
}