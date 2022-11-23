package org.generation.italy.christmas;

import java.util.ArrayList;
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
				System.out.println("Ecco la tua wishlist completa: ");
				wishlist.sort(String.CASE_INSENSITIVE_ORDER);
				System.out.println(wishlist);
				exit = true;
			}
			
			if ( !userChoice.equals("si") && !userChoice.equals("no")) {
				System.out.println("Non ho capito la tua risposta, ma ecco la tua wishlist completa: ");
				wishlist.sort(String.CASE_INSENSITIVE_ORDER);
				System.out.println(wishlist);
				exit = true;
			}
			
		}
		
		sc.close();
		
	}

}
