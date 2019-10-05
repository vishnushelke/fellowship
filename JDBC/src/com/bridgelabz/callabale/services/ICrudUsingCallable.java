package com.bridgelabz.callabale.services;

import com.bridgelabz.callabale.model.Student;

public interface ICrudUsingCallable {
	
	public int createCallable(Student student);
	public void readCallable();
	public int updateCallable(int rollnumber,Student student);
	public int deleteCallable(int rollNumber);

}
