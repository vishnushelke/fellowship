package com.bridgelabz.statement.batchprocessing;

import com.bridgelabz.statement.repository.DbConnector;
import java.sql.*;

public class Batch {
	static Connection con = null;
	static Statement st = null;

	public static void main(String[] args) throws SQLException {

		int[] result = executeAllQuery();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] executeAllQuery() throws SQLException {
		String query = "insert into student values(3,'vishnu')";
		
		String queryDelete = "delete from student where rollno=2";
		
		String queryUpdate = "update student set name='priyanka' where rollno=1";
	
		

		con = DbConnector.getConnection();

		st = con.createStatement();
		st.addBatch(query);
		st.addBatch(queryDelete);
		st.addBatch(queryUpdate);
		return st.executeBatch();

	}

}
