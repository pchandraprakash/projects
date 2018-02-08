/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;
import com.truckapp.webservices.model.InvoiceAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author phani
 */
public class InvoiceDAO 
{
    Connector connect = new Connector();
	private Statement statement = null;
	private ResultSet getResultSet(String InvoiceID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from invoice where InvoiceID='"+InvoiceID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
        
        public InvoiceAttributes getInvoiceInfo(String InvoiceID) throws Exception
        {
            InvoiceAttributes InvoiceInfo = new InvoiceAttributes();

            ResultSet dataFromDatabase = getResultSet(InvoiceID);
            try{
                while(dataFromDatabase.next())
                {
                    InvoiceInfo.setInvoiceID(dataFromDatabase.getObject(1).toString());
                    InvoiceInfo.setInvoiceDate(dataFromDatabase.getObject(2).toString());
                    InvoiceInfo.setDueDate(dataFromDatabase.getObject(3).toString());
                    InvoiceInfo.setOrderID(dataFromDatabase.getObject(4).toString());
                    InvoiceInfo.setCustomerID(dataFromDatabase.getObject(5).toString());
                    InvoiceInfo.setOrderTotalAmount(dataFromDatabase.getObject(6).toString());
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
                return InvoiceInfo;
        } 
}
