package edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.app;

import edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.entities.Account;
import edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.entities.BusinessaAccount;
import edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.entities.SavingsAccount;

public class Override {

    static void main() {

        Account acc1 = new Account(1001, "alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Alex", 1000.0, 10.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessaAccount(1003, "Bob", 1000.0, 0.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
