//13.	Escreva um algoritmo que o usu�rio entre com o sal�rio da pessoa e imprima o sal�rio l�quido, 
//segundo as informa��es abaixo, utilizando apenas um System.out.println:
package condicionais_interadores;

import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double salario;
		double desconto1, desconto2, desconto3;
		System.out.println("Digite o sal�rio: ");
		salario = scanner.nextInt();

		// a. Menor ou igual a R$ 600,00 � isento
		if (salario <= 600) {
			System.out.println("Valor ISENTO de descontos!!     Ent�o o sal�rio l�quido � de: R$ "  + salario);

		// b. Maior que R$ 600 e menor ou igual a R$ 1.200,00 o desconto � de 20%
		} else if (salario > 600 && salario <= 1200) {
			desconto1 = 20;
			salario = (salario * desconto1) / 100;
			System.out.println("O valor do desconto � de 20%    Ent�o o sal�rio l�quido � de: R$ " + salario);

		} else if (salario > 1200 && salario <= 2000) {
			desconto2 = 25;
			salario = (salario * desconto2) / 100;
			System.out.println("O valor do desconto � de 25%    Ent�o o sal�rio l�quido � de: R$ " + salario);

		} else {
			desconto3 = 30;
			salario = (salario * desconto3) / 100;
			System.out.println("O valor do desconto � de 30%    Ent�o o sal�rio l�quido � de: R$ " + salario);

		}
	}
}
