//14.	Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção. 
//Criar um outro array de mesmo tamanho. Utilizando for, pegar todos os valores presentes no primeiro array e inserir no segundo array. 
//Desta forma os dois arrays terão os mesmo valores nas mesmas posições. Imprimir o segundo array para verificar se o algoritmo funcionou.
package array_e_matriz;

import java.util.Scanner;

public class _14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] p = { 10, 8, 6, 4, 2 };
		{

			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
			}
			int[] s = new int[5];
			{
				if (s == p) {
					// for (int a = 0; a < p.length; a++) {
					System.out.println(s);
				}
			}
		}
	}
}
