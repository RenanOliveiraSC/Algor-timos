//16.	Criar um array com 10 posi��es. 
//Inserir nas posi��es 2, 4, 5, 7 os respectivos valores �A�, �B�, �C�, �D�. 
//Com for ou while, inserir a letra �W� nas posi��es do array no qual
//n�o tem valor (verificar a posi��o do array com null para validar
//se possui valor ou n�o na posi��o do array, array[i] == null). 
//Imprimir o array para verificar se o algoritmo funcionou. Fazer o exerc�cio utilizando for ou while.
package array_e_matriz;

import java.util.Scanner;

public class _16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] lista = new String[10];
		lista[2] = "A";
		lista[4] = "B";
		lista[5] = "C";
		lista[7] = "D";

		while (lista == null) {
			System.out.println(lista.equals("w"));
		}
		for (int i = 0; i < lista.length; ++i) {
			System.out.println(lista[i]);
		}
	}

}
