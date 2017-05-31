//9.	Imprimir uma lista conforme orientações abaixo:
package interadores;

import java.util.Scanner;

public class _09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// a. 10 - 9 - 8 - 7
		int[] num = new int[4];
		int[] i = new int[100];

		for (int aux = 0; aux < num.length; aux++) {
			System.out.println("Digite os números");
			num[aux] = scanner.nextInt();
		
		}
		System.out.println(num[0] + " - " + num[1] + " - " + num[2] + " - " + num[3]);
		// b. Perguntar para o usuário qual o valor inicial da lista, e qual o
		// valor final da lista.
		// Imprimir a lista conforme os valores digitados pelo usuário
		// (O usuário deve apenas digitar valores positivos sendo o segundo
		// valor maior que o
		// primeiro, o sistema não precisa validar esta situação).

		System.out.println("Qual é o valor inicial da lista? " + "(Informar apenas valores positivos" + "\n"
				+ "sendo o segundo valor maior que o primeiro.)");
		num[0] = scanner.nextInt();
		System.out.println("Qual é o valor final da lista? " + "(Informar apenas valores positivos" + "\n"
				+ "sendo o segundo valor maior que o primeiro.)");
		num[3] = scanner.nextInt();

		System.out.println(num[0] + " - " + num[1] + " - " + num[2] + " - " + num[3]);

		// c. Perguntar para o usuário qual o valor a ser somando em cada
		// interação do
		// for, dos valores de 0 a 100. Imprimir os valores correspondentes com
		// a soma.
		
		
		System.out.println("Qual o valor a ser somando em cada interação do for, dos valores de 0 a 100");
		for(int aux = 0; aux < i.length; aux++){
			i[aux] = scanner.nextInt();
		
			if(i[aux] + i[aux] <= 100);
			i[aux]++;

			//d. Perguntar para o usuário qual o valor máximo (valor positivo maior que 0) da
			//interação do for, começando com o valor 0. Imprimir valores
			//correspondentes.
			
			
			
			//e. Perguntar para o usuário qual a mensagem que ele deseja imprimir junto
			//com os valores, em uma listagem de 0 a 10. Imprimir o valor digitado pelo
			//usuário junto com cada número impresso no for.
			
			
			//f. Perguntar para o usuário um valor e armazenar em uma variável chamada
			//umNumero (o usuário deve digitar um valor positivo). Perguntar para o
			//usuário outro valor e armazenar em uma variável chamada outroNumero (o
			//usuário deve digitar um valor positivo mairo que o primeiro). Imprimir um
			//contador de 0 100, não exibindo os valores entre os valores umNumero e
			//outroNumero.
			
			
		}
	}


