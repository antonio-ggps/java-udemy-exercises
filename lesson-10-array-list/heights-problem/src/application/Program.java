package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int n, idade, maiores;
		double altura, somaAltura, percentage;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < n; i++) {
		System.out.println("Dados da " + (i+1) + "a pessoa:" );
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Idade: ");
		idade = sc.nextInt();
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		vect[i] = new Product(name, idade, altura);
		}
		
		somaAltura = 0.0;
		for (int i = 0; i < vect.length; i++) {
			somaAltura += vect[i].getAltura();
		}
		
		double media = somaAltura / vect.length;

		System.out.println();
		System.out.printf("Altura media: %.2f%n", media);
		
		maiores = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16.0) {
				maiores += 1;
			}
		}
			    
		percentage = ((double)maiores/vect.length) * 100.0;
	    System.out.println("Pessoas com menos de 16 anos:" + percentage + "%");
		
	    for (int i = 0; i < vect.length; i++) {
	    	if (vect[i].getIdade() < 16) {
				 System.out.print(vect[i].getName());
				 System.out.println();
			}	
	    }
			
		sc.close();
	}
}
