package fr.epita.launchers;

import fr.epita.datamodel.Customer;
import fr.epita.datamodel.InvestmentAccount;
import fr.epita.datamodel.SavingsAccount;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Customer Shoab = new Customer("Shoab", "Paris");
        Customer Shoababc = new Customer("Shoababc", "Bangalore");

        System.out.println(Shoab);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name");
        String line = scanner.nextLine();
        System.out.println("Name: " + line);

        SavingsAccount account = new SavingsAccount(123);
        InvestmentAccount investAccount = new InvestmentAccount(234);


    }
}