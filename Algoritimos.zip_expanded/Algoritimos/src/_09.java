import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Prova de sexta-feira

		String[] pChave = { "E", "S", "T", "U", "D", "A", "R" };
		Scanner sc = new Scanner(System.in);
		int forca = 1, vencer = 0, perder = 0, contador = 0;

		String digito;
		String[] letrasDigitas = new String[20];
		while (forca == 1) {
			int existePalavra = 0;
			System.out.println("Digite a letra: ");
			digito = sc.next();
			letrasDigitas[contador] = digito;
			// for criado para verificar se a letra j� foi digitada.
			for (int i = 0; i < letrasDigitas.length; ++i) {
				if (letrasDigitas[i] != null) {
					if (letrasDigitas[i].equals(digito)) {
						existePalavra++;
					}
				}
			}
			// Se a letra n�o foi digitada ainda verifica se est� correta, caso
			// contrario exibe a msg
			if (!(existePalavra > 1)) {
				// faz o loop no array da palavra, que n�o estava sendo feito
				for (int x = 0; x < pChave.length; x++) {
					// Verifica se a letra est� correta
					if (pChave[x].equals(digito)) {
						System.out.println("Letra Correta");
						vencer++;
						break;
					} else {
						if (x == 4) {
							System.out.println("Letra inexistente.");
							perder++;
						}
					}
				}
				if (perder == 5) {
					System.out.println("Voc� perdeu.");
					System.exit(0);
				} else if (vencer == 5) {
					System.out.println("Voc� venceu.");
					System.exit(0);

				}
			} else {
				System.out.println("Essa letra j� foi digitada.");
			}
			contador++;
		}

	}
}
