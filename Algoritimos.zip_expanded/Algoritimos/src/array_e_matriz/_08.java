//8.	Criar um array do tipo int, com os seguintes valores 1, 2, 3, 4, 5.

//d.	Imprimir todos os valores do array.

package array_e_matriz;

public class _08 {

	public static void main(String[] args) {
		// a. Imprimir todos os valores do array até chegar a metade do array.
		System.out.println("a. Imprimir todos os valores do array até chegar a metade do array.");

		int[] n = new int[5];
		{
			n[0] = 1;
			n[1] = 2;
			n[2] = 3;
			n[3] = 4;
			n[4] = 5;
			for (int aux = 0; aux <= 2; aux = aux + 1) {
				System.out.print(n[aux]);

			}

			System.out.print("\n");
			// b. Alterar o valor do início do array para 10.
			System.out.println("b. Alterar o valor do início do array para 10.");
			for (int valor : n) {
				System.out.print(valor + " ");
			}
			System.out.print("\n");
			System.out.println("c. Alterar o valor da última posição do array para 10. ");
			// c. Alterar o valor da última posição do array para 10.
			for (int valor : n) {
				System.out.print(valor + " ");
			}
			System.out.print("\n");
			System.out.println("d. Alterar o valor da última posição do array para 10. ");
			// c. Alterar o valor da última posição do array para 10.
			for (int valor : n) {
				System.out.print(valor + " ");
			}
		}
	}
}
