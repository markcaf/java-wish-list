package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Bonus2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String word = sc.next();
		sc.close();
		
		String[] wordArray = word.split("");
		
		Map<String, Integer> wordMap = new TreeMap<>();
		
		for (String letter : wordArray) {
			int counter = 0;
			if (!wordMap.containsKey(letter)) {
				counter = 1;
				wordMap.put(letter, counter);
			} else {
				counter = wordMap.get(letter) + 1;
				wordMap.put(letter, counter);
			}
		}
		
		System.out.println("\nStampa dei caratteri e la loro frequenza:\n" + wordMap);

	}

}
