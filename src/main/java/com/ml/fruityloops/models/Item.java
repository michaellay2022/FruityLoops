package com.ml.fruityloops.models;

public class Item {

	// Attribute = MEMBER VARIABLES===================================
    private String name;
    private double price;
    
    // CONSTRUCTOR ==================================================
    
    public Item() {
    	super();
    }
    
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


	//Methods===========================================================
    
    
    
    //Getters and Setters==================================================

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

}


