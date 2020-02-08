package localtime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String Stringlt1="11:30:15";
	   DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
	   LocalTime lt1=LocalTime.parse(Stringlt1,dtf);
	   System.out.println(lt1);
	   LocalTime lt2=LocalTime.of(23, 13);
	   DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm:ss a");
	   String Stringlt2=lt2.format(dtf2);
	   System.out.println(Stringlt2);

	   
	
	}

}
