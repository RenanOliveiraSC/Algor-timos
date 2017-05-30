package exercicios4;

public class G_exercicio {

	public static void main(String[] args) {
		boolean condicao = true;
		boolean segundaCondicao = false;
		if (condicao & !!segundaCondicao == false) {
			System.out.println("Entrou no if");
		}
	}
}