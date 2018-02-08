/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.Connector;
import com.truckapp.webservices.dao.EmployeeDAO;
import com.truckapp.webservices.model.EmployeeAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "EmployeeInfo")
public class EmployeeInfo 
{
    @WebMethod(operationName = "getEmployee")
    public EmployeeAttributes getEmployee(@WebParam(name = "EmployeeAttributes") String txt) throws Exception 
    {
        EmployeeDAO empdao = new EmployeeDAO();
        return empdao.getEmployeeInfo(txt);
    }
}