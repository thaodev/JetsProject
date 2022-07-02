package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AirField {
	private List<Jet> fleet;
	// private final int MAX_JET = 20;

	public AirField() {
		fleet = new ArrayList<>();
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("jets.txt"));
			String line = bufIn.readLine();
			while ((line = bufIn.readLine()) != null) {
				String[] splitLine = line.split(", ");
				double speedJ = Double.parseDouble(splitLine[2]);
				int rangeJ = Integer.parseInt(splitLine[3]);
				long priceJ = Long.parseLong(splitLine[4]);

				if (splitLine[0].equals("passenger")) {
					fleet.add(new Passenger(splitLine[1], speedJ, rangeJ, priceJ));
				} else if (splitLine[0].equals("cargo plane")) {
					fleet.add(new CargoPlane(splitLine[1], speedJ, rangeJ, priceJ));
				} else if (splitLine[0].equals("Fighter Jet")) {
					fleet.add(new FighterJet(splitLine[1], speedJ, rangeJ, priceJ));
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}


	
	public void displayJet() {
		for (int i = 0; i < fleet.size(); i ++) {
			System.out.println((i+1) + ". " + fleet.get(i).toString());
		}
	}
	
	public void flyJet() {
		for (Jet jet : fleet) {
			jet.fly();
		}
	}
	
	public void fastestJet() {
		double max = 0;
		for (Jet jet : fleet) {
			if (jet.getSpeed() > max) {
				max = jet.getSpeed();
			}
		}
		for (Jet jet : fleet) {
			if (jet.getSpeed() == max) {
				System.out.println(jet);
				break;
			}
		}
	}
	
	public void longestRangeJet() {
		int max = 0;
		for (Jet jet : fleet) {
			if (jet.getRange() > max) {
				max = jet.getRange();
			}
		}
		for (Jet jet : fleet) {
			if (jet.getRange() == max) {
				System.out.println(jet);
				break;
			}
		}
	}

	public void findCargoCarrierImpl() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoCarrier) {
				System.out.println(jet);
				((CargoCarrier) jet).loadCargo();
			}
		}
	}
	
	public void findCombatReadyImpl() {
		for (Jet jet : fleet) {
			if (jet instanceof CombatReady) {
				System.out.println(jet);
				((CombatReady) jet).fight();
			}
		}
	}
	public void addJet(int type) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Model: ");
		String jetModel = sc.nextLine();
		System.out.println("Enter Speed: ");
		double jetSpeed = sc.nextDouble();
		System.out.println("Enter Range: ");
		int jetRange = sc.nextInt();
		System.out.println("Enter Price: ");
		long jetPrice = sc.nextLong();
		Jet jetToAdd = null;
		if (type == 1) {
			jetToAdd = new Passenger(jetModel, jetSpeed, jetRange, jetPrice);
		} else if( type == 2) {
			jetToAdd = new CargoPlane(jetModel, jetSpeed, jetRange, jetPrice);
		} else if (type == 3) {
			jetToAdd = new FighterJet(jetModel, jetSpeed, jetRange, jetPrice);
		}
		fleet.add(jetToAdd);
		displayJet();
	}
	
	public void deleteJet(int jetToDelete) {
		fleet.remove(jetToDelete - 1);
		System.out.println("Jet in position " + jetToDelete + " was deleted!");
	}

}
