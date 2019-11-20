package com.finalProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="userregistration")
public class UserRegistration {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user-seq")
	@SequenceGenerator(name="user-seq",sequenceName="flight_seq",allocationSize=1)
	private String first_name;
	private String last_name;
	private int age;
	private long mobile_no;
	private String email;
	private String password;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRegistration [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age
				+ ", mobile_no=" + mobile_no + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
