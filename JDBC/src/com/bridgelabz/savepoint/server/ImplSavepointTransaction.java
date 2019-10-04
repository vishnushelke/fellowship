package com.bridgelabz.savepoint.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.bridgelabz.callabale.repository.DbConnector;

public class ImplSavepointTransaction implements ISavepointProgram {

	@Override
	public void transactUsingSavepoint() {
		Connection con = DbConnector.getConnection();
		String query = "insert into student values(?,?)";

		try {
			con.setAutoCommit(false);
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "suman");
			preparedStatement.executeUpdate();

			/**
			 * Creating savepoint over here,if error caomes while executing secong query, it
			 * will rollback to this point
			 *
			 */
			Savepoint savepoint = con.setSavepoint();

			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "akshay");
			preparedStatement.executeUpdate();
			con.rollback(savepoint);
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
