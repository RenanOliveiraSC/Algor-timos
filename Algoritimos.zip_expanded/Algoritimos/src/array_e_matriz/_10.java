//10.	Criar um array do tipo int de 6 posi��es, com os valores 1, 3, 5, 7, 9, 11. 
//Imprimir todas as posi��es menos a �ltima posi��o (verificar se � a �ltima posi��es e n�o verificar se � o de valor 11).
package array_e_matriz;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		{

			int[] v = new int[6];
			{
				v[0] = 1;
				v[1] = 3;
				v[2] = 5;
				v[3] = 7;
				v[4] = 9;
				v[5] = 11;
				for (int i = 0; i < 6; i++) {
					if (i != 5) {
						System.out.println(v[i]);
					}
				}
			}

		}
	}
}
