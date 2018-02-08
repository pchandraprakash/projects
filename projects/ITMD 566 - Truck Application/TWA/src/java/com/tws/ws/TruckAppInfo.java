/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tws.ws;
import com.tws.dao.TruckAppDAO;
import com.tws.model.TruckAppAttributes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author phani
 */
@WebService(serviceName = "TruckAppInfo")
public class TruckAppInfo 
{
    @WebMethod(operationName = "TruckAppInfo")
    public TruckAppAttributes CustomerAttributes(@WebParam(name = "TruckAppAttributes") String txt1, String txt2) throws Exception 
    {
        TruckAppDAO truckappdao = new TruckAppDAO();
        return truckappdao.getTruckAppInfo(txt1, txt2);
    }
}
