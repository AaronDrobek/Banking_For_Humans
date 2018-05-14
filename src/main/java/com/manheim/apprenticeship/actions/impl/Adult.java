package com.manheim.apprenticeship.actions.impl;

import com.manheim.apprenticeship.Human;
import com.manheim.apprenticeship.actions.IAdultActions;
import com.manheim.apprenticeship.actions.IBankActions;

public class Adult extends Human implements IAdultActions, IBankActions {

    private double accountBalance = 0;

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void work() {

        double dailyWage = 100;
        double workPay;
        double tax = .225;



        workPay = dailyWage - (dailyWage * tax);
        System.out.println(String.format("You worked for 8 hours and earned $100, after tax your net wage is: $%.2f", workPay));
        accountBalance += workPay;

    }

    @Override
    public double checkBalance() {
        System.out.println(String.format("Your account balance is: $%.2f", accountBalance));
        return accountBalance;
    }

    @Override
    public void withdraw(int withdrawSelection) {
        switch (withdrawSelection) {
            case 1:
                if(accountBalance>=40) {
                    accountBalance -= 40;
                    System.out.println(String.format("-$40 your new ballance is $%.2f", accountBalance));
                }else{
                    System.out.println("Insufficient Funds");
                    System.out.println();
                    System.out.println(String.format("Your ballance is $%.2f", accountBalance));
                    System.out.println();
                    }
                break;
            case 2:

                if(accountBalance>=60) {
                    accountBalance -= 60;
                    System.out.println(String.format("-$60 your new ballance is $%.2f", accountBalance));
                }else{
                    System.out.println("Insufficient Funds");
                    System.out.println();
                    System.out.println(String.format("Your ballance is $%.2f", accountBalance));
                    System.out.println();
                    }
                break;
            case 3:

                if(accountBalance>=100) {
                    accountBalance -= 100;
                    System.out.println(String.format("-$100 your new ballance is $%.2f", accountBalance));
                }else{
                    System.out.println("Insufficient Funds");
                    System.out.println();
                    System.out.println(String.format("Your ballance is $%.2f", accountBalance));
                    System.out.println();
                    }
                break;
        }


    }
}
