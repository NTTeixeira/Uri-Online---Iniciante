package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		
		double area = 0, volume = 4.0/3, PI = 3.14159;
		
		area = volume * PI * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f", area);

		sc.close();
	}

}
