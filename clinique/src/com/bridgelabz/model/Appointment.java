package com.bridgelabz.model;

public class Appointment {

	private int appointmentnumber;
	private String patientName;
	private String patientId; 
	private String doctorName;
	private String doctorId;
	private String slot;
	private String date;
	public int getAppointmentnumber() {
		return appointmentnumber;
	}
	public void setAppointmentnumber(int appointmentnumber) {
		this.appointmentnumber = appointmentnumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentnumber=" + appointmentnumber + ", patientName=" + patientName + ", patientId="
				+ patientId + ", doctorName=" + doctorName + ", doctorId=" + doctorId + ", slot=" + slot + ", date="
				+ date + "]";
	}
	
	
	
}
