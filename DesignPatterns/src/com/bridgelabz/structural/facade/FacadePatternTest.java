/******************************************************************************
 *  Compilation:  javac -d bin FacadePatternTest.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.FacadePatternTest n
 *  
 *  Purpose: Example of Factory Facade Pattern
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   29-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.facade;

import java.sql.Connection;



public class FacadePatternTest {

	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = (Connection) MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, (com.sun.jdi.connect.spi.Connection) con);
		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}
