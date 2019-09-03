package com.techtalent.leasing.domain;

public class Resident {
	private String name;
	private String phone;
	private String email;
	private String ssn;
	private int numPets;
	private int numMembers;
	private int age;
	
	public Resident () {
		System.out.println("New Resident Enrolled");
	}
	public Resident (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public Resident(String name, String phone, String email, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}
	
	public Resident(String name, String phone, String email, String ssn, int numPets, int numMembers, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.ssn = ssn;
		this.numPets = numPets;
		this.numMembers = numMembers;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resident other = (Resident) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getNumPets() {
		return numPets;
	}
	public void setNumPets(int numPets) {
		this.numPets = numPets;
	}
	public int getNumMembers() {
		return numMembers;
	}
	public void setNumMembers(int numMembers) {
		this.numMembers = numMembers;
	}
	@Override
	public String toString() {
		return "Resident Info: [name=" + name + ", phone=" + phone + ", email=" + email + ", age=" + age + "]";
	}
	
	
	
}
