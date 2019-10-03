package com.bridgelabz.preparedstatement.services;

public interface ICrudPreparedStatement{

	public void insertValueInPreparedStatement(int rollNumber,String name);
	public void readFromPreparedStatement();
	public void updateInPreparedStatement();
	public void deleteInPreparedStatement();
}
