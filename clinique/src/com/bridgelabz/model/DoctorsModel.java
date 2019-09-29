package com.bridgelabz.model;

import java.util.ArrayList;

public class DoctorsModel {

	private ArrayList<Doctor> doctors;

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "DoctorsModel [doctors=" + doctors + ", getDoctors()=" + getDoctors() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
