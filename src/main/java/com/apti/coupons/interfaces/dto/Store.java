package com.apti.coupons.interfaces.dto;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Store implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1865905710645020046L;
	private double lat;
	private double longtiude;
	private String city;
	private String phone;
	private String state;
	private String street;
	private String zip;
	
	public Store() {
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLongtiude() {
		return longtiude;
	}
	public void setLongtiude(double longtiude) {
		this.longtiude = longtiude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
