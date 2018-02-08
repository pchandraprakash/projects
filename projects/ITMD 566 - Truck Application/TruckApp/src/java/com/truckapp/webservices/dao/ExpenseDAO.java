/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.dao;

import com.truckapp.webservices.model.ExpenseAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author phani
 */
public class ExpenseDAO
{
    Connector connect = new Connector();
    private Statement statement = null;
    private ResultSet getResultSet(String ExpenseID) throws Exception
	{	
		ResultSet rs = null;
		try
		{
			statement = connect.getConnection().createStatement();
			String sql = "select * from expense where expenseid='"+ExpenseID+"';";
			rs = statement.executeQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rs;
	}
    
    public ExpenseAttributes getExpenseInfo(String ExpenseID) throws Exception
        {
            ExpenseAttributes ExpenseInfo = new ExpenseAttributes();

            ResultSet dataFromDatabase = getResultSet(ExpenseID);
            try{
                while(dataFromDatabase.next())
                {
                    ExpenseInfo.setExpenseID(dataFromDatabase.getObject(1).toString());
                    ExpenseInfo.setEmployeeID(dataFromDatabase.getObject(2).toString());
                    ExpenseInfo.setExpenseType(dataFromDatabase.getObject(3).toString());
                    ExpenseInfo.setPurposeofExpense(dataFromDatabase.getObject(4).toString());
                    ExpenseInfo.setAmountSpent(dataFromDatabase.getObject(5).toString());
                    ExpenseInfo.setDescription(dataFromDatabase.getObject(6).toString());
                    ExpenseInfo.setDatePurchased(dataFromDatabase.getObject(7).toString());
                    ExpenseInfo.setDateSubmitted(dataFromDatabase.getObject(8).toString());
                    ExpenseInfo.setAdvanceAmount(dataFromDatabase.getObject(9).toString());
                    ExpenseInfo.setPaymentMethod(dataFromDatabase.getObject(10).toString());
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
                return ExpenseInfo;
        } 
}
