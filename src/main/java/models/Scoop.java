package main.java.models;

public class Scoop {

	private final long id;
	private final String flavor;
	
	public Scoop(long id, String flavor){
		this.id = id;
		this.flavor = flavor;
	}
	
	public long getId(){
		return this.id;
	}
	
	public String getFlavor(){
		return this.flavor;
	}
}
