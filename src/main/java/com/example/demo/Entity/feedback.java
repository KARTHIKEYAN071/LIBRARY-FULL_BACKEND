package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class feedback {
	@Id
	@Column(name="name")
	private String name;
	@Column(name="date")
	private String date;
	@Column(name="rules")
	private String rules;
	@Column(name="availablity")
	private String availablity;
	@Column(name="quality")
	private String quality;
	@Column(name="quantity")
	private String quantity;
	@Column(name="staff")
	private String staff;
	@Column(name="cooperation")
	private String cooperation;
	@Column(name="environment")
	private String environment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public String getAvailablity() {
		return availablity;
	}
	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getCooperation() {
		return cooperation;
	}
	public void setCooperation(String cooperation) {
		this.cooperation = cooperation;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	
	

}
