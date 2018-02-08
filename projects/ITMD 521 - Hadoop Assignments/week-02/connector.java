import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connector 
{
	public static void main(String[] args) 
	{
		String dbURL = "jdbc:mysql://127.0.0.1/itmd_521"; 
		String username ="root"; 
		String password = "safestsystemever"; 
		Connection dbCon = null; 
		Statement stmt = null; 
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		
		String query1 = "select max(airtemp) from set1";
		try
		{
			dbCon = DriverManager.getConnection(dbURL, username, password);
			stmt = dbCon.prepareStatement(query);
			rs = stmt.executeQuery(query);	
			System.out.println("The maximum temperature is: " + rs1);
			
		}

		String query2 = "select max(airtemp) from set2";
		try
		{
			dbCon = DriverManager.getConnection(dbURL, username, password);
			stmt = dbCon.prepareStatement(query);
			rs = stmt.executeQuery(query);	
			System.out.println("The maximum temperature is: " + rs2);
			
		}

		String query3 = "select max(airtemp) from set3";
		try
		{
			dbCon = DriverManager.getConnection(dbURL, username, password);
			stmt = dbCon.prepareStatement(query);
			rs = stmt.executeQuery(query);	
			System.out.println("The maximum temperature is: " + rs3);
			
		}
		catch (SQLException ex)
		{
			System.out.println("Cannot connect to the database");
			ex.printStackTrace();
		}
	}
}
