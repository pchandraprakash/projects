package edu.iit.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Jaswanth Busnur Jagadeesh
 * @author Phanindra Chandraprakash
 * @author Rahul Madhusudhan Gudihal
 * @version 1.0
 * @since 12/06/2016
 *
 */

/**
 * 
 * ConnectionFactory class is used to establish database connection using url,
 * username and password details
 *
 */
public class ConnectionFactory {

	public static Connection getCon() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaswanth", "root", "jaswanth");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
