package com.makhchan;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        //System.out.println(proxy.conversionEuroToDH(800));
        Compte compte = proxy.getCompte(4);
        System.out.println("------------------------");
        System.out.println(compte.getCode() ) ;
        System.out.println(compte.getSolde() ) ;
        System.out.println(compte.getDate()) ;
        proxy.listCompte().forEach(cp->{
            System.out.println("------------------------");
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
            System.out.println(cp.getDate());

        });
    }
}