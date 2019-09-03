package com.techtalent.leasing.domain;

import java.util.*;

public class Community {
	private String community;
	private float rentForAPet;
	private String address;
	private boolean petsAllowed;
	private boolean hasPlayground;
	
	private List<Apartment> apartments;
	
	public Community() {
		super();
	}
	
	public Community(String name, float rentForAPet, String address, int numOfApartments) {
		super();
		this.community = name;
		this.rentForAPet = rentForAPet;
		this.address = address;
		
		apartments = new ArrayList<>();
		
		for (int i = 0; i< numOfApartments; i++)
		{
			Apartment apartment = new Apartment();
			apartments.add(apartment);
			apartment.setAptNum(Integer.toString(i+1));
			apartment.setavailability(true);
			apartment.setBaseRent(10);
			apartment.setNumBedRm(2);
			apartment.setSquareFootage(1000);
		}
	}
	public Community(String community, float rentForAPet, String address, List<Apartment> apartments) {
		super();
		this.community = community;
		this.rentForAPet = rentForAPet;
		this.address = address;
		this.apartments = apartments;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public float getRentForAPet() {
		return rentForAPet;
	}
	public void setRentForAPet(float rentForAPet) {
		this.rentForAPet = rentForAPet;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Community [community=" + community + ", rentForAPet=" + rentForAPet + ", address=" + address + "]";
	}
	public boolean areApartmentAvailable() {
		for (Apartment apartment: apartments) {
			if (apartment.isavailability())
				return true;
		}
		return false;
	}
	public boolean arePetsAllowed() {
				return petsAllowed;		
	}

	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}

	public boolean hasPlayground() {
		return hasPlayground;
	}

	public void setHasPlayground(boolean hasPlayground) {
		this.hasPlayground = hasPlayground;
	}

	public List<Apartment> getAvailableApartments() {
		// TODO Auto-generated method stub
		return apartments;
	}
	
	
}
