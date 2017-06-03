//Vamos considerar que temos que validar um campo texto de uma tela de cadastro
//de pessoa, no qual é um campo de observação. Caso a quantidade de caracteres
//que o usuário digitou for maior que 50, imprima false, caso contrário imprima true.
package exercicios.scanner;

import java.util.Scanner;

public class scanner15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String observacao;
		System.out.println("Digite uma observação:");
		observacao = scanner.nextLine();
		System.out.print("Observação:" + observacao + "\n");

		if (observacao.length() < 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();
	}
}
