/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;
import com.truckapp.webservices.model.LocationAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
/**
 *
 * @author phani
 */
public class LocationDAO 
{
    Connector connect = new Connector();
	private Statement statement = null;
	private ResultSet getResultSet(String LocationID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from location where locationID='"+LocationID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
        
        public LocationAttributes getLocationInfo(String LocationID) throws Exception
        {
            LocationAttributes LocationInfo = new LocationAttributes();

            ResultSet dataFromDatabase = getResultSet(LocationID);
            try{
                while(dataFromDatabase.next())
                {
                    LocationInfo.setLocationID(dataFromDatabase.getObject(1).toString());
                    LocationInfo.setLocName(dataFromDatabase.getObject(2).toString());
                    LocationInfo.setLocationCode(dataFromDatabase.getObject(3).toString());
                    LocationInfo.setIsActive(dataFromDatabase.getObject(4).toString());
                    LocationInfo.setCustomerID(dataFromDatabase.getObject(5).toString());
                    LocationInfo.setAddressstreet1(dataFromDatabase.getObject(6).toString());
                    LocationInfo.setAddressstreet2(dataFromDatabase.getObject(7).toString());
                    LocationInfo.setCity(dataFromDatabase.getObject(8).toString());
                    LocationInfo.setState(dataFromDatabase.getObject(9).toString());
                    LocationInfo.setPostalCode(dataFromDatabase.getObject(10).toString());
                    LocationInfo.setRegion(dataFromDatabase.getObject(11).toString());
                    LocationInfo.setLocation_contact_name(dataFromDatabase.getObject(12).toString());
                    LocationInfo.setLocPhone(dataFromDatabase.getObject(13).toString());
                    LocationInfo.setLocFaxNumber(dataFromDatabase.getObject(14).toString());
                    LocationInfo.setLocEmail(dataFromDatabase.getObject(15).toString());
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
                return LocationInfo;
        } 
}
