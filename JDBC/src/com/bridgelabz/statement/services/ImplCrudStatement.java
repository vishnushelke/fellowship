package com.bridgelabz.statement.services;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bridgelabz.statement.repository.DbConnector;

public class ImplCrudStatement implements ICrudStatement {
	
	
	static Scanner sc=new Scanner(System.in);
	static Connection con=DbConnector.getConnection();
	static Statement st=null; 
	@Override
	public void insertValueInStatement(int rollNumber,String name) {
		
		String queryCreate = "insert into student values('"+rollNumber+"','"+name+"')";
		
		Statement stCreate;
		try {
			stCreate = con.createStatement();
			int count = stCreate.executeUpdate(queryCreate);
			System.out.println(count + " row/s affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void readFromStatement() throws SQLException {
		String query = "select * from student";
		st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			String userInfo = rs.getInt(1) + " " + rs.getString(2);
			System.out.println(userInfo);
		}
	}

	@Override
	public void updateInStatement() {
		String queryUpdate = "update student set name='mahesh' where rollno=1";
		
		Statement stUpdate;
		try {
			stUpdate = con.createStatement();
			int countUpdate = stUpdate.executeUpdate(queryUpdate);
			System.out.println(countUpdate + " row/s affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteInStatement() {
		String queryDelete = "delete from student where rollno=1";
		
		Statement stDelete;
		try {
			stDelete = con.createStatement();
			int countdelete = stDelete.executeUpdate(queryDelete);
			System.out.println(countdelete + " row/s affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static int intScan()
	{
		int n=sc.nextInt();
		return n;
	}

	public static String stringScan()
	{
		String n=sc.nextLine();
		return n;
	}

}
