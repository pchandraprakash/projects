/* <h1>FileName: Connect_with_database.java</h1>
 * @author	Phanindra Chandraprakash
 * @version	1.0
 * @date	12/02/2016
 * FinalProject: HospitalManagementSystem
 * Description: This java file contains properties related to data base connection.
 */
package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_with_database 
{
    
    public static Connection createConnection()
    {
        try {
             String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
            return DriverManager.getConnection("jdbc:mysql://www.papademas.net:3306/fp","dbfp","510");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } catch (InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void closeConnection(Connection con)
    {
        if(con!=null)
            try {
                con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}