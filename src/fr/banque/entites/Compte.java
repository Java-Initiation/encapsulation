package fr.banque.entites;

public class Compte {

    private static int ct = 1;
    private int numeroCompte;
    private double solde;

    public Compte(double solde) {
        this.numeroCompte = ct++;
        this.solde = solde;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

}
