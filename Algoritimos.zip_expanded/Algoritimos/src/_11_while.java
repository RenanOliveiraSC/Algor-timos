import java.util.Scanner;

public class _11_while {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		int inicial = 1, razao = 3, an = inicial, valor_max = 20;
		System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n", inicial, razao,
				valor_max);
		while (an <= valor_max) {
			System.out.println(an);
			an += razao;

		}
	}
}
