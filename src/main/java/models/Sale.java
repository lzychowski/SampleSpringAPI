package main.java.models;

import java.math.BigDecimal;
import java.util.List;

public class Sale {
	
	private final long id;
	private final BigDecimal totalCost;
	private final List<IceCream> iceCreamList;
	
	public Sale(long id, List<IceCream> iceCreamList){
		this.id = id;
		this.iceCreamList = iceCreamList;
		
		this.totalCost = this.calculateCost();
	}
	
	private BigDecimal calculateCost(){
		
		BigDecimal totalCost = new BigDecimal(0);
		
		for (IceCream iceCream: this.iceCreamList){
			totalCost.add(new BigDecimal(iceCream.getScoops().size() * 0.99));
		}
		
		return totalCost;
	}
}
