package fr.banque;

import fr.banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {

        Compte compte1 = new Compte(2000);
        Compte compte2 = new Compte(1000);
        Compte compte3 = new Compte(5000);
        Compte compte4 = new Compte(8000);

        System.out.println(compte1.getNumeroCompte());
        System.out.println(compte2.getNumeroCompte());
        System.out.println(compte3.getNumeroCompte());
        System.out.println(compte4.getNumeroCompte());
    }

}
