/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;

import com.truckapp.webservices.model.TransactionAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author phani
 */
public class TransactionDAO 
{
    Connector connect = new Connector();
    private Statement statement = null;
    private ResultSet getResultSet(String TransactionID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from transaction where transactionid='"+TransactionID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
    
    public TransactionAttributes getTransactionInfo(String TransactionID) throws Exception
        {
            TransactionAttributes TransactionInfo = new TransactionAttributes();

            ResultSet dataFromDatabase = getResultSet(TransactionID);
            try{
                while(dataFromDatabase.next())
                {
                    TransactionInfo.setTransactionID(dataFromDatabase.getObject(1).toString());
                    TransactionInfo.setOrderID(dataFromDatabase.getObject(2).toString());
                    TransactionInfo.setPriceID(dataFromDatabase.getObject(3).toString());
                    TransactionInfo.setTranxDate(dataFromDatabase.getObject(4).toString());
                    TransactionInfo.setTranxDesc(dataFromDatabase.getObject(5).toString());
                    TransactionInfo.setTranxAmt(dataFromDatabase.getObject(6).toString());
                    TransactionInfo.setMake(dataFromDatabase.getObject(7).toString());
                    TransactionInfo.setModel(dataFromDatabase.getObject(8).toString());
                    TransactionInfo.setYear(dataFromDatabase.getObject(9).toString());
                    TransactionInfo.setEmployeeID(dataFromDatabase.getObject(10).toString());
                    TransactionInfo.setTruckNo(dataFromDatabase.getObject(11).toString());
                    TransactionInfo.setDiscount(dataFromDatabase.getObject(12).toString());
                    TransactionInfo.setQuantity(dataFromDatabase.getObject(13).toString());
                    TransactionInfo.setUnitPrice(dataFromDatabase.getObject(14).toString());
                    TransactionInfo.setDriverPrice(dataFromDatabase.getObject(15).toString());
                    TransactionInfo.setVIN(dataFromDatabase.getObject(16).toString());
                    TransactionInfo.setRunNumber(dataFromDatabase.getObject(17).toString());
                    TransactionInfo.setSpecial(dataFromDatabase.getObject(18).toString());
                    TransactionInfo.setRate(dataFromDatabase.getObject(19).toString());
                    TransactionInfo.setSurcharge(dataFromDatabase.getObject(20).toString());
                    TransactionInfo.setTx_priceID(dataFromDatabase.getObject(21).toString());
                    TransactionInfo.setAmount(dataFromDatabase.getObject(22).toString());
                    TransactionInfo.setQty(dataFromDatabase.getObject(23).toString());
                    TransactionInfo.setDescription(dataFromDatabase.getObject(24).toString());
                    TransactionInfo.setTx_date(dataFromDatabase.getObject(25).toString());
                    TransactionInfo.setTx_car_make(dataFromDatabase.getObject(26).toString());
                    TransactionInfo.setTx_car_model(dataFromDatabase.getObject(27).toString());
                    TransactionInfo.setTx_car_year(dataFromDatabase.getObject(28).toString());
                    TransactionInfo.setTx_car_VIN(dataFromDatabase.getObject(29).toString());
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
                return TransactionInfo;
        }
}
