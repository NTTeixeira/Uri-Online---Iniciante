package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double area = 0, PI = 3.14159;
		
		area = PI * Math.pow(raio, 2);
		
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
	}

}
