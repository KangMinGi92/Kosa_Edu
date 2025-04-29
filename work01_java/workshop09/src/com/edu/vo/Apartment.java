package com.edu.vo;

public class Apartment {

	private int price;
	private String address;
	private String brand;
	private int size;

	public Apartment() {
	}

	public Apartment(int price, String address, String brand, int size) {
		super();
		this.price = price;
		this.address = address;
		this.brand = brand;
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Apartment [price=" + price + ", address=" + address + ", brand=" + brand + ", size=" + size + "]";
	}

}