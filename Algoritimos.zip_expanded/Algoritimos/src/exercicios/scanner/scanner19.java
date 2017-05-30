//Peça para o usuário digitar um número. Guarde o número que o usuário digitou na
//variável “primeiroNumero”. Crie outra variável de nome “segundoNumero”, atribuindo
//o valor da variável “primeiroNumero”. Altere o valor da variavel “primeiroNumero”
//para 10. Imprima a variável “primeiroNumero” e a variável “segundoNumero”.
//Verifique os valores das variáveis, como ficaram.
package exercicios.scanner;

import java.util.Scanner;

public class scanner19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int primeiroNumero;
		System.out.println("Digite um número:");
		primeiroNumero = scanner.nextInt();

		int segundoNumero = primeiroNumero;
		primeiroNumero = 10;
		System.out.println("O primeiro número é: " + primeiroNumero);
		System.out.println("O segundo  número é: " + segundoNumero);
	}
}
