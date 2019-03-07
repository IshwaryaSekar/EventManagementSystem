package com.chainsys.model;

public class Registration {
	@Override
	public String toString() {
		return "Registration [name=" + name + ", id=" + id + ", password="
				+ password + ", mobilenumber=" + mobilenumber + "]";
	}
	private String name;
	private int id;
	private String password;
	private String mobilenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	}
