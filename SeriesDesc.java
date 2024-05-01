package com.mycompany.circuitsfordummies;

import java.util.Scanner;

public class SeriesDesc {
    Scanner scanner = new Scanner(System.in);
    
    public void seriesDescChoice(){
        int choice = 0;
        
        while (choice != 5){
            System.out.println("\nCircuit design for Series Circuits:");
            System.out.println(" --------------{  }---------------\n"
                             + " |                               |\n"
                             + " |                               |\n"
                             + "___                              |\n"
                             + " _                              { }\n"
                             + "___                             { }\n"
                             + " _                               |\n"
                             + " |                               |\n"
                             + " |                               |\n"
                             + " --------------{  }---------------");

            System.out.println("\nWhat do you want to learn about series circuits?\n"
                    + "1. How to calculate Voltage?\n" 
                    + "2. How to calculate Current?\n" 
                    + "3. How to calculate Resistance of each resistor?\n"
                    + "4. Calculator for Series Circuits\n"
                    + "5. Back");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Formula for voltage in series circuits:");
                    break;
                case 2:
                    System.out.println("Formula for current in series circuits:");
                    break;
                case 3:
                    System.out.println("Formula for resistance in series circuits:");
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
}