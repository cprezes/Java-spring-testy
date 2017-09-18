package com.jsf.spring_kurs1.model;

public class Tasks {
	private int id;

	public Tasks(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Zadanie " + id;

	}
}
