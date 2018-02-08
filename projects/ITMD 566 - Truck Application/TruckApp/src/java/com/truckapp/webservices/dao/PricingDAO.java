/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;
import com.truckapp.webservices.model.PricingAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author phani
 */
public class PricingDAO 
{
    Connector connect = new Connector();
	private Statement statement = null;
	private ResultSet getResultSet(String PriceID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from pricing where PriceID='"+PriceID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
        
        public PricingAttributes getPriceInfo(String PriceID) throws Exception
        {
            PricingAttributes PriceInfo = new PricingAttributes();

            ResultSet dataFromDatabase = getResultSet(PriceID);
            try{
                while(dataFromDatabase.next())
                {
                    PriceInfo.setPriceID(dataFromDatabase.getObject(1).toString());
                    PriceInfo.setLocationIDFrom(dataFromDatabase.getObject(2).toString());
                    PriceInfo.setLocationIDTo(dataFromDatabase.getObject(3).toString());
                    PriceInfo.setPrice(dataFromDatabase.getObject(4).toString());
                    PriceInfo.setLocationCodeFrom(dataFromDatabase.getObject(5).toString());
                    PriceInfo.setLocationCodeTo(dataFromDatabase.getObject(6).toString());
                    PriceInfo.setLocationNameFrom(dataFromDatabase.getObject(7).toString());
                    PriceInfo.setLocationNameTo(dataFromDatabase.getObject(8).toString());
                    PriceInfo.setCustomerID(dataFromDatabase.getObject(9).toString());
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
                return PriceInfo;
        } 
}
