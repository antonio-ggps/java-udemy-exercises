package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<vetA.length; i++) {
		vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i<vetA.length; i++) {
		vetB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i<n; i++) {
			vetA[i] += vetB[i];
			System.out.println(vetA[i]);
		}
		
		sc.close();
	}

}
