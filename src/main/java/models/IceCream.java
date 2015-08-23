package main.java.models;

import java.util.List;

public class IceCream {
	
	private final long id;
	private final List<Scoop> scoopList;
	
	public IceCream(long id, List<Scoop> scoopList){
		this.id = id;
		this.scoopList = scoopList;
	}
	
	public long getId(){
		return this.id;
	}
	
	public List<Scoop> getScoops(){
		return this.scoopList;
	}
}
