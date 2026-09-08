package io_programming;

public class MobileNumber {
	private String countrycode;
	private String MobileNumber;
	
	public MobileNumber() {
		super();
	}

	public MobileNumber(String countrycode, String mobileNumber) {
		super();
		this.countrycode = countrycode;
		MobileNumber = mobileNumber;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "MobileNumber [countrycode=" + countrycode + ", MobileNumber=" + MobileNumber + "]";
	}
	
}
