package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guests;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, room;
		String name, email;

		System.out.print("How many room will be rented? ");
		n = sc.nextInt();
		Guests[] vect = new Guests[10];

		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.next();
			System.out.print("Room: ");
			room = sc.nextInt();
			vect[room] = new Guests(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		sc.close();
	}

}
