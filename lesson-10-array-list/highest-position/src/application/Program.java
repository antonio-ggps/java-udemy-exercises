package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double maiorNumero = Double.MIN_VALUE;
		double indiceMaior = 0.0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length; i++) {
		    if (vect[i] > maiorNumero) {
		        maiorNumero = vect[i];
		        indiceMaior = i;
		    }
		}
		
		System.out.println("MAIOR VALOR = " + maiorNumero);
		System.out.println("POSICAO DO MAIOR VALOR = " + (int) indiceMaior);

		sc.close();

	}

}
