package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProducts;
import entities.Product;
import entities.UsedProducts;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char x = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			switch (x) {
			case 'i':
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				Product p = new ImportProducts(name, price, customFee);
				list.add(p);
				break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				p = new UsedProducts(name, price, manufactureDate);
				list.add(p);
				break;
			case 'c':
				p = new Product(name, price);
				list.add(p);
				break;
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}

		sc.close();
	}

}
