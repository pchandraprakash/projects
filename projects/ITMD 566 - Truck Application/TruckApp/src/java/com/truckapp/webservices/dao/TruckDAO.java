/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;
import com.truckapp.webservices.model.TruckAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author phani
 */
public class TruckDAO
{
    Connector connect = new Connector();
	private Statement statement = null;
	private ResultSet getResultSet(String VIN) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from truck where VIN='"+VIN+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
        
        public TruckAttributes getTruckInfo(String VIN) throws Exception
        {
            TruckAttributes TruckInfo1 = new TruckAttributes();

            ResultSet dataFromDatabase = getResultSet(VIN);
            try{
                while(dataFromDatabase.next())
                {
                    TruckInfo1.setTruckNo(dataFromDatabase.getObject(1).toString());
                    TruckInfo1.setMake(dataFromDatabase.getObject(2).toString());
                    TruckInfo1.setYear(dataFromDatabase.getObject(3).toString());
                    TruckInfo1.setModel(dataFromDatabase.getObject(4).toString());
                    TruckInfo1.setLicensePlateNo(dataFromDatabase.getObject(5).toString());
                    TruckInfo1.setEmployeeID(dataFromDatabase.getObject(6).toString());      
                    TruckInfo1.setColor(dataFromDatabase.getObject(7).toString());
                    TruckInfo1.setVIN(dataFromDatabase.getObject(8).toString());
                    TruckInfo1.setCommentID(dataFromDatabase.getObject(9).toString());
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
                return TruckInfo1;
        } 
}
