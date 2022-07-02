package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		jetApp.app();
	}

	private void app() {
		AirField aF = new AirField();
		Scanner sc = new Scanner(System.in);
		boolean isContinued = true;
		do {
			displayMenu();
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				aF.displayJet();
				break;
			case 2:
				aF.flyJet();
				break;
			case 3:
				System.out.println("The fastest jet is: ");
				aF.fastestJet();
				break;
			case 4: 
				System.out.println("The jetwith longest range: ");
				aF.longestRangeJet();
				break;
			case 5:
				aF.findCargoCarrierImpl();
				break;
			case 6:
				aF.findCombatReadyImpl();
				break;
			case 7: 
				displaySubMenu();
				int type = sc.nextInt();
				aF.addJet(type);
				break;
			case 8:
				aF.displayJet();
				System.out.println("Enter a number to delete a jet");
				int number = sc.nextInt();
				aF.deleteJet(number);
				break;
			case 9:
				System.out.println("You chose to exist! Good Bye!");
				isContinued = false;
				break;
				
			}
			
		} while (isContinued);
	}

	private void displayMenu() {
		System.out.println("===============================");
		System.out.println("1.List fleet");
		System.out.println("2.Fly all jets");
		System.out.println("3.View fastest jet");
		System.out.println("4.View jet with longest range");
		System.out.println("5.Load all Cargo Jets");
		System.out.println("6.Dogfight!");
		System.out.println("7.Add a jet to Fleet");
		System.out.println("8.Remove a jet from Fleet");
		System.out.println("9.Quit");
		System.out.println("=================================");
	}
	
	private void displaySubMenu() {
		System.out.println("Choose type of Jet below: ");
		System.out.println("1.Passenger");
		System.out.println("2.Cargo Plane");
		System.out.println("3.Fighter Jet");
	}

}
