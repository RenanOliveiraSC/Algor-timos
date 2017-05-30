package condicionais_interadores;

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num1, num2, result;

		System.out.println("Digite um numero Double:");
		num1 = scanner.nextDouble();
		System.out.println("Digite outro numero Double:");
		num2 = scanner.nextDouble();
		result = num1 + num2;
		// a. Se a soma dos números for maior que 20, imprima no console
		// (resultado da soma) é maior que 20”

		if (result > 20) {
			System.out.print(result + " " + "é maior que 20");
		}
		// b. Se a soma dos números for maior que 30, imprima no console
		// (resultado da soma) é maior que 30”
		if (result > 30) {
			System.out.print(result + " " + "é maior que 30");
		}
		// c. Se a soma dos números for maior que 10 ou maior que 20, imprima no
		// console (resultado da soma) é maior que 10
		// ou (resultado da soma) maior que 20 ”
		if (result > 10 || result > 20) {
			System.out.print(result + " " + "é maior que 10 ou" + result + " " + "maior que 20");
		}
		// d. Se a soma dos número é múltiplo de 5 e múltiplo de 10, imprima no
		// console (resultado da soma) é múltiplo de 5
		// e (resultado da soma) de 10”
		if (result % 5 == 0 && result % 10 == 0) {
			System.out.print(result + " " + "é multiplo de 5 e " + result + " " + "de 10");
		}
		scanner.close();
	}
}