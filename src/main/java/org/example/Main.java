package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before using Converter, please choose the type of operation:");
        System.out.println("1. euro to dollar");
        System.out.println("2. euro to rouble");
        System.out.println("3. dollar to euro");
        System.out.println("4. dollar to rouble");
        System.out.println("5. rouble to euro");
        System.out.println("6. rouble to dollar");


        int choice = scanner.nextInt();
        System.out.println("You chose operation number " + choice);

        switch(choice) {
            case 1:
                System.out.println("Enter amount of euro you want to convert:");
                double etd = scanner.nextDouble();
                System.out.println("Your amount of dollars equals: " + etd * 1.1);
                break;
            case 2:
                System.out.println("Enter amount of euro you want to convert:");
                double etr = scanner.nextDouble();
                System.out.println("Your amount of roubles equals: " + etr * 105);
                break;
            case 3:
                System.out.println("Enter amount of dollar you want to convert:");
                double dte = scanner.nextDouble();
                System.out.println("Your amount of euro equals: " + dte * 0.9);
                break;
            case 4:
                System.out.println("Enter amount of dollar you want to convert:");
                double dtr = scanner.nextDouble();
                System.out.println("Your amount of roubles equals: " + dtr * 95);
                break;
            case 5:
                System.out.println("Enter amount of rouble you want to convert:");
                double rte = scanner.nextDouble();
                System.out.println("Your amount of euro equals: " + rte / 105);
                break;
            case 6:
                System.out.println("Enter amount of rouble you want to convert:");
                double rtd = scanner.nextDouble();
                System.out.println("Your amount of dollars equals: " + rtd / 95);
                break;
            default:
                System.out.println("There is no such operation");
                scanner.close();
        }
        // жопа
    }
}