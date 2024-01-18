package password;

import java.util.Scanner;

import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) {

		System.out.println("Inserisca un numero: ");
		Scanner nr = new Scanner(System.in);
		
		int nrCh = nr.nextInt();
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";

        SecureRandom random = new SecureRandom();
        StringBuilder randomPass = new StringBuilder();

        for (int i = 0; i < nrCh; i++) {
            int j = random.nextInt(characters.length());
            randomPass.append(characters.charAt(j));
        } 
        
        System.out.println(randomPass.toString());
    }
}