package fr.epita.datamodel;

public class SavingsAccount extends Account{


    protected double interestRate;

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    public SavingsAccount(double inititalBalance) {
        super(inititalBalance);
    }

    public double computeInterest(){
        return this.interestRate*balance;

    }

    public void withDraw(double amount){
        this.balance-=amount;


    }

}

