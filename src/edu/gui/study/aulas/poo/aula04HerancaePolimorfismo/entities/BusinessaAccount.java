package edu.gui.study.aulas.poo.aula04HerancaePolimorfismo.entities;

public class BusinessaAccount extends  Account{

    private double loanLimit;

    public BusinessaAccount() {
        super();
    }

    public BusinessaAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount;
        }
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
