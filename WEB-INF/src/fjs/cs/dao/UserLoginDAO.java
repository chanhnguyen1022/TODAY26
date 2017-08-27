/**
 * @(#)Login form check username ? password? .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 *
 * Version 1.00.
 */
package fjs.cs.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import fjs.cs.common.ConnectDB;

public class UserLoginDAO {
	/**
	 * The method used to look up the username and password entered from the
	 * user matches the username and password stored in the database.
	 */
	public boolean authenticate(String UserId, String Password) {
		ConnectDB connectDB = new ConnectDB();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = connectDB.getConnection();
			/**
			 * Query used get username and password from database.
			 */
			String sql = " SELECT *FROM MSTUSER WHERE USERID=? AND PASSWORD=?";
			/**
			 * Get username and password from database
			 */
			ps = conn.prepareStatement(sql);
			ps.setString(1, UserId);
			ps.setString(2, Password);
			rs = ps.executeQuery();
			if (rs.next()) {
				/**
				 * The result returned is true if the username and password of
				 * the user entered are the same as the usename and password
				 * values ​​in the database
				 */
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		/**
		 * The result returned is false if the user's username and password do
		 * not match the usename and password values ​​in the database
		 */
		return false;
	}
}