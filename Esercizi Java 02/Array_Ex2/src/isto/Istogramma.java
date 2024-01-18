package isto;

import java.util.Scanner;

public class Istogramma {
	public static void main (String[] args) {
		int[] intArray = {4, 7, 2};
		for (int i = 0; i < 3; i++)
		{
			int j = intArray[i];
			for ( int y = 0; y < j; y++) {
				System.out.print("*");}
			System.out.println();
		}
	}
}