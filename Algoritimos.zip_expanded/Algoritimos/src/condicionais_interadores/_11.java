//11.	Escreve um algoritmo que o usuário entre com três números, e imprima os números em ordem decrescente.
package condicionais_interadores;

import java.util.Scanner;

public class _11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero[] = new int[3];
		int maior = -999999, menor = 999999, meio = 0;

		for (int aux = 0; aux < 3; aux++) {
			System.out.println("Digite os números!: ");
			numero[aux] = scanner.nextInt();
		}

		for (int aux = 0; aux < 3; aux++) {
			if (numero[aux] > maior) {
				maior = numero[aux];
			}
			if (numero[aux] < menor) {
				menor = numero[aux];
			}
		}
		for (int aux = 0; aux < 3; aux++) {
			if (numero[aux] > menor && numero[aux] < maior) {
				meio = numero[aux];
			}
		}
		System.out.println("Ordem descrescente" + " " + maior + " " + meio + " " + menor);
	}
}
