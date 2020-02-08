package application;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.Logger;

import resources.LogConfig;


public class Application {

	public String addBikes(List<Bike> bikeList) throws Exception{
		Validator v=new Validator();
		DataProvider sd=new DataProvider();
		String result="";
		try{
			for(Bike b:bikeList){
				v.validate(b);
				
			}
			for(Bike b:bikeList){
				result=sd.addBikes(b);
				
			}
			
		}
		catch(Exception e){
			if(e.getMessage().contains("Application")){
				Logger logger=LogConfig.getLogger(this.getClass());
				logger.error(e.getMessage(),e);
			}
			throw e;
			
			
		}
		return result;
		
		}
	
	
	
	public Set<BikeReport> getBikeDetails(LocalDate model) throws Exception{
		DataProvider sd=new DataProvider();
		Set<Bike> s=sd.getBikeDetails();
		Set<BikeReport> sd1=new HashSet<>();
		try{
		for(Bike b:s){
			if(b.getModel().isAfter(model) || b.getModel().isEqual(model)){
				BikeReport br=new BikeReport();
				br.setBikeName(b.getBikeName());
				br.setBikeSoldOn(b.getBikeSoldOn());
				br.setCompanyName(b.getCompanyName());
				br.setPrice(b.getPrice());
				sd1.add(br);
			}
			if(sd1.isEmpty()){
				throw new Exception("Application.NO_RECORDS_FOUND");}
			}
		}
	
		catch(Exception e){
		
			if(e.getMessage().contains("Application")){
				Logger logger=LogConfig.getLogger(this.getClass());
				logger.error(e.getMessage(),e);
			}
			throw e;
			
			
		}
		return sd1;
		}
	}
