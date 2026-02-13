package bankKonto;

import java.util.Scanner;

public class Main {
    void main(){
        accountName = "Gabby";
        //deposit100();

        // udfordring:
        Scanner sc = new Scanner(System.in);

        System.out.println("How much do you want to deposit? ");
        double money = sc.nextDouble();
        deposit(money);
        System.out.println(money + " deposited to " + accountName +"'s account.");

        System.out.println("How much do you want to withdraw? ");
        double moneyWithdraw = sc.nextDouble();
        withdraw(moneyWithdraw);
        System.out.println("Money withdrawn: "+ moneyWithdraw);

        printBalance();


    }

    double balance;
    String accountName;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }

    void printBalance(){
        System.out.println("Konto name: " + accountName + "\nAccount balance: "+ balance);
    }





}
