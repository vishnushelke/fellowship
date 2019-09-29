package com.bridgelabz.model;

import java.util.ArrayList;
import java.util.List;

public class State {
	String statename;
	ArrayList<Person> person;

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public ArrayList<Person> getPerson() {
		return person;
	}

	public void setPerson(ArrayList<Person> person) {
		this.person = person;
	}

}
