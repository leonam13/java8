import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.*;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("Zraco");
		palavras.add("casa do código");
		palavras.add("Cois escrita");

		// Compare da classe Integer compara o tamanho das Strings para a regra de
		// ordeção no sort
		//palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(comparingInt(String::length));
		//palavras.sort(new ComparadorDeStringPorTamanho());

		/*
		 * if(o1.length() > o2.length()) { return 1; } if (o1.length() < o2.length()) {
		 * return -1; } else return 0; }
		 */

		// Consumer possui o metodo accept(String).
		//palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
		
		//new Thread(new Runnable) - Runnable possui o método Run sem argumentos
		new Thread(()->System.out.println("Executando um Runnable")).start();

	}

}
