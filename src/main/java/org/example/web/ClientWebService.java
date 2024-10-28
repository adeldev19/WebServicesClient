package org.example.web;

import org.example.BankWS;
import org.example.BanqueService;
import org.example.Compte;

import java.util.List;

public class ClientWebService {
    public static void main(String[] args) {
        BanqueService proxy = new BankWS().getBanqueServicePort();

        System.out.println(proxy.conversionEuroToDZ(15));

        Compte compte = proxy.getCompte(5);
        List<Compte> listComptes = proxy.listComptes();
        for (Compte c : listComptes) {
            System.out.println("________________________________________");
            System.out.println("Code  =  :" + compte.getCode());
            System.out.println("Solde  =  :" + compte.getSolde());
            System.out.println("Date Creation =  :" + compte.getDateDeCreation());
        }
    }
}