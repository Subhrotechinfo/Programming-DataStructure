package com.springApp.model;

import com.opencsv.bean.CsvBindByName;

public class CSVModelData {
	
	@CsvBindByName
	private String Ticker;
	
	@CsvBindByName(column ="Company")
	private String Company;
	
	@CsvBindByName(column="Industry")
	private String Industry;
	
	@CsvBindByName(column="PreviousClose")
	private String PreviousClose;

	public String getTicker() {
		return Ticker;
	}

	public void setTicker(String ticker) {
		Ticker = ticker;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getIndustry() {
		return Industry;
	}

	public void setIndustry(String industry) {
		Industry = industry;
	}

	public String getPreviousClose() {
		return PreviousClose;
	}

	public void setPreviousClose(String previousClose) {
		PreviousClose = previousClose;
	}
	
	

}
