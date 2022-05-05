package fr.epita.datamodel;

public class InvestmentAccount extends Account{

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                '}';
    }
    public InvestmentAccount(double inititalBalance) {
        super(inititalBalance);
    }
}
