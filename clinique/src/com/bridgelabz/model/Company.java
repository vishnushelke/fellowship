package com.bridgelabz.model;

public class Company {

	private String symbol;
	private int numberofshares;
	private String companyname;
	private int shareprice;
	private int totalprice;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNumberofshares() {
		return numberofshares;
	}
	public void setNumberofshares(int numberofshares) {
		this.numberofshares = numberofshares;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getShareprice() {
		return shareprice;
	}
	public void setShareprice(int shareprice) {
		this.shareprice = shareprice;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
}
