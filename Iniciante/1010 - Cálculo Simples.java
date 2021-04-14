package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPe1 = sc.nextInt();
		int numeroPe1 = sc.nextInt();
		double valorPe1 = sc.nextDouble();
		
		int codPe2 = sc.nextInt();
		int numeroPe2 = sc.nextInt();
		double valorPe2 = sc.nextDouble();

		double valorPagar = (numeroPe1 * valorPe1) + (numeroPe2 * valorPe2);
		
		System.out.printf("VALOR A PAGAR = R$ %.2f", valorPagar);

		sc.close();
	}

}
