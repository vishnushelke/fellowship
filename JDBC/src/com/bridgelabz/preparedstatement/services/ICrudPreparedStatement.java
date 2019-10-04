package com.bridgelabz.preparedstatement.services;

import com.bridgelabz.preparedstatement.model.Student;

public interface ICrudPreparedStatement{

	public void insertValueInPreparedStatement(Student student);
	public void readFromPreparedStatement();
	public void updateInPreparedStatement(Student student,int rollNumber);
	public void deleteInPreparedStatement();
}
