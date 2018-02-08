
package com.truckapp.webservices.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.truckapp.webservices.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomerInfo_QNAME = new QName("http://webservices.truckapp.com/", "CustomerInfo");
    private final static QName _CustomerInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "CustomerInfoResponse");
    private final static QName _EmployeeInfo_QNAME = new QName("http://webservices.truckapp.com/", "EmployeeInfo");
    private final static QName _EmployeeInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "EmployeeInfoResponse");
    private final static QName _Exception_QNAME = new QName("http://webservices.truckapp.com/", "Exception");
    private final static QName _ExpenseInfo_QNAME = new QName("http://webservices.truckapp.com/", "ExpenseInfo");
    private final static QName _ExpenseInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "ExpenseInfoResponse");
    private final static QName _InvoiceInfo_QNAME = new QName("http://webservices.truckapp.com/", "InvoiceInfo");
    private final static QName _InvoiceInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "InvoiceInfoResponse");
    private final static QName _LocationInfo_QNAME = new QName("http://webservices.truckapp.com/", "LocationInfo");
    private final static QName _LocationInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "LocationInfoResponse");
    private final static QName _OrdersInfo_QNAME = new QName("http://webservices.truckapp.com/", "OrdersInfo");
    private final static QName _OrdersInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "OrdersInfoResponse");
    private final static QName _PaymentInfo_QNAME = new QName("http://webservices.truckapp.com/", "PaymentInfo");
    private final static QName _PaymentInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "PaymentInfoResponse");
    private final static QName _PricingInfo_QNAME = new QName("http://webservices.truckapp.com/", "PricingInfo");
    private final static QName _PricingInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "PricingInfoResponse");
    private final static QName _TransactionInfo_QNAME = new QName("http://webservices.truckapp.com/", "TransactionInfo");
    private final static QName _TransactionInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "TransactionInfoResponse");
    private final static QName _TruckInfo_QNAME = new QName("http://webservices.truckapp.com/", "TruckInfo");
    private final static QName _TruckInfoResponse_QNAME = new QName("http://webservices.truckapp.com/", "TruckInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.truckapp.webservices.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link CustomerInfoResponse }
     * 
     */
    public CustomerInfoResponse createCustomerInfoResponse() {
        return new CustomerInfoResponse();
    }

    /**
     * Create an instance of {@link EmployeeInfo }
     * 
     */
    public EmployeeInfo createEmployeeInfo() {
        return new EmployeeInfo();
    }

    /**
     * Create an instance of {@link EmployeeInfoResponse }
     * 
     */
    public EmployeeInfoResponse createEmployeeInfoResponse() {
        return new EmployeeInfoResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ExpenseInfo }
     * 
     */
    public ExpenseInfo createExpenseInfo() {
        return new ExpenseInfo();
    }

    /**
     * Create an instance of {@link ExpenseInfoResponse }
     * 
     */
    public ExpenseInfoResponse createExpenseInfoResponse() {
        return new ExpenseInfoResponse();
    }

    /**
     * Create an instance of {@link InvoiceInfo }
     * 
     */
    public InvoiceInfo createInvoiceInfo() {
        return new InvoiceInfo();
    }

    /**
     * Create an instance of {@link InvoiceInfoResponse }
     * 
     */
    public InvoiceInfoResponse createInvoiceInfoResponse() {
        return new InvoiceInfoResponse();
    }

    /**
     * Create an instance of {@link LocationInfo }
     * 
     */
    public LocationInfo createLocationInfo() {
        return new LocationInfo();
    }

    /**
     * Create an instance of {@link LocationInfoResponse }
     * 
     */
    public LocationInfoResponse createLocationInfoResponse() {
        return new LocationInfoResponse();
    }

    /**
     * Create an instance of {@link OrdersInfo }
     * 
     */
    public OrdersInfo createOrdersInfo() {
        return new OrdersInfo();
    }

    /**
     * Create an instance of {@link OrdersInfoResponse }
     * 
     */
    public OrdersInfoResponse createOrdersInfoResponse() {
        return new OrdersInfoResponse();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link PaymentInfoResponse }
     * 
     */
    public PaymentInfoResponse createPaymentInfoResponse() {
        return new PaymentInfoResponse();
    }

    /**
     * Create an instance of {@link PricingInfo }
     * 
     */
    public PricingInfo createPricingInfo() {
        return new PricingInfo();
    }

    /**
     * Create an instance of {@link PricingInfoResponse }
     * 
     */
    public PricingInfoResponse createPricingInfoResponse() {
        return new PricingInfoResponse();
    }

    /**
     * Create an instance of {@link TransactionInfo }
     * 
     */
    public TransactionInfo createTransactionInfo() {
        return new TransactionInfo();
    }

    /**
     * Create an instance of {@link TransactionInfoResponse }
     * 
     */
    public TransactionInfoResponse createTransactionInfoResponse() {
        return new TransactionInfoResponse();
    }

    /**
     * Create an instance of {@link TruckInfo }
     * 
     */
    public TruckInfo createTruckInfo() {
        return new TruckInfo();
    }

    /**
     * Create an instance of {@link TruckInfoResponse }
     * 
     */
    public TruckInfoResponse createTruckInfoResponse() {
        return new TruckInfoResponse();
    }

    /**
     * Create an instance of {@link Pricing }
     * 
     */
    public Pricing createPricing() {
        return new Pricing();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Expense }
     * 
     */
    public Expense createExpense() {
        return new Expense();
    }

    /**
     * Create an instance of {@link Truck }
     * 
     */
    public Truck createTruck() {
        return new Truck();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "CustomerInfo")
    public JAXBElement<CustomerInfo> createCustomerInfo(CustomerInfo value) {
        return new JAXBElement<CustomerInfo>(_CustomerInfo_QNAME, CustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "CustomerInfoResponse")
    public JAXBElement<CustomerInfoResponse> createCustomerInfoResponse(CustomerInfoResponse value) {
        return new JAXBElement<CustomerInfoResponse>(_CustomerInfoResponse_QNAME, CustomerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "EmployeeInfo")
    public JAXBElement<EmployeeInfo> createEmployeeInfo(EmployeeInfo value) {
        return new JAXBElement<EmployeeInfo>(_EmployeeInfo_QNAME, EmployeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "EmployeeInfoResponse")
    public JAXBElement<EmployeeInfoResponse> createEmployeeInfoResponse(EmployeeInfoResponse value) {
        return new JAXBElement<EmployeeInfoResponse>(_EmployeeInfoResponse_QNAME, EmployeeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpenseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "ExpenseInfo")
    public JAXBElement<ExpenseInfo> createExpenseInfo(ExpenseInfo value) {
        return new JAXBElement<ExpenseInfo>(_ExpenseInfo_QNAME, ExpenseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpenseInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "ExpenseInfoResponse")
    public JAXBElement<ExpenseInfoResponse> createExpenseInfoResponse(ExpenseInfoResponse value) {
        return new JAXBElement<ExpenseInfoResponse>(_ExpenseInfoResponse_QNAME, ExpenseInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "InvoiceInfo")
    public JAXBElement<InvoiceInfo> createInvoiceInfo(InvoiceInfo value) {
        return new JAXBElement<InvoiceInfo>(_InvoiceInfo_QNAME, InvoiceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "InvoiceInfoResponse")
    public JAXBElement<InvoiceInfoResponse> createInvoiceInfoResponse(InvoiceInfoResponse value) {
        return new JAXBElement<InvoiceInfoResponse>(_InvoiceInfoResponse_QNAME, InvoiceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "LocationInfo")
    public JAXBElement<LocationInfo> createLocationInfo(LocationInfo value) {
        return new JAXBElement<LocationInfo>(_LocationInfo_QNAME, LocationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "LocationInfoResponse")
    public JAXBElement<LocationInfoResponse> createLocationInfoResponse(LocationInfoResponse value) {
        return new JAXBElement<LocationInfoResponse>(_LocationInfoResponse_QNAME, LocationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdersInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "OrdersInfo")
    public JAXBElement<OrdersInfo> createOrdersInfo(OrdersInfo value) {
        return new JAXBElement<OrdersInfo>(_OrdersInfo_QNAME, OrdersInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdersInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "OrdersInfoResponse")
    public JAXBElement<OrdersInfoResponse> createOrdersInfoResponse(OrdersInfoResponse value) {
        return new JAXBElement<OrdersInfoResponse>(_OrdersInfoResponse_QNAME, OrdersInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "PaymentInfo")
    public JAXBElement<PaymentInfo> createPaymentInfo(PaymentInfo value) {
        return new JAXBElement<PaymentInfo>(_PaymentInfo_QNAME, PaymentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "PaymentInfoResponse")
    public JAXBElement<PaymentInfoResponse> createPaymentInfoResponse(PaymentInfoResponse value) {
        return new JAXBElement<PaymentInfoResponse>(_PaymentInfoResponse_QNAME, PaymentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "PricingInfo")
    public JAXBElement<PricingInfo> createPricingInfo(PricingInfo value) {
        return new JAXBElement<PricingInfo>(_PricingInfo_QNAME, PricingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "PricingInfoResponse")
    public JAXBElement<PricingInfoResponse> createPricingInfoResponse(PricingInfoResponse value) {
        return new JAXBElement<PricingInfoResponse>(_PricingInfoResponse_QNAME, PricingInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "TransactionInfo")
    public JAXBElement<TransactionInfo> createTransactionInfo(TransactionInfo value) {
        return new JAXBElement<TransactionInfo>(_TransactionInfo_QNAME, TransactionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "TransactionInfoResponse")
    public JAXBElement<TransactionInfoResponse> createTransactionInfoResponse(TransactionInfoResponse value) {
        return new JAXBElement<TransactionInfoResponse>(_TransactionInfoResponse_QNAME, TransactionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TruckInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "TruckInfo")
    public JAXBElement<TruckInfo> createTruckInfo(TruckInfo value) {
        return new JAXBElement<TruckInfo>(_TruckInfo_QNAME, TruckInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TruckInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.truckapp.com/", name = "TruckInfoResponse")
    public JAXBElement<TruckInfoResponse> createTruckInfoResponse(TruckInfoResponse value) {
        return new JAXBElement<TruckInfoResponse>(_TruckInfoResponse_QNAME, TruckInfoResponse.class, null, value);
    }

}
