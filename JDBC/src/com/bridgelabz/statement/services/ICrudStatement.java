package com.bridgelabz.statement.services;

import com.bridgelabz.statement.model.Student;

public interface ICrudStatement {
	public void insertValueInStatement(Student student);

	public void readFromStatement() ;

	public void updateInStatement(Student student,int rollNumber);

	public void deleteInStatement();

	

}
