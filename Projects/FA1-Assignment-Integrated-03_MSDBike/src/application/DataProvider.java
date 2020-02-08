package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

import resources.LogConfig;

/**
 * Class to perform database operations
 * @author ETA
 */
public class DataProvider {
	
	public String addBikes(Bike bike) throws Exception {
		return "success";
	}

	
	public Set<Bike> getBikeDetails() throws Exception {
	
		Set<Bike> set = new LinkedHashSet<Bike>();
		
		try {
			Bike bike = new Bike();
			
			bike.setBikeId(1001);
			bike.setBikeName("CBR");
			
			LocalDateTime dateTime1 = LocalDateTime.now().withMonth(3).withYear(2013);
			bike.setBikeSoldOn(dateTime1);
			LocalDate date1 = LocalDate.now().withMonth(2).withYear(2013);
			bike.setModel(date1);
		
			bike.setCompanyName("Honda");
			bike.setPrice(600000.0);
			bike.setSerialNumber("Hon:1231");
			
			
			
			Bike bike1 = new Bike();
			
			bike1.setBikeId(1002);
			bike1.setBikeName("CBZ");
			
			LocalDateTime dateTime2 = LocalDateTime.now().withMonth(3).withYear(2014);
			bike1.setBikeSoldOn(dateTime2);
			LocalDate date2 = LocalDate.now().withMonth(2).withYear(2014);
			bike1.setModel(date2);
			
			bike1.setCompanyName("Herro");
			bike1.setPrice(90000.0);
			bike1.setSerialNumber("Her:1231");
			
			
			
			Bike bike2 = new Bike();
			
			bike2.setBikeId(1003);
			bike2.setBikeName("Bullet");
			
			LocalDateTime dateTime3 = LocalDateTime.now().withMonth(3).withYear(2012);
			bike2.setBikeSoldOn(dateTime3);
			LocalDate date3 = LocalDate.now().withMonth(2).withYear(2012);
			bike2.setModel(date3);
		
			bike2.setCompanyName("Enfield");
			bike2.setPrice(100000.0);
			bike2.setSerialNumber("Enf:1231");
			
			
			
			Bike bike3 = new Bike();
			
			bike3.setBikeId(1004);
			bike3.setBikeName("Karizma");

			LocalDateTime dateTime4 = LocalDateTime.now().withMonth(3).withYear(2011);
			bike3.setBikeSoldOn(dateTime4);
			LocalDate date4 = LocalDate.now().withMonth(2).withYear(2011);
			bike3.setModel(date4);
			
			bike3.setCompanyName("Herro");
			bike3.setPrice(150000.0);
			bike3.setSerialNumber("Her:1231");
			
			
			set.add(bike);
			set.add(bike1);
			set.add(bike2);
			set.add(bike3);
		} 
		catch (Exception exception) {
			LogConfig.getLogger(this.getClass()).error(exception.getMessage(), exception);
			throw new Exception("TECHNICAL_ERROR");
		} 
		return set;
	}
}