/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.InvoiceDAO;
import com.truckapp.webservices.model.InvoiceAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "InvoiceInfo")
public class InvoiceInfo 
{
    @WebMethod(operationName = "getInvoice")
    public InvoiceAttributes getInvoice(@WebParam(name = "InvoiceAttributes") String txt) throws Exception 
    {
        InvoiceDAO invoicedao = new InvoiceDAO();
        return invoicedao.getInvoiceInfo(txt);
    }
}