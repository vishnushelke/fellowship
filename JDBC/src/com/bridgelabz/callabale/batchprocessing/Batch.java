package com.bridgelabz.callabale.batchprocessing;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.bridgelabz.callabale.repository.DbConnector;

public class Batch {
	static Connection con=null;
	static CallableStatement stCallable=null;

	public static void main(String[] args) throws SQLException {
		int[] result=executeAll();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] executeAll() throws SQLException {
		con=DbConnector.getConnection();
		stCallable=con.prepareCall("call createStudent(?,?)");
		stCallable.setInt(1, 2);
		stCallable.setString(2, "mahesh");
		stCallable.addBatch();
		
		stCallable.setInt(1, 3);
		stCallable.setString(2, "sachin");
		stCallable.addBatch();
		return stCallable.executeBatch();
	}

}
