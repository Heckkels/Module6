package com.heck.carshowcatalogue;

import java.util.Scanner; 
import java.util.ArrayList; 

public class CarShowCatalogue {
	
	public static String updateCarCatalogue(String carModel) {
		Scanner scnr = new Scanner(System.in);
		int userYear; 
			
		System.out.println();
		System.out.print("This model has not yet been listed. How exciting! Please enter the year: ");
		userYear = scnr.nextInt();
		
		String newAddition = (userYear + " " + carModel);
		return newAddition;
		
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userModel;
		String newInquiry; 
		
		ArrayList<String> carModelList = new ArrayList<String>();
		ArrayList<Integer> carYearList = new ArrayList<Integer>();
		ArrayList<String> publicAddition = new ArrayList<String>();
		

		
		//Car Model Listing
		carModelList.add("Frontier");
		carModelList.add("Oldsmobile");
		carModelList.add("Avalanche");
		carModelList.add("Mustang");
		
		//Car Year Listing
		carYearList.add(1999);
		carYearList.add(1997);
		carYearList.add(2007);
		carYearList.add(2006);
		
		
		System.out.println("Hello! Thank you for your interest in the Totally Real Car Show! ");
		System.out.println("This form will help you add to our quickly growing catalogue.");
		System.out.println("Please look at the cars listed below and make sure we do not already have what you're offering.");
		System.out.println();
		
		for (int i = 0; i < carModelList.size(); ++i) {
			System.out.println("" + carYearList.get(i) + " " + carModelList.get(i));
		}
		
		System.out.println();
		System.out.print("Please enter the model you would like to add: ");
		userModel = scnr.next();
		
		boolean ans = carModelList.contains(userModel);
		
		if (ans) {
			System.out.println();
			System.out.print("A car of this model is already listed. Please enter a model not listed above.");
			userModel = scnr.next();
		}
		else {
			carModelList.add(userModel);
			newInquiry = updateCarCatalogue(userModel);
			
			System.out.println();
			System.out.println("Thank you for adding your " + newInquiry + ". We'll see you soon!");
			publicAddition.add(newInquiry);
			
		}
		
		
	}

}
