/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.OrdersDAO;
import com.truckapp.webservices.model.OrdersAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "OrdersInfo")
public class OrdersInfo 
{
    @WebMethod(operationName = "getOrder")
    public OrdersAttributes getOrder(@WebParam(name = "OrdersAttributes") String txt) throws Exception 
    {
        OrdersDAO orderdao = new OrdersDAO();
        return orderdao.getOrderInfo(txt);
    }
}