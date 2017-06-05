import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Coloando um array em ordem crescente e descrescente

		int vetor[] = { 3, 6, 2, 1, 8, 4 };
		int aux;
		boolean controle;

		for (int i = 0; i < vetor.length; ++i) {

			for (int j = 0; j < (vetor.length - 1); ++j) {
				if (vetor[j] > vetor[j] + 1) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;

				}
			}
		}
		for (int i = 0; i < vetor.length; ++i) {
			System.out.print(vetor[i] + " ");
		}
	}
}