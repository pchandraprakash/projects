/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;
import com.truckapp.webservices.model.OrdersAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author phani
 */
public class OrdersDAO 
{
    Connector connect = new Connector();
	private Statement statement = null;
	private ResultSet getResultSet(String OrderID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from orders where OrderID='"+OrderID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
        
        public OrdersAttributes getOrderInfo(String OrderID) throws Exception
        {
            OrdersAttributes OrdersInfo = new OrdersAttributes();

            ResultSet dataFromDatabase = getResultSet(OrderID);
            try{
                while(dataFromDatabase.next())
                {
                    OrdersInfo.setOrderID(dataFromDatabase.getObject(1).toString());
                    OrdersInfo.setOrderDate(dataFromDatabase.getObject(2).toString());
                    OrdersInfo.setCustomerID(dataFromDatabase.getObject(3).toString());
                    OrdersInfo.setEmployeeID(dataFromDatabase.getObject(4).toString());
                    OrdersInfo.setTruckNo(dataFromDatabase.getObject(5).toString());
                    OrdersInfo.setIsSpecial(dataFromDatabase.getObject(6).toString());
                    OrdersInfo.setPurchaseOrderNumber(dataFromDatabase.getObject(7).toString());
                    OrdersInfo.setOrderTotalAmount(dataFromDatabase.getObject(8).toString());
                    OrdersInfo.setTransactionID(dataFromDatabase.getObject(9).toString());
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
                return OrdersInfo;
        } 
}

