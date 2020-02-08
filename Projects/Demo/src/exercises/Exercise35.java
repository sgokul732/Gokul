package exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Exercise35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="02/11/1991";
		LocalDate dob = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		calculate(dob);
		System.out.println(dob);

	}
	public static void calculate(LocalDate dob){
		LocalDate today=LocalDate.now();
		long years=dob.until(today, ChronoUnit.YEARS);
		today=today.minusYears(years);
		long months=dob.until(today,ChronoUnit.MONTHS);
		today=today.minusMonths(months);
		long days=dob.until(today,ChronoUnit.DAYS);
		System.out.println("you are "+years+" years "+months+" months "+days+" days old");
	}

}
