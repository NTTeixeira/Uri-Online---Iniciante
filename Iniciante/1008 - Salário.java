package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFunc = sc.nextInt();
		int numeroHrsTrab = sc.nextInt();
		double valorPorHr = sc.nextDouble();

		double salario = numeroHrsTrab * valorPorHr;
		
		System.out.println("NUMBER = " + numeroFunc);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();
	}

}
