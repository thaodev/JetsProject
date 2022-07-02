package com.skilldistillery.jets.entities;

public class FreightAircraft extends Jet implements CargoCarrier {

	public FreightAircraft(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("Loadings products to Freight Aircarft");
	}

}
