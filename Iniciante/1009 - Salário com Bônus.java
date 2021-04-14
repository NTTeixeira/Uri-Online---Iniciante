package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();

		double salario = salarioFixo + (totalVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f", salario);

		sc.close();
	}

}
