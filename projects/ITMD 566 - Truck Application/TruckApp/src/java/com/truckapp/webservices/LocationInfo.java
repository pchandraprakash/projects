/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.LocationDAO;
import com.truckapp.webservices.model.LocationAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "LocationInfo")
public class LocationInfo 
{
    @WebMethod(operationName = "getLocation")
    public LocationAttributes getLocation(@WebParam(name = "LocationAttributes") String txt) throws Exception 
    {
        LocationDAO locationdao = new LocationDAO();
        return locationdao.getLocationInfo(txt);
    }
}