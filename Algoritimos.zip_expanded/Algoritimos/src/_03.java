import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array; // declara��o do array
		array = new int[10]; // cria e reserva o espa�o
		System.out.printf("%s%10s\n", " ______", " _______");
		System.out.printf("%s%10s\n", "|Ind�ce", " |Valores | ");
		System.out.printf("%s%10s\n", "|------", " |------- | ");
		for (int i = 0; i <= 9; i++) {
			System.out.printf("|%5d%3s%7d |\n", i, " |", array[i]);
		}
		System.out.printf("%s%10s\n", "|-------", "|--------| ");
	}
}
