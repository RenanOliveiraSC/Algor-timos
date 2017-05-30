//Escreve um algoritmo que o usuário entre com três números e imprima o maior número entre eles, utilizando apenas um System.out.println.
package condicionais_interadores;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero, menor, maior;
		System.out.println("Digite um numero");
		numero = scanner.nextInt();

		menor = numero;
		maior = numero;
		System.out.println("Digite um numero");
		numero = scanner.nextInt();

		if (numero > maior) {
			maior = numero;
		}
		if (numero < menor) {
			menor = numero;
		}
		System.out.println("Digite um numero");
		numero = scanner.nextInt();

		if (numero > maior) {
			maior = numero;
		}
		if (numero < menor) {
			menor = numero;
		}
		System.out.println("Maior =" + maior);
	}
}
