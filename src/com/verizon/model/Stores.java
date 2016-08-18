
package com.verizon.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Stores {

	int storeNumber;

	private String storeName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private String phoneNumber;
	private String storeHours;
	private double latitude;
	private double longitude;
	private String country;

	
	public int getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStoreHours() {
		return storeHours;
	}
	public void setStoreHours(String storeHours) {
		this.storeHours = storeHours;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Stores(int storeNumber, String storeName, String address,
			String city, String state, int zipCode, String phoneNumber,
			String storeHours, double latitude, double longitude, String country) {
		super();
		this.storeNumber = storeNumber;
		this.storeName = storeName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.storeHours = storeHours;
		this.latitude = latitude;
		this.longitude = longitude;
		this.country = country;
	}
	public Stores() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stores [StoreNumber=" + storeNumber + ", StoreName=" + storeName + ", Address=" + address + ", City="
				+ city + ", State=" + state + ", ZipCode=" + zipCode + ", PhoneNumber=" + phoneNumber + ", StoreHours="
				+ storeHours + ", Latitude=" + latitude + ", Longitude=" + longitude + ", Country=" + country + "]";
	}
	
	
	
	
	
	
}