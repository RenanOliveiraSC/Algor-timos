//12.	Criar um array do tipo boolean com 3 posições, com os valores true, false, true. 
//Utilizando for, verifique se comparado todos os valores boleanos do array com o operador ou (||) é verdadeiro, caso sim imprima “1”, caso contrário “2”.
package array_e_matriz;

import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean[] a = new boolean[3];
		{
			a[0] = true;
			a[1] = false;
			a[2] = true;

			boolean todosverdadeiros = true;

			for (int aux = 0; aux < a.length; aux++) {
				for (int aux2 = 0; aux2 < a.length; aux2++) {
					if (aux != aux2 && !(a[aux] || a[aux])) {
						todosverdadeiros = false;
					}
				}
				if (todosverdadeiros) {
					System.out.println("1");
				} else {
					System.out.println("2");
				}
			}

		}

	}
}
