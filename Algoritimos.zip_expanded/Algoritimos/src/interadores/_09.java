//9.	Imprimir uma lista conforme orienta��es abaixo:
package interadores;

import java.util.Scanner;

public class _09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// a. 10 - 9 - 8 - 7
		int[] num = new int[4];
		int[] i = new int[100];

		for (int aux = 0; aux < num.length; aux++) {
			System.out.println("Digite os n�meros");
			num[aux] = scanner.nextInt();
		
		}
		System.out.println(num[0] + " - " + num[1] + " - " + num[2] + " - " + num[3]);
		// b. Perguntar para o usu�rio qual o valor inicial da lista, e qual o
		// valor final da lista.
		// Imprimir a lista conforme os valores digitados pelo usu�rio
		// (O usu�rio deve apenas digitar valores positivos sendo o segundo
		// valor maior que o
		// primeiro, o sistema n�o precisa validar esta situa��o).

		System.out.println("Qual � o valor inicial da lista? " + "(Informar apenas valores positivos" + "\n"
				+ "sendo o segundo valor maior que o primeiro.)");
		num[0] = scanner.nextInt();
		System.out.println("Qual � o valor final da lista? " + "(Informar apenas valores positivos" + "\n"
				+ "sendo o segundo valor maior que o primeiro.)");
		num[3] = scanner.nextInt();

		System.out.println(num[0] + " - " + num[1] + " - " + num[2] + " - " + num[3]);

		// c. Perguntar para o usu�rio qual o valor a ser somando em cada
		// intera��o do
		// for, dos valores de 0 a 100. Imprimir os valores correspondentes com
		// a soma.
		
		
		System.out.println("Qual o valor a ser somando em cada intera��o do for, dos valores de 0 a 100");
		for(int aux = 0; aux < i.length; aux++){
			i[aux] = scanner.nextInt();
		
			if(i[aux] + i[aux] <= 100);
			i[aux]++;

			//d. Perguntar para o usu�rio qual o valor m�ximo (valor positivo maior que 0) da
			//intera��o do for, come�ando com o valor 0. Imprimir valores
			//correspondentes.
			
			
			
			//e. Perguntar para o usu�rio qual a mensagem que ele deseja imprimir junto
			//com os valores, em uma listagem de 0 a 10. Imprimir o valor digitado pelo
			//usu�rio junto com cada n�mero impresso no for.
			
			
			//f. Perguntar para o usu�rio um valor e armazenar em uma vari�vel chamada
			//umNumero (o usu�rio deve digitar um valor positivo). Perguntar para o
			//usu�rio outro valor e armazenar em uma vari�vel chamada outroNumero (o
			//usu�rio deve digitar um valor positivo mairo que o primeiro). Imprimir um
			//contador de 0 100, n�o exibindo os valores entre os valores umNumero e
			//outroNumero.
			
			
		}
	}


