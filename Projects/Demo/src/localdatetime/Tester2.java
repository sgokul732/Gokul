package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		ldt.plus(3,ChronoUnit.DAYS);
		System.out.println(ldt);
		LocalDate ld=ldt.toLocalDate();
		System.out.println(ld);
		LocalTime lt=ldt.toLocalTime();
		System.out.println(lt);
		

	}

}
