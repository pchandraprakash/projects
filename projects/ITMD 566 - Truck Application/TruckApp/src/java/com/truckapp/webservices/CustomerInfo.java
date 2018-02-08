/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.CustomerDAO;
import com.truckapp.webservices.model.CustomerAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "CustomerInfo")
public class CustomerInfo 
{
    @WebMethod(operationName = "getCustomer")
    public CustomerAttributes getCustomer(@WebParam(name = "CustomerAttributes") String txt) throws Exception 
    {
        CustomerDAO custdao = new CustomerDAO();
        return custdao.getCustomerInfo(txt);
    }
}