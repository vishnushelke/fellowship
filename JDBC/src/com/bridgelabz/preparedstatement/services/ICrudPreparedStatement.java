package com.bridgelabz.preparedstatement.services;

import com.bridgelabz.preparedstatement.model.Student;

public interface ICrudPreparedStatement{

	public int insertValueInPreparedStatement(Student student);
	public void readFromPreparedStatement();
	public int updateInPreparedStatement(Student student,int rollNumber);
	public int deleteInPreparedStatement(int rollDelete);
}
