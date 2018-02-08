/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tws.dao;

import com.tws.model.TruckAppAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author phani
 */
public class TruckAppDAO
{
    Connector connect = new Connector();
    private Statement statement = null;
    private ResultSet getResultSet(String CustomerID, String EmployeeID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from customer where customerid='"+CustomerID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
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
    
    public TruckAppAttributes getTruckAppInfo(String CustomerID, String EmployeeID) throws Exception
        {
            TruckAppAttributes TruckAppInfo = new TruckAppAttributes();

            ResultSet dataFromDatabase = getResultSet(CustomerID,EmployeeID);
            try{
                while(dataFromDatabase.next())
                {
                    TruckAppInfo.setCustomerID(dataFromDatabase.getObject(1).toString());
                    TruckAppInfo.setCustomerTitle(dataFromDatabase.getObject(2).toString());
                    TruckAppInfo.setBusinessName(dataFromDatabase.getObject(3).toString());
                    TruckAppInfo.setLocationID(dataFromDatabase.getObject(4).toString());
                    TruckAppInfo.setBillingAddress(dataFromDatabase.getObject(5).toString());
                    TruckAppInfo.setCity(dataFromDatabase.getObject(6).toString());
                    TruckAppInfo.setState(dataFromDatabase.getObject(7).toString());
                    TruckAppInfo.setPostalCode(dataFromDatabase.getObject(8).toString());
                    TruckAppInfo.setCountry(dataFromDatabase.getObject(9).toString());
                    TruckAppInfo.setPhoneNumber(dataFromDatabase.getObject(10).toString());
                    TruckAppInfo.setCellNumber(dataFromDatabase.getObject(11).toString());
                    TruckAppInfo.setOtherNumber(dataFromDatabase.getObject(12).toString());
                    TruckAppInfo.setFaxNumber(dataFromDatabase.getObject(13).toString());
                    TruckAppInfo.setEmailAddress(dataFromDatabase.getObject(14).toString());
                    TruckAppInfo.setCompanyName(dataFromDatabase.getObject(15).toString());
                    TruckAppInfo.setContactName(dataFromDatabase.getObject(16).toString());
                    TruckAppInfo.setAlternateContactName(dataFromDatabase.getObject(17).toString());
                    TruckAppInfo.setDateEntered(dataFromDatabase.getObject(18).toString());
                    TruckAppInfo.setCustomerType(dataFromDatabase.getObject(19).toString());
                    
                    TruckAppInfo.setEmployeeID(dataFromDatabase.getObject(1).toString());
                    TruckAppInfo.setFirstName(dataFromDatabase.getObject(2).toString());
                    TruckAppInfo.setLastName(dataFromDatabase.getObject(3).toString());
                    TruckAppInfo.setEmail(dataFromDatabase.getObject(4).toString());
                    TruckAppInfo.setExtension(dataFromDatabase.getObject(5).toString());
                    TruckAppInfo.setHomePhone(dataFromDatabase.getObject(6).toString());
                    TruckAppInfo.setCellPhone(dataFromDatabase.getObject(7).toString());
                    TruckAppInfo.setJobTitle(dataFromDatabase.getObject(8).toString());
                    TruckAppInfo.setSocialSecurityNumber(dataFromDatabase.getObject(9).toString());
                    TruckAppInfo.setDriverLicenseNumber(dataFromDatabase.getObject(10).toString());
                    TruckAppInfo.setAddress(dataFromDatabase.getObject(11).toString());
                    TruckAppInfo.setCity(dataFromDatabase.getObject(12).toString());
                    TruckAppInfo.setState(dataFromDatabase.getObject(13).toString());
                    TruckAppInfo.setPostalCode(dataFromDatabase.getObject(14).toString());
                    TruckAppInfo.setBirthDate(dataFromDatabase.getObject(15).toString());
                    TruckAppInfo.setDateHired(dataFromDatabase.getObject(16).toString());
                    TruckAppInfo.setSalary(dataFromDatabase.getObject(17).toString());
                    TruckAppInfo.setNotes(dataFromDatabase.getObject(18).toString());
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
                return TruckAppInfo;  
        }
}
