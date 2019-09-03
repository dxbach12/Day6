package com.techtalent.leasing.domain;

public class Apartment {
	private String aptNum;
	private float squareFootage;
	private boolean availability;
	private int numBedRm;
	private int numBathRm;
	private float rent;
	private float baseRent;
	private Community community;

	public Apartment() {
		super();
	}
	public Apartment(String aptNum, float squareFootage, boolean availability, int numBedRm, int numBathRm, float rent) {
		super();
		this.aptNum = aptNum;
		this.squareFootage = squareFootage;
		this.availability = availability;
		this.numBedRm = numBedRm;
		this.numBathRm = numBathRm;
		this.rent = rent;
	}
	public String getAptNum() {
		return aptNum;
	}
	public void setAptNum(String aptNum) {
		this.aptNum = aptNum;
	}
	public float getSquareFootage() {
		return squareFootage;
	}
	public void setSquareFootage(float squareFootage) {
		this.squareFootage = squareFootage;
	}
	public boolean isavailability() {
		return availability;
	}
	public void setavailability(boolean availability) {
		this.availability = availability;
	}
	public int getNumBedRm() {
		return numBedRm;
	}
	public void setNumBedRm(int numBedRm) {
		this.numBedRm = numBedRm;
	}
	public int getNumBathRm() {
		return numBathRm;
	}
	public void setNumBathRm(int numBathRm) {
		this.numBathRm = numBathRm;
	}
	public float getRent() {
		return rent;
	}
	public void setRent(float rent) {
		this.rent = rent;
	}
	public float getBaseRent() {
		return baseRent;
	}
	public void setBaseRent(float baseRent) {
		this.baseRent = baseRent;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	@Override
	public String toString() {
		return "Apartment Info: \naptNum=" + aptNum + "\nsquareFootage=" + squareFootage + "\navailability=" + availability
				+ "\nnumBedRm=" + numBedRm + "\nnumBathRm=" + numBathRm + "\nrent=" + rent + "\n" + community
				+ "]";
	}
	
	public float calculateRent(Resident resident) {
		float petRent = resident.getNumPets() * this.community.getRentForAPet();
		float rent = this.baseRent * this.squareFootage;
		
		return petRent + rent;
	}
	
	

}
