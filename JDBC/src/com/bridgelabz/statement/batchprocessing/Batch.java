package com.bridgelabz.statement.batchprocessing;

import com.bridgelabz.statement.repository.DbConnector;
import java.sql.*;

public class Batch {
	static Connection con = null;
	static Statement st = null;

	public static void main(String[] args) throws SQLException {

		int[] result = executeAllQuery();
		for (int i : result) {
			System.out.println(result[i]);
		}
	}

	public static int[] executeAllQuery() throws SQLException {
		String query = "insert into student values(3,'vishnu')";
		st.addBatch(query);
		String queryDelete = "delete from student where rollno=2";
		st.addBatch(queryDelete);
		String queryUpdate = "update student set name='priyanka' where rollno=1";
		st.addBatch(queryUpdate);
		

		con = DbConnector.getConnection();

		st = con.createStatement();
		
		
		
		return st.executeBatch();

	}

}
