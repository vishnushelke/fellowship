package com.bridgelabz.preparedstatement.controller;

import java.sql.*;

import com.bridgelabz.preparedstatement.services.ImplCrudPreparedStatement;

import com.bridgelabz.statement.repository.DbConnector;

public class CrudUsingPreparedStatement {

	public static void main(String[] args) throws Exception {
		ImplCrudPreparedStatement util = new ImplCrudPreparedStatement();

		boolean exit = false;
		while (!exit) {
			System.out.println(
					"What do you want to do?\n1.create in database\n2.read from database\n3.Update the database\n4.delete from database\n5.exit");
			switch (ImplCrudPreparedStatement.intScan()) {
			case 1:// insert into table
				System.out.println("enter roll number");
				int rollNumber = ImplCrudPreparedStatement.intScan();
				System.out.println("Enter the name");
				String name = ImplCrudPreparedStatement.stringScan();
				util.insertValueInPreparedStatement(rollNumber,name);
				break;

			case 2:// read using prepared statement
				util.readFromPreparedStatement();
				break;

			case 3:// update using prepared statement
				util.updateInPreparedStatement();
				break;

			case 4:// delete using prepared statement

				util.deleteInPreparedStatement();
				break;

			case 5:
				exit = true;
				break;

			default:
				System.out.println("enter valid input");
				break;
			}
		}

	}

}