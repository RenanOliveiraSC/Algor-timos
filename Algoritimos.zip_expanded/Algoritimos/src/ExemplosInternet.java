import java.util.Scanner;

//Exemplos internet
public class ExemplosInternet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Insira a nota do " + (i + 1) + "º aluno");
			notaAlunos[i] = scanner.nextDouble();
		}
		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("->" + notaAlunos[i]);
		}

	}
}
