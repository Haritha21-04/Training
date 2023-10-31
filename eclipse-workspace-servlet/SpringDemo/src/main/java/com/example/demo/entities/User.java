package com.example.demo.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String password;
	private String name;
	private String place;
	private int balance;
	public User() {
		super();
	}
	public User(int userid, String password, String name, String place, int balance) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.place = place;
		this.balance = balance;
	}
 
	public User(String password, String name, String place, int balance) {
		super();
		this.password = password;
		this.name = name;
		this.place = place;
		this.balance = balance;
	}
 
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
 
	public int getBalance() {
		return balance;
	}
 
	public void setBalance(int balance) {
		this.balance = balance;
	}
 
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + ", name=" + name + ", place=" + place
				+ ", balance=" + balance + "]";
	}
 
	
}