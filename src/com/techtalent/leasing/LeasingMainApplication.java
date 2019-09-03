package com.techtalent.leasing;

import java.util.*;

import com.techtalent.leasing.domain.*;


public class LeasingMainApplication {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Community community = new Community("Chase", 50, "211 N Ervay", 10);
		community.setPetsAllowed(true);
		community.setHasPlayground(true);
		
		//Community community2 = new Community("Gables", 60, "300 N Ervay", 20);
		System.out.println("Is there an apartment available? true/false");
		boolean available = community.areApartmentAvailable();
		
		if (available) {
			System.out.println("Are pets allowed?");
			boolean petsAllowed = community.arePetsAllowed();
			if (petsAllowed)
			{
				System.out.println("YES! Pets are allowed!");
			}
			else 
				System.out.println("NO! Pets are not allowed!");
			
			System.out.println("Have a playground?");
			
			boolean hasPlayground = community.hasPlayground();
			if (hasPlayground)
			{
				System.out.println("YES! Community has a playground!");
			}
			else 
				System.out.println("NO! Community doesn't have a playground!");
			
			//System.out.println("What all other amenities do you have?");
			//community.listAmenities();
			System.out.println("Give me the list of apartments available with the rent.");
			List<Apartment> availableApartments = community.getAvailableApartments();
			for (Apartment apartment : availableApartments) {
				System.out.println("Are you interested? Y/N");
				String interestedStr = scanner.nextLine();
				if (interestedStr.contentEquals("Y")) {
					//break the loop
					}else {
						//move to the next
					}
				}
		}
			else {
				System.out.println("Sorry! Nothing available!");
				
			}
			scanner.close();
			}
	
		
		/*System.out.println("Input name: ");
		String inputName = scanner.nextLine();
		System.out.println("Input phone: ");
		String inputPhone = scanner.nextLine();
		System.out.println("Input email: ");
		String inputEmail = scanner.nextLine();
		System.out.println("Input age: ");
		int inputAge = scanner.nextInt();
		
		Resident resident2 = new Resident(inputName, inputPhone, inputEmail, inputAge);
		
		
		System.out.println(resident2);
		
		System.out.println("Input apartment number: ");
		String inputAptNum = scanner.nextLine();
		System.out.println("Input square footage: ");
		float inputSquareFootage = scanner.nextFloat();
		System.out.println("Input number of bedrooms: ");
		int inputNumBedRm = scanner.nextInt();
		System.out.println("Input number of bathrooms: ");
		int inputNumBathRm = scanner.nextInt();
		System.out.println("Input rent: ");
		float inputRent = scanner.nextFloat();
		
		*/
	
	public static void changeResidentName(int numTimes, Resident resident) {
		numTimes += 10;
		resident.setName("Bach");
	}
	
}

class Class2{
	
}