/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;
import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.TransactionDAO;
import com.truckapp.webservices.model.TransactionAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author phani
 */
@WebService(serviceName = "TransactionInfo")
public class TransactionInfo 
{
    @WebMethod(operationName = "getTransaction")
    public TransactionAttributes getTransaction(@WebParam(name = "TransactionAttributes") String txt) throws Exception 
    {
        TransactionDAO trnxdao = new TransactionDAO();
        return trnxdao.getTransactionInfo(txt);
    }
}
