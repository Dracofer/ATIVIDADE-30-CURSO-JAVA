package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<n && i < 10; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i=0; i<n && i < 10; i++) {
			if(vect[i] <= 0) {
			System.out.printf("%d%n", vect[i] );
			}
		}
		sc.close();
	}

}
