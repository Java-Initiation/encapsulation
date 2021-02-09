package fr.banque;

import fr.banque.entites.Credit;
import fr.banque.entites.Debit;
import fr.banque.entites.Operation;

public class TestOperation {

    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("12/12/2020", 400);
        operations[1] = new Credit("03/10/2020", 600);
        operations[2] = new Debit("20/08/2020", 400.88);
        operations[3] = new Debit("14/03/2019", 20.67);

        double montantTotal = 0.0;
        for (Operation operation : operations) {
            if (operation.getType().equals("CREDIT"))
                montantTotal += operation.getMontant();
            else
                montantTotal -= operation.getMontant();
            System.out.println(operation.getType() + " : " +
                    operation.getDate() + " " +
                    operation.getMontant());
        }
    }

}
