package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import resources.AppConfig;


public class Tester {
	
	public static void main(String[] args) {
		try
		{		
			// Uncomment the method calls below to get the corresponding output
			
			addBikes();
			getBikeDetails();
		}
		catch (Exception e) {
			System.out.println(AppConfig.PROPERTIES.getProperty(e.getMessage()));
		}
	}
	
	public static void addBikes() throws Exception{
		
		Bike bike = new Bike();
		
		bike.setBikeName("Augusta");
		bike.setPrice(956000.0);
		bike.setBikeId(1006);
		bike.setBikeSoldOn(LocalDateTime.now());
		bike.setCompanyName("General");
		bike.setSerialNumber("Gen:1256");
		LocalDate date1 = LocalDate.now().withMonth(3);
		bike.setModel(date1);
		
		
		Bike bike1 = new Bike();
		
		bike1.setBikeName("Pulsar");
		bike1.setPrice(95000.0);
		bike1.setBikeId(1007);
		bike1.setBikeSoldOn(LocalDateTime.now());
		bike1.setCompanyName("Bajaj");
		bike1.setSerialNumber("Baj:1256");
		LocalDate date2 = LocalDate.now().withMonth(3);
		bike1.setModel(date2);
		
		
		List<Bike> list = new ArrayList<Bike>();
		list.add(bike);
		list.add(bike1);
		
		Application app = new Application();
		String ret = app.addBikes(list);
		String message = null;
		if(ret.equals("success")){
			message="Tester.SUCCESS";
		}else{
		message="Tester.FAIL";	
		}
		System.out.println(AppConfig.PROPERTIES.getProperty(message));
	}
	
	
	public static void getBikeDetails() throws Exception{
		
		// Uncomment the below code after implementing the business logic
		
		LocalDate model = LocalDate.of(2011, 3, 5);
		
		Application app = new Application();
		Set<BikeReport> set = app.getBikeDetails(model);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		//Uncomment the code below to get respective output.
		System.out.printf("%-20s%-20s%-20s%-20s%n","BikeName","Price","Company","Sold on");
		System.out.printf("%-20s%-20s%-20s%-20s%n","********","******","******","*******");
		for(BikeReport br :set)
		{
			System.out.printf("%-20s%-20s%-20s%-20s%n",br.getBikeName(),br.getPrice(),br.getCompanyName(),dateFormat.format(br.getBikeSoldOn()));
		}
	}
}
