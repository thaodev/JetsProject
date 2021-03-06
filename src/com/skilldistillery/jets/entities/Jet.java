package com.skilldistillery.jets.entities;

public abstract class Jet {
//	model, speed, range, and price 
	private String model;
	private double speed;
	private int range;
	private long price;
	private Pilot pilot;
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		System.out.println(getClass().getSimpleName() + " - Model: " + model + ", speed: " + speed + ", range: " + range + ", price: " + price
				+ ", amount of fly time : " + range/speed);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+" - Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	
	

}
