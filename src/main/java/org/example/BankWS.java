
package org.example;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8787/?wsdl")
public class BankWS
    extends Service
{

    private final static URL BANKWS_WSDL_LOCATION;
    private final static WebServiceException BANKWS_EXCEPTION;
    private final static QName BANKWS_QNAME = new QName("http://ws/", "BankWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8787/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKWS_WSDL_LOCATION = url;
        BANKWS_EXCEPTION = e;
    }

    public BankWS() {
        super(__getWsdlLocation(), BANKWS_QNAME);
    }

    public BankWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKWS_QNAME, features);
    }

    public BankWS(URL wsdlLocation) {
        super(wsdlLocation, BANKWS_QNAME);
    }

    public BankWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKWS_QNAME, features);
    }

    public BankWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class);
    }

    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKWS_EXCEPTION!= null) {
            throw BANKWS_EXCEPTION;
        }
        return BANKWS_WSDL_LOCATION;
    }

}
