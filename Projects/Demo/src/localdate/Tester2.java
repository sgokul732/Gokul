package localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.now();
		ld=ld.plus(2,ChronoUnit.DAYS);
		System.out.println(ld);
		ld=ld.plus(3,ChronoUnit.MONTHS);
		System.out.println(ld);
		ld=ld.minus(2,ChronoUnit.MONTHS);
		System.out.println(ld);
		LocalDate ld2=LocalDate.now();
		long daysBetween=ChronoUnit.DAYS.between(ld2,ld);
		System.out.println(daysBetween);
		LocalDate l1=LocalDate.of(2016,11,01);
		LocalDate l2=LocalDate.of(2019, 5, 06);
		long yy=ChronoUnit.YEARS.between(l1,l2);
		l1=l1.plusYears(yy);
		long mm=ChronoUnit.MONTHS.between(l1, l2);
		l1=l1.plusMonths(mm);
		long dd=ChronoUnit.DAYS.between(l1,l2);
		System.out.println("Year "+yy+" Months "+mm+" days "+dd);
		
		System.out.println(l2.get(ChronoField.DAY_OF_MONTH));
		System.out.println(l2.get(ChronoField.DAY_OF_WEEK));
		System.out.println(l2.get(ChronoField.MONTH_OF_YEAR));

	}

}
