//13.	Criar um array de 10 posições, e popular o array com os valores 1, 2, 3, 4, 5 a partir da posição 4 utilizando for. 
//Para colocar os valores 1, 2, 3, 4, 5 utilizando uma variável. 
package array_e_matriz;

import java.util.Scanner;

public class _13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array10 = new int[10];
		int valor = 1;
		for (int aux = 3; aux < array10.length; aux++) {
			if (valor > 0 && valor < 6) {
				array10[aux] = valor;
				valor++;
			}
		}
		for (int i = 0; i < array10.length; i++) {
			System.out.println(array10[i]);
		}
	}
}