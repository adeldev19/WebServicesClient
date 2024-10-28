
package org.example;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.util.List<org.example.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws/", className = "org.example.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws/", className = "org.example.ListComptesResponse")
    @Action(input = "http://ws/BanqueService/listComptesRequest", output = "http://ws/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns org.example.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "org.example.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "org.example.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDZ")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDZ", targetNamespace = "http://ws/", className = "org.example.ConversionEuroToDZ")
    @ResponseWrapper(localName = "ConversionEuroToDZResponse", targetNamespace = "http://ws/", className = "org.example.ConversionEuroToDZResponse")
    @Action(input = "http://ws/BanqueService/ConversionEuroToDZRequest", output = "http://ws/BanqueService/ConversionEuroToDZResponse")
    public double conversionEuroToDZ(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
