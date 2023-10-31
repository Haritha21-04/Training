package com.yourpackage;
public class MenuCard {
    // Attributes
    private String name;
    private double calories;
    private double pricePerPerson;
    private double numberOfWineBottles;
	private int cookingTime;

    // Constructor
    public MenuCard(String name, double calories, int cookingTime, double pricePerPerson, double numberOfWineBottles) {
        this.name = name;
        this.calories = calories;
        this.setCookingTime(cookingTime);
        this.pricePerPerson = pricePerPerson;
        this.numberOfWineBottles = numberOfWineBottles;
    }

    

public void printMenuDetails() {
    System.out.println("Menu " + name + " contains " + calories + " calories, comes with " + numberOfWineBottles + " bottles and costs " + pricePerPerson);
}



public int getCookingTime() {
	// TODO Auto-generated method stub
	
	return cookingTime;
}
public void setCookingTime(int cookingTime) {
	this.getCookingTime();
}



public String getName() {
	// TODO Auto-generated method stub

	return name;
}
public void setName(String Name) {
	this.getName();
}	

public double getPricePerPerson() {
	// TODO Auto-generated method stub
	return 0;
}





}
