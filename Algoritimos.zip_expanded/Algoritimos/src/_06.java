import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arrayin = new int[10];
		arrayin[0] = 10;
		arrayin[1] = 20;
		arrayin[2] = 30;
		arrayin[3] = 30;
		arrayin[4] = 30;
		arrayin[5] = 30;
		arrayin[6] = 30;
		arrayin[7] = 30;
		arrayin[8] = 30;
		arrayin[9] = 30;

		int soma2 = 0;
		for (int i = 0; i < 10; ++i) {
			soma2 += arrayin[i];
		}
		System.out.println("A soma de todos os elementos é: " + soma2);

		// int soma = arrayin[0] + arrayin[1] + arrayin[2];

		// System.out.println("A soma dos três primeiro elementos é: " + soma);

	}
}
