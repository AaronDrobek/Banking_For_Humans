package com.manheim.apprenticeship.actions.impl;


import com.manheim.apprenticeship.Human;
import com.manheim.apprenticeship.actions.IBankActions;
import com.manheim.apprenticeship.actions.IKidActions;

public class Kid extends Human implements IKidActions, IBankActions {
   private static double kidAccountBalance = 0;



    public Kid(String name, int age) {
        this.name = name;
        this.age = age;


    }


    @Override
    public void mow() {
        kidAccountBalance += 1d;
        System.out.println("You mowed a lawn you for $1.00");
    }



    @Override
    public double checkBalance() {
        System.out.println(String.format("Your account balance is: $%.2f", kidAccountBalance));
        return kidAccountBalance;
    }


    @Override
    public void withdraw(int withdrawKidSelection) {
        switch (withdrawKidSelection) {
            case 1:
                if (kidAccountBalance >= 1){
                kidAccountBalance -= 1;}
                else{
                    System.out.println("**** Error **** Insufficient Funds ******");
                }
                break;
            case 2:
                kidAccountBalance -= 2.50;
                break;
            case 3:
                kidAccountBalance -= 5;
                break;
        }


    }
}
