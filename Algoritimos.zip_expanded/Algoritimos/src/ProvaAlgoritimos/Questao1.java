package ProvaAlgoritimos;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] lista = new int[10];
		for (int cont = 10; cont >= 1; cont--) {
			if ((cont % 2) == 0) {
				System.out.println(cont + " - Par");
			} else {
				System.out.println(cont + " - Impar");
			}

		}
	}
}
