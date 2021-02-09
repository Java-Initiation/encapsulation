package fr.banque;

import fr.banque.entites.Compte;
import fr.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(3000);
        comptes[1] = new CompteTaux(4000, 3.4);

        for (Compte compte : comptes)
            System.out.println(compte);

    }

}
