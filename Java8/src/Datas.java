import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadas = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(olimpiadas);
		
		int anos = hoje.getYear() - olimpiadas.getYear();
		System.out.println(anos);
		
		LocalTime ti = LocalTime.now();
		LocalTime noom = LocalTime.NOON;
		Duration periodo = Duration.between(ti, noom);
		System.out.println(periodo);
		//System.out.println(periodo.getYears() + " anos");
		//System.out.println(periodo.getMonths()+" meses");
		//System.out.println(periodo.getDays() + " dias");
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(f));
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(agora.format(f2));
		
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMM/yyyy");
		YearMonth anoMes = YearMonth.of(2018, Month.JANUARY);
		System.out.println(anoMes.format(f3));
		
		LocalTime t = LocalTime.of(11, 40).plusHours(1).plusMinutes(30);
		System.out.println(t);
		
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println(z);
	}

}
