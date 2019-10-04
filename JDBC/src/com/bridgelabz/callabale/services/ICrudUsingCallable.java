package com.bridgelabz.callabale.services;

import com.bridgelabz.callabale.model.Student;

public interface ICrudUsingCallable {
	
	public void createCallable(Student student);
	public void readCallable();
	public void updateCallable(int rollnumber,Student student);
	public void deleteCallable(int rollNumber);

}
