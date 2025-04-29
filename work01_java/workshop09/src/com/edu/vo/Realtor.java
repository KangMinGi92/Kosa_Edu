package com.edu.vo;

public class Realtor {
	private int brn;
	private String name;
	private String address;
	private Apartment[] apartments;

	public Realtor() {
	}

	public Realtor(int brn, String name, String address) {
		this.brn = brn;
		this.name = name;
		this.address = address;
	}

	public int getBrn() {
		return brn;
	}

	public void setBrn(int brn) {
		this.brn = brn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Apartment[] getApartments() {
		return apartments;
	}

	public void setApartments(Apartment[] apartments) {
		this.apartments = apartments;
	}

	@Override
	public String toString() {
		return "Realtor [brn=" + brn + ", name=" + name + ", address=" + address + "]";
	}

}