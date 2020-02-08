package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ldt1String="20 May, 2018, 23:13:07";
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd MMM, yyyy, HH:mm:ss");
		LocalDateTime ldt1=LocalDateTime.parse(ldt1String,dtf1);
		System.out.println(ldt1);
		LocalDateTime ldt2=LocalDateTime.now();
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy, hh:mm:ss a");
		String ldt2String=ldt2.format(dtf2);
		System.out.println(ldt2String);
		
		


	}

}
