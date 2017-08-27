/**
 * @(#)Connect database .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 *
 * Version 1.00.
 */
package fjs.cs.common;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Method used to connect database with program. The database using SQL server
 * has initialized the name struts project including the table is MSTUSER and
 * MSTCUSTOMER.
 */
public class ConnectDB {
	public Connection getConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			String url = "jdbc:jtds:sqlserver://localhost:1433/StrutsProject";
			Connection conn = DriverManager
					.getConnection(url, "sa", "Abc12345");
			/**
			 * The result of the connection method returned is a connection if
			 * successful connection with the opposite database connection
			 * failed, the result returned is false
			 */
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}