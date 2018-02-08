/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;

import com.truckapp.webservices.model.EmployeeAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author phani
 */
public class EmployeeDAO
{
    Connector connect = new Connector();
    private Statement statement = null;
    private ResultSet getResultSet(String EmployeeID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from employee where employeeid='"+EmployeeID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
    
    public EmployeeAttributes getEmployeeInfo(String EmployeeID) throws Exception
        {
            EmployeeAttributes EmployeeInfo = new EmployeeAttributes();

            ResultSet dataFromDatabase = getResultSet(EmployeeID);
            try{
                while(dataFromDatabase.next())
                {
                    EmployeeInfo.setEmployeeID(dataFromDatabase.getObject(1).toString());
                    EmployeeInfo.setFirstName(dataFromDatabase.getObject(2).toString());
                    EmployeeInfo.setLastName(dataFromDatabase.getObject(3).toString());
                    EmployeeInfo.setEmail(dataFromDatabase.getObject(4).toString());
                    EmployeeInfo.setExtension(dataFromDatabase.getObject(5).toString());
                    EmployeeInfo.setHomePhone(dataFromDatabase.getObject(6).toString());
                    EmployeeInfo.setCellPhone(dataFromDatabase.getObject(7).toString());
                    EmployeeInfo.setJobTitle(dataFromDatabase.getObject(8).toString());
                    EmployeeInfo.setSocialSecurityNumber(dataFromDatabase.getObject(9).toString());
                    EmployeeInfo.setDriverLicenseNumber(dataFromDatabase.getObject(10).toString());
                    EmployeeInfo.setAddress(dataFromDatabase.getObject(11).toString());
                    EmployeeInfo.setCity(dataFromDatabase.getObject(12).toString());
                    EmployeeInfo.setState(dataFromDatabase.getObject(13).toString());
                    EmployeeInfo.setPostalCode(dataFromDatabase.getObject(14).toString());
                    EmployeeInfo.setBirthDate(dataFromDatabase.getObject(15).toString());
                    EmployeeInfo.setDateHired(dataFromDatabase.getObject(16).toString());
                    EmployeeInfo.setSalary(dataFromDatabase.getObject(17).toString());
                    EmployeeInfo.setNotes(dataFromDatabase.getObject(18).toString());
                }         
            } 
            catch(Exception ex)
            {
                ex.printStackTrace();
            } 
            finally
            {
                dataFromDatabase.close();
            }
                return EmployeeInfo;
        } 
}
