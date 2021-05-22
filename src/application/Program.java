package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter the number of products:");
		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			System.out.println("Product #"+ (i+1) + " data:");
			System.out.println("Common, used or imported (c/u/i)? ");
			char status = sc.next().charAt(0);
			
			
		}
		
		
		sc.close();

	}

}
