/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.ExpenseDAO;
import com.truckapp.webservices.model.ExpenseAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "ExpenseInfo")
public class ExpenseInfo 
{
    @WebMethod(operationName = "getExpense")
    public ExpenseAttributes getExpense(@WebParam(name = "ExpenseAttributes") String txt) throws Exception 
    {
        ExpenseDAO expensedao = new ExpenseDAO();
        return expensedao.getExpenseInfo(txt);
    }
}