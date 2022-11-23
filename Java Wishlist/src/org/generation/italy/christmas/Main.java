package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Creare una classe Main con metodo main, in cui implementare il seguente programma: 
		 * Creare una nuova ArrayList dove salvare la lista dei desideri 
		 * Continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi
		 * Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare. 
		 * Ad ogni iterazione aggiungere il desiderio alla lista. 
		 * Al termine dell’inserimento ordinare la lista e stampare a video la lista ordinata.
		 */
		
		// Collection
		List<String> wishlist = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		while(!exit) {
			
			System.out.println("La Wishlist attuale contiene " + wishlist.size() + " elementi");
			System.out.println("------------------");
			System.out.print("Vuoi inserire un nuovo desiderio nella lista? (si/no): ");
			String userChoice = sc.nextLine();
			
			if (userChoice.equals("si")) {
				System.out.print("Scrivi cosa vuoi aggiungere alla tua lista: ");
				String elementToAdd = sc.nextLine();
				wishlist.add(elementToAdd);
				System.out.println("------------------");
			}
			
			if (userChoice.equals("no")) {
				System.out.println("------------------");
				System.out.println("Ecco la tua wishlist completa: ");
				exit = true;
			}
			
			if ( !userChoice.equals("si") && !userChoice.equals("no")) {
				System.out.println("------------------");
				System.out.println("Non ho capito la tua risposta, ma ecco la tua wishlist completa: ");
				exit = true;
			}
			
		}
		
		sc.close();
		wishlist.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("\nOrdine Alfabetico:\n" + wishlist);
		
		wishlist.sort(new StringComparator());
		System.out.println("\nOrdine per numero di vocali:\n" + wishlist);
	}
	
	public static class StringComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			int value1 = 0;
			int value2 = 0;

			for (int i = 0; i < o1.length(); i++) {
				if (o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' || o1.charAt(i) == 'o'
						|| o1.charAt(i) == 'u') {
					value1++;
				}
			}

			for (int i = 0; i < o2.length(); i++) {
				if (o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' || o2.charAt(i) == 'o'
						|| o2.charAt(i) == 'u') {
					value2++;
				}
			}

			return value2 - value1;
		}

	}
}
