/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.PricingDAO;
import com.truckapp.webservices.model.PricingAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "PricingInfo")
public class PricingInfo 
{
    @WebMethod(operationName = "getPrice")
    public PricingAttributes getPrice(@WebParam(name = "PricingAttributes") String txt) throws Exception 
    {
        PricingDAO pricedao = new PricingDAO();
        return pricedao.getPriceInfo(txt);
    }
}