package com.manheim.apprenticeship;

import com.manheim.apprenticeship.actions.impl.Adult;
import com.manheim.apprenticeship.actions.impl.Kid;
import com.manheim.apprenticeship.utils.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner reader = new Scanner(System.in);
    private static ArrayList<Kid> kidObj = new ArrayList<>();
    private static ArrayList<Adult> adultObj = new ArrayList<>();

    public static void main(String[] args) {

        int mainMenuSelection;

        do {
            Menu.printMainMenu();
            mainMenuSelection = reader.nextInt();
            switch (mainMenuSelection) {
                case 1:
                    int secondMenuSelection = 0;
                    do {
                        Menu.printRegistartionMenu();
                        secondMenuSelection = reader.nextInt();

                        registerHuman(secondMenuSelection);
                    } while (secondMenuSelection >= 1 && secondMenuSelection <= 2);
                    break;
                case 2:
                    int loginMenuSelection = 0;
                    do {
                        Menu.printLoginMenu();
                        loginMenuSelection = reader.nextInt();

                        loginHuman(loginMenuSelection);
                    } while (loginMenuSelection >= 1 && loginMenuSelection <= 2);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (mainMenuSelection <= 2 && mainMenuSelection > 0);

    }


    private static void registerHuman(int secondMenuSelection) {
        switch (secondMenuSelection) {
            case 1:
                registerKid();
                break;
            case 2:
                registerAdult();
                break;
        }

    }

    private static void loginHuman(int loginMenuSelection) {

        switch (loginMenuSelection) {
            case 1:
                loginKid();
                break;
            case 2:
                loginAdult();
                break;
        }
    }


    private static void loginKid() {


        System.out.println("User Name: ");
        String nameInput = reader.next();
        if (kidObj.size() > 0) {
            for (Kid singleKid : kidObj) {
                if (nameInput.equals(singleKid.getName())) {
                    System.out.println();
                    System.out.println(singleKid.getName() + " Has Logged in successfully ");
                    System.out.println();
                    transactions(singleKid);
                } else {
                    System.out.println();
                    System.out.println("User not registered: ");
                    System.out.println();
                    System.out.println();
                }
            }
        } else {
            System.out.println();
            System.out.println("User not registered: ");
            System.out.println();
            System.out.println();
        }


    }

    private static void loginAdult() {

        System.out.println("User Name: ");
        String nameInput = reader.next();
        if (adultObj.size() > 0) {
            for (Adult singleAdult : adultObj) {
                if (nameInput.equals(singleAdult.getName())) {
                    System.out.println();
                    System.out.println(singleAdult.getName() + " Has Logged in successfully ");
                    System.out.println();
                    transactions(singleAdult);

                } else if (!nameInput.equals(singleAdult.getName())) {
                    System.out.println();
                    System.out.println("User not registered: ");
                    System.out.println();
                    System.out.println();
                }

            }
        } else {
            System.out.println();
            System.out.println("User not registered: ");
            System.out.println();
            System.out.println();
        }
    }

    private static void registerAdult() {
        String answer = "";
        do {
            System.out.println("Enter the name of the adult");
            String adultName = reader.next();
            System.out.println("Enter adult's age:");
            int adultAge = reader.nextInt();
            reader.nextLine();
            Adult adult = new Adult(adultName, adultAge);
            adultObj.add(adult);
            System.out.println("Register another Adult: Y/N ?");
            answer = reader.nextLine();
        }
        while (answer.equals("y") || answer.equals("Y"));

    }


    private static void registerKid() {
        String answer = "";
        do {
            System.out.println("Enter the name of the kid:");
            String kidName = reader.next();
            System.out.println("Enter kid's age:");
            int kidAge = reader.nextInt();
            reader.nextLine();
            Kid kid = new Kid(kidName, kidAge);
            kidObj.add(kid);
            System.out.println("Register another Kid: Y/N ?");
            answer = reader.nextLine();
        } while (answer.equals("y") || answer.equals("Y"));
    }

    private static void transactions(Kid singleKid) {

        Menu.printKidMenu();
        int actionSelection = reader.nextInt();
        switch (actionSelection) {
            case 1:
                singleKid.mow();
                break;
            case 2:
                singleKid.checkBalance();
                break;
            case 3:
                Menu.printKidWithdrawMenu();
                int withdrawSelection = reader.nextInt();
                singleKid.withdraw(withdrawSelection);
                break;
        }

    }

    private static void transactions(Adult singleAdult) {
        Menu.printAdultMenu();
        int actionSelection = reader.nextInt();
        switch (actionSelection) {
            case 1:
                singleAdult.work();
                break;
            case 2:
                singleAdult.checkBalance();
                break;
            case 3:
                Menu.printAdultWithdrawMenu();
                int withdrawKidSelection = reader.nextInt();
                singleAdult.withdraw(withdrawKidSelection);
                break;
        }

    }
}


