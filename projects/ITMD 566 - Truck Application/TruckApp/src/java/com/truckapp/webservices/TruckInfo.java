/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;
import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.TruckDAO;
import com.truckapp.webservices.model.TruckAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "TruckInfo")
public class TruckInfo
{
    @WebMethod(operationName = "getTruck")
    public TruckAttributes getTruck(@WebParam(name = "TruckAttributes") String txt) throws Exception 
    {
        TruckDAO truckdao1 = new TruckDAO();
        return truckdao1.getTruckInfo(txt);
    }
}

