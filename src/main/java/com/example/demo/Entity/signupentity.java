package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LMSignup")
public class signupentity {
	@Id
	@Column(name="rollno")
	private int rollno;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String Password;
	@Column(name="ConformPassword")
	private String ConformPassword;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="DateOfBirth")
	private String DateOfBirth;
	@Column(name="Gender")
	private String Gender;
	@Column(name="PhoneNo")
	private String PhoneNo;
	
//	public signupentity(int rollno, String email, String password, String conformPassword, String firstName,
//			String lastName, String dateOfBirth, String gender, String phoneNo) {
//		super();
//		this.rollno = rollno;
//		Email = email;
//		Password = password;
//		ConformPassword = conformPassword;
//	FirstName = firstName;
//		LastName = lastName;
//		DateOfBirth = dateOfBirth;
//		Gender = gender;
//		PhoneNo = phoneNo;
//	}
//	public signupentity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public int getSno() {
		return rollno;
	}
	public void setSno(int sno) {
		this.rollno = sno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConformPassword() {
		return ConformPassword;
	}
	public void setConformPassword(String conformPassword) {
		ConformPassword = conformPassword;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

}