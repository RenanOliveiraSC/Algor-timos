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

		// a. Pe�a para o usu�rio digitar um n�mero, e armazene o n�mero
		System.out.println("Digite um n�mero");
		num = input.nextDouble();

		// b. Pe�a para o usu�rio digitar um operador matem�tico (+, -, /, x), e
		// armazene o o operador
		System.out.println("Digite o operador matem�tico (+,-,/,x)");
		operacao = input.next();

		// c. Pe�a para o usu�rio digitar outro n�mero, e armazene o n�mero
		System.out.println("Digite outro n�mero");
		num2 = input.nextDouble();

		// d. Caso o usu�rio digitou o operador +, some os dois n�meros e
		// imprima o resultado �Valor da soma: &lt;resultado&gt;�.

		if (operacao.equals("+")) {
			resultado = num + num2;
			System.out.println("Valor da soma: " + resultado);
		}

		// e. Caso o usu�rio digitou o operador -, subtraia os dois n�meros e
		// imprima o resultado �Valor da subtra��o: &lt;resultado&gt;�.
		if (operacao.equals("-")) {
			resultado = num - num2;
			System.out.println("Valor da subtra��o: " + resultado);
		}

		// f. Caso o usu�rio digitou o operador /, divida os dois n�meros e
		// imprima o resultado �Valor da divis�o: &lt;resultado&gt;�.
		if (operacao.equals("/")) {
			resultado = num / num2;
			System.out.println("O valor da divis�o: " + resultado);
		}

		// g. Caso o usu�rio digitou o operador *, multiplique os dois n�meros e
		// imprima o resultado �Valor da multiplica��o: &lt;resultado&gt;�.
		if (operacao.equals("*")) {
			resultado = num * num2;
			System.out.println("Valor da multiplica��o: " + resultado);

		}

	}
}
