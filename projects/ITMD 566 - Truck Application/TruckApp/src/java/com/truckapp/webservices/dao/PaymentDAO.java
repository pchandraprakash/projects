/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;
import com.truckapp.webservices.model.PaymentAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author phani
 */
public class PaymentDAO 
{
    Connector connect = new Connector();
	private Statement statement = null;
	private ResultSet getResultSet(String PaymentID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from payment where paymentID='"+PaymentID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
        
        public PaymentAttributes getPaymentInfo(String PaymentID) throws Exception
        {
            PaymentAttributes PaymentInfo = new PaymentAttributes();

            ResultSet dataFromDatabase = getResultSet(PaymentID);
            try{
                while(dataFromDatabase.next())
                {
                    PaymentInfo.setPaymentID(dataFromDatabase.getObject(1).toString());
                    PaymentInfo.setTransactionID(dataFromDatabase.getObject(2).toString());
                    PaymentInfo.setOrderID(dataFromDatabase.getObject(3).toString());
                    PaymentInfo.setPaymentMethod(dataFromDatabase.getObject(4).toString());
                    PaymentInfo.setPaymentAmount(dataFromDatabase.getObject(5).toString());
                    PaymentInfo.setPaymentDate(dataFromDatabase.getObject(6).toString());
                    PaymentInfo.setCheckNumber(dataFromDatabase.getObject(7).toString());
                    PaymentInfo.setCreditCard(dataFromDatabase.getObject(8).toString());
                    PaymentInfo.setCreditCardNumber(dataFromDatabase.getObject(9).toString());
                    PaymentInfo.setCardholdersName(dataFromDatabase.getObject(10).toString());
                    PaymentInfo.setCreditCardExpDate(dataFromDatabase.getObject(11).toString());
                    PaymentInfo.setCreditCardAuthorizationNumber(dataFromDatabase.getObject(12).toString());
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
                return PaymentInfo;
        } 
}
