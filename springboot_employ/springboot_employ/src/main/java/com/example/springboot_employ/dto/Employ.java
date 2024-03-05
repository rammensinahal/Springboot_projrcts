package com.example.springboot_employ.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employ {
	@Id
	private int id;
	private String ename;
	private String email;
	private String password;
	private double sal;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", ename=" + ename + ", email=" + email + ", password=" + password + ", sal=" + sal
				+ ", address=" + address + "]";
	}

}
