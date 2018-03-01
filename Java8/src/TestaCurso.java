import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCurso {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		// cursos.forEach(System.out::println);

		double mediaAlunos = cursos.stream()
				.mapToDouble(Curso::getAlunos)
				.average()
				.getAsDouble();
		
		List<Curso> cursosLista = cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .collect(Collectors.toList());
		
		// .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

		// System.out.println(aux.values());

		// aux.forEach(System.out::println);
		// .findAny()
		// .ifPresent(c -> System.out.println(c.getNome())
	}
}
