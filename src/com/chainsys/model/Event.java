package com.chainsys.model;

import java.time.LocalDate;

public class Event {
	private String name;
	private int amount;
	private LocalDate organize_date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDate getOrganize_date() {
		return organize_date;
	}

	public void setOrganize_date(LocalDate organize_date) {
		this.organize_date = organize_date;
	}

}
