package edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.app;

import edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.entities.Account;
import edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.entities.BusinessaAccount;
import edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.entities.SavingsAccount;

public class Program {

    static void main() {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessaAccount bacc = new BusinessaAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessaAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessaAccount acc4 = (BusinessaAccount) acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessaAccount) {
            BusinessaAccount acc5 = (BusinessaAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
