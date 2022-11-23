package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bonus1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String word = sc.nextLine();	
		sc.close();
		
		String[] wordArray = word.split("");
		
		Set<String> singleChars = new TreeSet<>();
		
		for (int i = 0; i < wordArray.length; i++ ) {
			String letter = wordArray[i];
			singleChars.add(letter);
		}
		
		System.out.println("\nStampa dei singoli caratteri:\n" + singleChars);

	}

}
