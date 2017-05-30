//13.	Um comerciante comprou um produto e quer vende-lo com um lucro de 50% se o valor da compra for menor que R$ 20,00. 
//Caso contrário, o lucro será 35%. Entrar com o valor do produto e imprimir o valor de venda.

package condicionais_interadores;

import java.util.Scanner;

public class _13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double lucro1 = 50, lucro2 = 35;
		double valorproduto;
		double margem, precov;

		System.out.println("Entre com o valor do produto");
		valorproduto = scanner.nextInt();

		if (valorproduto < 20) {
			margem = (valorproduto * lucro1) / 100;
			precov = (valorproduto + margem);

		} else {
			if (valorproduto > 20) {
			}
			margem = (valorproduto * lucro2) / 100;
			precov = (valorproduto + margem);
		}

		System.out.println(precov);
	}
}
