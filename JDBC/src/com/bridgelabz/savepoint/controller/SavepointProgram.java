package com.bridgelabz.savepoint.controller;

import java.sql.*;
import com.bridgelabz.savepoint.server.ImplSavepointTransaction;

public class SavepointProgram {

	public static void main(String[] args) throws SQLException {
		ImplSavepointTransaction util = new ImplSavepointTransaction();
		util.transactUsingSavepoint();

	}

}
