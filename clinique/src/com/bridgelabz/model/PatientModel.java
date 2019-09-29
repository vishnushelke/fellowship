package com.bridgelabz.model;

import java.util.ArrayList;

public class PatientModel {

	private ArrayList<Patient> patients;

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "PatientModel [patients=" + patients + ", getPatients()=" + getPatients() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
