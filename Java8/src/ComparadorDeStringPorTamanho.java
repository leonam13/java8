import java.util.Comparator;

public class ComparadorDeStringPorTamanho implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		if(arg0.length() > arg1.length()) {
			return 1;
		} if (arg0.length() < arg1.length()) {
			return -1;
		} else return 0;
	}

}
