package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@Column(name="adminid")
	private int adminid;
	@Column(name="email")
	private String email;
	@Column(name="adminphoto")
	private String adminphoto;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="age")
	private String age;
	@Column(name="address")
	private String address;
	@Column(name="qualification")
	private String qualification;
	@Column(name="phonenumber")
	private String phonenumber;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdminphoto() {
		return adminphoto;
	}
	public void setAdminphoto(String adminphoto) {
		this.adminphoto = adminphoto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
