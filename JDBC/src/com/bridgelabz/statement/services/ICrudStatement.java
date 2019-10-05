package com.bridgelabz.statement.services;

import com.bridgelabz.statement.model.Student;

public interface ICrudStatement {
	/**
	 * @author vishnu shelke
	 * @purpose create a student in table
	 * @parameter Student object
	 */
	public int insertValueInStatement(Student student);

	/**
	 * @author vishnu shelke
	 * @purpose read the table
	 */
	public void readFromStatement() ;

	/**
	 * @author vishnu shelke
	 * @purpose update a student in table
	 * @parameter Student object
	 */
	public int updateInStatement(Student student);

	/**
	 * @author vishnu shelke
	 * @purpose update a student in table
	 * @parameter roll number of student
	 */
	public int deleteInStatement(int rollNumber);

	

}
