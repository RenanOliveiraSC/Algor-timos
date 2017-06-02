import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// int i;
		// int[] x = new int[10];
		// int[] x = {1,2,3,4,5,6,7,8,9,10}

		// Preenchendo um array com contador
		// for (int cont = 0; cont < x.length; cont++) {
		// System.out.println(cont);
		// }

		// Coloando um array em ordem crescente e descrescente

		// Preenchendo a array com for usando um número específico.
		// for (i = 0; i < x.length; ++i) {
		// x[i] = 2;
		// }

		// método para prencher automático
		// java.util.Arrays.fill(x, 20);

		// métido para prrencher automático à partir de onte.
		// java.util.Arrays.fill(x, 2, 5, 3);

		// Imprimindo a array sem nada prenechido
		// for (i = 0; i < x.length; ++i) {

		// System.out.println(x[i]);

		int vetor[] = { 3, 6, 2, 1, 8, 4 };
		{
			for (int i = 0; i < vetor.length; ++i)
				System.out.println(vetor[i] + " ");
		}
	}

}
