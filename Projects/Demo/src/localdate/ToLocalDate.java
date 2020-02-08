package localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class ToLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date1="22-May-2016";
		LocalDate ld1=LocalDate.parse(date1,DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		System.out.println(ld1);
		String date2="May/02/2018";
		LocalDate ld2=LocalDate.parse(date2,DateTimeFormatter.ofPattern("MMM/dd/yyyy"));
		System.out.println(ld2);
		ld1=LocalDate.of(2016,Month.APRIL,20);
		System.out.println(ld1);
		ld2=LocalDate.now();
		System.out.println(ld2);
		//Printing date object in various format
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String ld1String=ld1.format(dtf);
		System.out.println(ld1String);
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM-yyyy-dd EEEE");
		String ld2String=ld2.format(dtf2);
		System.out.println(ld2String);

		
		
		/*JapaneseDate today=JapaneseDate.now();
		today=today.plus(0,ChronoUnit.DAYS);
		System.out.println(today);*/
		
		

	}

}
