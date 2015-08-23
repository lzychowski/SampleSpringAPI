package main.java.models;

import java.util.List;

public class SalesList {
	
	private final List<Sale> salesList;
	private final int totalSales;
	
	public SalesList(){
		this.salesList = null;
		this.totalSales = 0;
	}
	
	public SalesList(List<Sale> salesList){
		this.salesList = salesList;
		this.totalSales = salesList.size();
	}
	
	public List<Sale> getSales(){
		return this.salesList;
	}
	
	public int getTotalSales(){
		return this.totalSales;
	}
}
