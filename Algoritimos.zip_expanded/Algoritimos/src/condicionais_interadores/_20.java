//Peça para o usuário digitar sua data de nascimento em texto “01/02/1990”. Busque a
//posição do última barra “/”contida na data. Imprime a posição da barra. (int posicao =
//texto.lastIndexOf(&quot;A&quot;);)
package condicionais_interadores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;  

public class _20 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("Digite a data de nascimento (dd/mm/yyyy)");
		String data1 = scanner.nextLine();
		int pos = data1.lastIndexOf("/"); 
		System.out.println(pos);
		}
}
