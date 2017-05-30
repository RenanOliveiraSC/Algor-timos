//7.	Calculadora
package condicionais_interadores;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double num;
		double num2;
		String operacao;
		double resultado;

		// a. Peça para o usuário digitar um número, e armazene o número
		System.out.println("Digite um número");
		num = input.nextDouble();

		// b. Peça para o usuário digitar um operador matemático (+, -, /, x), e
		// armazene o o operador
		System.out.println("Digite o operador matemático (+,-,/,x)");
		operacao = input.next();

		// c. Peça para o usuário digitar outro número, e armazene o número
		System.out.println("Digite outro número");
		num2 = input.nextDouble();

		// d. Caso o usuário digitou o operador +, some os dois números e
		// imprima o resultado “Valor da soma: &lt;resultado&gt;”.

		if (operacao.equals("+")) {
			resultado = num + num2;
			System.out.println("Valor da soma: " + resultado);
		}

		// e. Caso o usuário digitou o operador -, subtraia os dois números e
		// imprima o resultado “Valor da subtração: &lt;resultado&gt;”.
		if (operacao.equals("-")) {
			resultado = num - num2;
			System.out.println("Valor da subtração: " + resultado);
		}

		// f. Caso o usuário digitou o operador /, divida os dois números e
		// imprima o resultado “Valor da divisão: &lt;resultado&gt;”.
		if (operacao.equals("/")) {
			resultado = num / num2;
			System.out.println("O valor da divisão: " + resultado);
		}

		// g. Caso o usuário digitou o operador *, multiplique os dois números e
		// imprima o resultado “Valor da multiplicação: &lt;resultado&gt;”.
		if (operacao.equals("*")) {
			resultado = num * num2;
			System.out.println("Valor da multiplicação: " + resultado);

		}

	}
}
