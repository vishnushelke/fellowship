package com.bridgelabz.statement.controller;


import com.bridgelabz.statement.services.ImplCrudStatement;

public class CrudUsingStatement {

	public static void main(String[] args) throws Exception {

		ImplCrudStatement util = new ImplCrudStatement();
		boolean exit=false;
		while(!exit)
		{
			System.out.println(
					"What do you want to do?\n1.create in database\n2.read from database\n3.Update the database\n4.delete from database\n5.exit");
			switch (ImplCrudStatement.intScan()) {
			case 1:// create into table
				System.out.println("enter roll number");
				int rollNumber=ImplCrudStatement.intScan();
				System.out.println("enter name");
				String name=ImplCrudStatement.stringScan();
				util.insertValueInStatement(rollNumber,name);
				System.out.println("after creating :");
				util.readFromStatement();
				break;
				
			case 2:// read data from the table
				System.out.println("Table is :");
				util.readFromStatement();
				break;
				
			case 3:// update into the table
				util.updateInStatement();
				System.out.println("after updating :");
				util.readFromStatement();
				break;
				
			case 4:// delete from table
				util.deleteInStatement();
				System.out.println("after deleting :");
				util.readFromStatement();
				break;
				
			case 5:exit=true;
					break;
				
			default:
				System.out.println("enter valid input");
				break;
			}
			
		}
		

	}
}
