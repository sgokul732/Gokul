package localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		lt=lt.plus(4,ChronoUnit.MINUTES);
		System.out.println(lt);
		lt=lt.minus(4,ChronoUnit.HOURS);
		System.out.println(lt);
		LocalTime lt2=LocalTime.now();
		long hoursBetween=ChronoUnit.HOURS.between(lt,lt2);
		System.out.println(hoursBetween);

	}

}
