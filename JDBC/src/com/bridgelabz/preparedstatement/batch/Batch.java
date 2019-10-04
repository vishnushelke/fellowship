package com.bridgelabz.preparedstatement.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bridgelabz.preparedstatement.repository.DbConnector;

public class Batch {
	
	static Connection con=null;
	static PreparedStatement stInsert=null;
	static PreparedStatement stUpdate=null;
	static PreparedStatement stDelete=null;

	public static void main(String[] args) throws SQLException {
		
		int[] result=executeAllStatements();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] executeAllStatements() throws SQLException {
		con=DbConnector.getConnection();
		String query="insert into student values(?,?)";
		stInsert=con.prepareStatement(query);
		stInsert.setInt(1, 4);
		stInsert.setString(2, "aish");
		stInsert.addBatch();
		
		stInsert.setInt(1, 2);
		stInsert.setString(2, "mahesh");
		stInsert.addBatch();
		
		String queryUpdate="update student set name='vishnu' where rollno=?";
		stUpdate=con.prepareStatement(queryUpdate);
		stUpdate.setInt(1, 1);
		stUpdate.addBatch();
		return stInsert.executeBatch();
	}

}
