/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;

import com.truckapp.webservices.model.CustomerAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author phani
 */
public class CustomerDAO
{
    Connector connect = new Connector();
    private Statement statement = null;
    private ResultSet getResultSet(String CustomerID) throws Exception
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
		return rs;
	}
    
    public CustomerAttributes getCustomerInfo(String CustomerID) throws Exception
        {
            CustomerAttributes CustomerInfo = new CustomerAttributes();

            ResultSet dataFromDatabase = getResultSet(CustomerID);
            try{
                while(dataFromDatabase.next())
                {
                    CustomerInfo.setCustomerID(dataFromDatabase.getObject(1).toString());
                    CustomerInfo.setCustomerTitle(dataFromDatabase.getObject(2).toString());
                    CustomerInfo.setBusinessName(dataFromDatabase.getObject(3).toString());
                    CustomerInfo.setLocationID(dataFromDatabase.getObject(4).toString());
                    CustomerInfo.setBillingAddress(dataFromDatabase.getObject(5).toString());
                    CustomerInfo.setCity(dataFromDatabase.getObject(6).toString());
                    CustomerInfo.setState(dataFromDatabase.getObject(7).toString());
                    CustomerInfo.setPostalCode(dataFromDatabase.getObject(8).toString());
                    CustomerInfo.setCountry(dataFromDatabase.getObject(9).toString());
                    CustomerInfo.setPhoneNumber(dataFromDatabase.getObject(10).toString());
                    CustomerInfo.setCellNumber(dataFromDatabase.getObject(11).toString());
                    CustomerInfo.setOtherNumber(dataFromDatabase.getObject(12).toString());
                    CustomerInfo.setFaxNumber(dataFromDatabase.getObject(13).toString());
                    CustomerInfo.setEmailAddress(dataFromDatabase.getObject(14).toString());
                    CustomerInfo.setCompanyName(dataFromDatabase.getObject(15).toString());
                    CustomerInfo.setContactName(dataFromDatabase.getObject(16).toString());
                    CustomerInfo.setAlternateContactName(dataFromDatabase.getObject(17).toString());
                    CustomerInfo.setDateEntered(dataFromDatabase.getObject(18).toString());
                    CustomerInfo.setCustomerType(dataFromDatabase.getObject(19).toString());
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
                return CustomerInfo;
        } 
}
