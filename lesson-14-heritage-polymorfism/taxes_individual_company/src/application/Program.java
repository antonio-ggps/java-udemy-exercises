package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Data;
import entities.LegalPersonData;
import entities.NaturalPersonData;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Data> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char x = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			switch (x) {
			case 'i':
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				Data data = new NaturalPersonData(name, anualIncome, healthExpenditures);
				list.add(data);
				break;
			case 'c':
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				data = new LegalPersonData(name, anualIncome, numberEmployees);
				list.add(data);
				break;
			}
		}

		double taxesPaid = 0.0;

		System.out.println();
		System.out.println("TAXES PAID:");
		for (Data data : list) {
			taxesPaid += data.taxesPaid();
			System.out.println(data.getName() + ": $ " + String.format("%.2f", data.taxesPaid()));
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $" + taxesPaid);

		sc.close();
	}
}
