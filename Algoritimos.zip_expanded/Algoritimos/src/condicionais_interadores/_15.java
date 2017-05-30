///15.	Pergunte o nome da pessoa e a sua idade. 
//Pergunte o nome de outra pessoa e sua idade. 
//Imprima o nome da pessoa mais velha e a idade dela, 
//e o nome da pessoa mais nova e a idade dela, utilizando apenas um Sysout. Sendo considerado a idade uma variável int.
package condicionais_interadores;

import java.util.Scanner;

public class _15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int idade[] = new int[2];
		String nome1, nome2;
		int maior = -99999, menor = 99999;

		for (int aux = 0; aux < 2; aux++) {
			System.out.println("Digite o nome da pessoa: ");
			nome1 = scanner.nextLine();
		}
		for (int aux = 0; aux < 2; aux++) {
			System.out.println("Digita as idades");
			idade[aux] = scanner.nextInt();
		}
		for (int aux = 0; aux < 2; aux++) {
			if (idade[aux] > maior) {
				maior = idade[aux];
			}
			if (idade[aux] < menor) {
				menor = idade[aux];

			}
			System.out.println("");
		}

	}
}