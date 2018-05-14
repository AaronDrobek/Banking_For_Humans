package com.manheim.apprenticeship.utils;


public class Menu {


    public static void printMainMenu() {
        System.out.println("-------WELCOME--------------------------");
        System.out.println("--------------TO------------------------");
        System.out.println("----------------COX--BANKING---SYSTEM---");
        System.out.println("1- Register a person");
        System.out.println("2- Login");
        System.out.println("3- Exit");
        System.out.println("----------------------------------------");

    }

    public static void printRegistartionMenu() {
        System.out.println("1-Register a Kid");
        System.out.println("2-Register an Adult");
        System.out.println("3-Back to Main");

    }

    public static void printLoginMenu() {
        System.out.println("1-Login a Kid");
        System.out.println("2-Login an Adult");
        System.out.println("3-Back to Main");
    }


    public static void printKidMenu() {
        System.out.println("1-MowGrass");
        System.out.println("2-Check account balance");
        System.out.println("3-Withdraw");

    }

    public static void printAdultMenu() {
        System.out.println("1-Work");
        System.out.println("2-Check account balance");
        System.out.println("3-Withdraw");
    }

    public static void printAdultWithdrawMenu() {
        System.out.println("1-Withdraw $40");
        System.out.println("2-Withdraw $60");
        System.out.println("3-Withdraw $100");
    }
    public static void printKidWithdrawMenu(){
        System.out.println("1-Withdraw $1.00");
        System.out.println("2-Withdraw $2.50");
        System.out.println("3-Withdraw $5.00");
    }

}
