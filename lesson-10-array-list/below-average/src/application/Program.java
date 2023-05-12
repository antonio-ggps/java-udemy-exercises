package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		double[] v = new double[n];
		
		soma = 0.0;
		
		for (int i=0; i<v.length; i++) {
			System.out.print("Digite um numero: ");
			v[i] = sc.nextDouble();
			soma += v[i];
		}
		
		media = soma / n;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA");
		
		for (int i=0; i<v.length; i++) {
			 if (v[i] < media) {
				 System.out.println(v[i]);
			 }
		}
			

		sc.close();
	}

}
