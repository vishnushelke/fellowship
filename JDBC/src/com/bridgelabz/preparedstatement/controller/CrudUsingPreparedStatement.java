/******************************************************************************
 *  Compilation:  javac -d bin CrudUsingPreparedStatement.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.CrudUsingPreparedStatement n
 *  
 *  Purpose: Does CRUD operations using Prepared statement
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.preparedstatement.controller;

import java.util.Scanner;

import com.bridgelabz.preparedstatement.model.Student;

//Login Page remained

import com.bridgelabz.preparedstatement.services.ImplCrudPreparedStatement;

public class CrudUsingPreparedStatement {

	public static void main(String[] args) throws Exception {
		Student student= new Student();
		Scanner sc= new Scanner(System.in);
		ImplCrudPreparedStatement util = new ImplCrudPreparedStatement();

		boolean exit = false;
		while (!exit) {
			System.out.println(
					"What do you want to do?\n1.create in database\n2.read from database\n3.Update the database\n4.delete from database\n5.exit");
			switch (ImplCrudPreparedStatement.intScan()) {
			case 1:// insert into table
				System.out.println("enter roll number");
				student.setRollNumber(sc.nextInt());
				System.out.println("Enter the name");
				student.setName(sc.next());
				util.insertValueInPreparedStatement(student);
				break;

			case 2:// read using prepared statement
				util.readFromPreparedStatement();
				break;

			case 3:// update using prepared statement
				Student studentUpdate = new Student();
				System.out.println("Enter roll number of person you wish to edit");
				int rollNumber=sc.nextInt();
				System.out.println("Enter new name");
				studentUpdate.setName(sc.next());
				util.updateInPreparedStatement(studentUpdate,rollNumber);
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