package com.bridgelabz.statement.services;

public interface ICrudStatement {
	public void insertValueInStatement(int rollNumber,String name);

	public void readFromStatement() throws Exception;

	public void updateInStatement();

	public void deleteInStatement();

}
