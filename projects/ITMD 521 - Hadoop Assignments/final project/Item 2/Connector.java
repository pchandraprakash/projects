package com.finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		String dbURL = "jdbc:mysql://127.0.0.1:2222/itmd521"; 
		String username ="root"; 
		String password = "root"; 
		String query = "LOAD DATA LOCAL INFILE 'G:/2nd Semester Subjects/ITMD 521/Final Project/JavaCodes/user.txt' INTO TABLE user;";
		try
		{
			Connection dbCon = DriverManager.getConnection(dbURL, username, password);
			Statement stmt = dbCon.prepareStatement(query);
			ResultSet rs = stmt.executeQuery(query);
			/*
			while(rs.next())
			{
				int output = rs.getInt(1);
				System.out.println("The values are: " + output);
			} */
		}
		catch (SQLException ex)
		{
			System.out.println("Cannot connect to the database");
			ex.printStackTrace();
		}
	}
}