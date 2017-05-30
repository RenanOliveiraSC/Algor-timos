//16.	Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua idade. 
//Pergunte o nome da terceira pessoa e sua idade. Imprima o nome e idade de pessoas mais velha, do meio e a mais nova, utilizando apenas um Sysout. 
//Sendo considerado a idade uma variável int.
package condicionais_interadores;

import java.util.Scanner;

public class _16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] idade = new int[3];
		int maior = -99999, menor = 99999, meio = 0;
		String[] nome = new String[3];

		

		for (int aux = 0; aux < idade.length; aux++) {
			System.out.println("Digite o nome da primeira pessoa !");
			nome[aux] = scanner.nextLine();
			System.out.println("Qual é a idade dela?");
			idade[aux] = Integer.parseInt(scanner.nextLine());
			}

		for (int aux = 0; aux < idade.length; aux++) {
			if (idade[aux] > maior) {
				maior = idade[aux];
			}
			if (idade[aux] < menor) {
				menor = idade[aux];
			}
		}
		for (int aux = 0; aux < idade.length; aux++) {
			if (idade[aux] > menor && idade[aux] < maior) {
				meio = idade[aux];
			}
		}
		System.out.println("Ordem descrescente" + " " + maior + " " + meio + " " + menor);
	}
}
