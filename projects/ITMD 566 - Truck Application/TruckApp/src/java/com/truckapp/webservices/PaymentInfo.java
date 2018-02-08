/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;
import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.PaymentDAO;
import com.truckapp.webservices.model.PaymentAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "PaymentInfo")
public class PaymentInfo 
{
    @WebMethod(operationName = "getPayment")
    public PaymentAttributes getPayment(@WebParam(name = "PaymentAttributes") String txt) throws Exception 
    {
        PaymentDAO paydao = new PaymentDAO();
        return paydao.getPaymentInfo(txt);
    }
}