package test;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import application.Application;
import application.Bike;

public class ApplicationTest {
    @Rule
    public ExpectedException ee = ExpectedException.none();
    
    @Test
	public void addBikeValidDetails() throws Exception {
    	List<Bike> bikeList = new ArrayList<Bike>();
        Bike bike = new Bike();
        
        bike.setBikeName("Karizma");
        bike.setPrice(95000.0);
        bike.setBikeId(1227);
        bike.setBikeSoldOn(LocalDateTime.now());
        bike.setCompanyName("Herro");
        bike.setSerialNumber("Her:1256");
        String date = "12-May-2014";
        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("d-MMM-yyyy"));
        bike.setModel(date1);
        
        bikeList.add(bike);
        
        Assert.assertEquals("success",new Application().addBikes(bikeList));

	 }
	 @Test
	public void addBikeValidInValidBikeName() throws Exception {List<Bike> bikeList = new ArrayList<Bike>();
    Bike bike = new Bike();
    
    bike.setBikeName("Karizma");
    bike.setPrice(95000.0);
    bike.setBikeId(1227);
    bike.setBikeSoldOn(LocalDateTime.now());
    bike.setCompanyName("Herro");
    bike.setSerialNumber("Her:1256");
    String date = "12-May-2014";
    LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("d-MMM-yyyy"));
    bike.setModel(date1);
    
    bikeList.add(bike);
    
    Assert.assertEquals("success",new Application().addBikes(bikeList));
	 

		
		
		// Write the code to test
	 }
	 @Test
	public void getBikeDetailsValidmodel() throws Exception{
		String date = "5-Mar-2012";
        LocalDate model = LocalDate.parse(date, DateTimeFormatter.ofPattern("d-MMM-yyyy"));
        
        Assert.assertNotNull(new Application().getBikeDetails(model));
}

		
	@Test
	public void getBikeDetailsInValidmodel() throws Exception{
		// Write the code to test                                
		ee.expectMessage("Application.NO_RECORDS_FOUND");
        
        String date = "5-Mar-2016";
        LocalDate model = LocalDate.parse(date, DateTimeFormatter.ofPattern("d-MMM-yyyy"));
        new Application().getBikeDetails(model);

	 }
}
