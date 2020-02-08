package application;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Validator {

	public void validate(Bike bike) throws Exception {
		// Use isValidBikeName, isValidModel, isValidCompanyName, isValidBikeSoldOn, isValidPrice, isValidSerialNumber to validate the bike details
		// For invalid inputs throw exceptions with the corresponding messages
		if(!isValidBikeName(bike.getBikeName()))
			throw new Exception("Validator.INVALID_BIKENAME");
		if(!isValidModel(bike.getModel()))
			throw new Exception("Validator.INVALID_MODEL");
		if(!isValidCompanyName(bike.getCompanyName()))
			throw new Exception("Validator.INVALID_COMPANY_NAME");
		if(!isValidBikeSoldOn(bike.getBikeSoldOn()))
			throw new Exception("Validator.INVALID_BIKE_SOLD_ON");
		if(!isValidPrice(bike.getPrice()))
			throw new Exception("Validator.INVALID_PRICE");
		if(!isValidSerialNumber(bike.getSerialNumber(), bike.getCompanyName()))
				throw new Exception("Validator.INVALID_SERIAL_NUMBER");
				
	}	
		
	public boolean isValidBikeName(String bikeName) {
		String regex="[A-Za-z0-9]+[ ]*[a-zA-Z0-9]*";
		if(bikeName.matches(regex))
			return true;
		return false;
	}

	public boolean isValidModel(LocalDate model) {
		LocalDate today=LocalDate.now();
		LocalDate today1=today.plusYears(5);
		if(model.isBefore(today) && model.isBefore(today1))
			return true;
		return false;
	}

	public boolean isValidCompanyName(String companyName){
		String regex2="[A-Z].*";
		if(companyName.matches(regex2))
			return true;
		return false;
	}
	
	public boolean isValidBikeSoldOn(LocalDateTime bikeSoldOn){
		LocalDate today=LocalDate.now();
		if(bikeSoldOn.toLocalDate().isEqual(today))
			return true;
		return false;
	}
	
	public boolean isValidPrice(double price){
		if(price>=50000d)
			return true;
		return false;
	}
	
	public boolean isValidSerialNumber(String serialNumber,String companyName){
		String regex3=companyName.substring(0,3);
		String regex4="[0-9]+";
		if(serialNumber.matches(regex3+":"+regex4))
			return true;
		return false;
	}
}
