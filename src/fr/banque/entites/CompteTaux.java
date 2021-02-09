package fr.banque.entites;

public class CompteTaux extends Compte {

    private double taux;

    public CompteTaux(double solde, double taux) {
        super(solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                super.toString() +
                "taux=" + taux +
                '}';
    }

}
