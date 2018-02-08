/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices;

import com.truckapp.webservices.dao.CustomerDAO;
import com.truckapp.webservices.dao.EmployeeDAO;
import com.truckapp.webservices.dao.ExpenseDAO;
import com.truckapp.webservices.dao.InvoiceDAO;
import com.truckapp.webservices.dao.LocationDAO;
import com.truckapp.webservices.dao.OrdersDAO;
import com.truckapp.webservices.dao.PaymentDAO;
import com.truckapp.webservices.dao.PricingDAO;
import com.truckapp.webservices.dao.TransactionDAO;
import com.truckapp.webservices.dao.TruckDAO;
import com.truckapp.webservices.model.CustomerAttributes;
import com.truckapp.webservices.model.EmployeeAttributes;
import com.truckapp.webservices.model.ExpenseAttributes;
import com.truckapp.webservices.model.InvoiceAttributes;
import com.truckapp.webservices.model.LocationAttributes;
import com.truckapp.webservices.model.OrdersAttributes;
import com.truckapp.webservices.model.PaymentAttributes;
import com.truckapp.webservices.model.PricingAttributes;
import com.truckapp.webservices.model.TransactionAttributes;
import com.truckapp.webservices.model.TruckAttributes;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author phani
 */
@WebService(serviceName = "TruckAppWebServices")
public class TruckAppWebServices 
{
    @WebMethod(operationName = "EmployeeInfo")
    public EmployeeAttributes EmployeeAttributes(@WebParam(name = "EmployeeAttributes") String txt) throws Exception 
    {
        EmployeeDAO empdao = new EmployeeDAO();
        return empdao.getEmployeeInfo(txt);
    }
    
    @WebMethod(operationName = "CustomerInfo")
    public CustomerAttributes CustomerAttributes(@WebParam(name = "CustomerAttributes") String txt) throws Exception 
    {
        CustomerDAO custdao = new CustomerDAO();
        return custdao.getCustomerInfo(txt);
    }
    
    @WebMethod(operationName = "LocationInfo")
    public LocationAttributes LocationAttributes(@WebParam(name = "LocationAttributes") String txt) throws Exception 
    {
        LocationDAO locationdao = new LocationDAO();
        return locationdao.getLocationInfo(txt);
    }
    
    @WebMethod(operationName = "OrdersInfo")
    public OrdersAttributes OrdersAttributes(@WebParam(name = "OrdersAttributes") String txt) throws Exception 
    {
        OrdersDAO orderdao = new OrdersDAO();
        return orderdao.getOrderInfo(txt);
    }
    
    @WebMethod(operationName = "PaymentInfo")
    public PaymentAttributes PaymentAttributes(@WebParam(name = "PaymentAttributes") String txt) throws Exception 
    {
        PaymentDAO paydao = new PaymentDAO();
        return paydao.getPaymentInfo(txt);
    }
    
    @WebMethod(operationName = "PricingInfo")
    public PricingAttributes PricingAttributes(@WebParam(name = "PricingAttributes") String txt) throws Exception 
    {
        PricingDAO pricedao = new PricingDAO();
        return pricedao.getPriceInfo(txt);
    }
    
    @WebMethod(operationName = "TransactionInfo")
    public TransactionAttributes TransactionAttributes(@WebParam(name = "TransactionAttributes") String txt) throws Exception 
    {
        TransactionDAO trnxdao = new TransactionDAO();
        return trnxdao.getTransactionInfo(txt);
    }
    
    @WebMethod(operationName = "TruckInfo")
    public TruckAttributes TruckAttributes1(@WebParam(name = "TruckAttributes") String txt) throws Exception 
    {
        TruckDAO truckdao1 = new TruckDAO();
        return truckdao1.getTruckInfo(txt);
    }
    
    @WebMethod(operationName = "ExpenseInfo")
    public ExpenseAttributes ExpenseAttributes(@WebParam(name = "ExpenseAttributes") String txt) throws Exception 
    {
        ExpenseDAO expensedao = new ExpenseDAO();
        return expensedao.getExpenseInfo(txt);
    }
    
    @WebMethod(operationName = "InvoiceInfo")
    public InvoiceAttributes InvoiceAttributes(@WebParam(name = "InvoiceAttributes") String txt) throws Exception 
    {
        InvoiceDAO invoicedao = new InvoiceDAO();
        return invoicedao.getInvoiceInfo(txt);
    }
}
