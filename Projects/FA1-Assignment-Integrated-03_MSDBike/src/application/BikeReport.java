package application;

import java.time.LocalDateTime;

public class BikeReport {
	
	private String bikeName;
	private Double price;
	private String companyName;
	private LocalDateTime bikeSoldOn;
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public LocalDateTime getBikeSoldOn() {
		return bikeSoldOn;
	}
	public void setBikeSoldOn(LocalDateTime bikeSoldOn) {
		this.bikeSoldOn = bikeSoldOn;
	}
	
}
