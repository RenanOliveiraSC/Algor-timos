import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] meuArray = { 78, 56, 89, 1 };
		System.out.printf("%s%8s\n", "Indíce", "Valores");

		for (int i = 0; i < meuArray.length; ++i)
			System.out.printf("%5d%8d\n", i, meuArray[i]);
	}
}
