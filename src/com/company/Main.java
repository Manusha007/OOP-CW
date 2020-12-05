package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner Sc1 = new Scanner(System.in);
    public static PremierLeagueManager premierLeagueManager = new PremierLeagueManager();

    public static void main(String[] args) throws IOException {
        int choice = 0;
        while (choice != 8){
            System.out.println("***********************************************************");
            System.out.println(" Please Enter 1 to Add a Club to Premier League ");
            System.out.println(" Please Enter 2 to Delete a Club from Premier League ");
            System.out.println(" Please Enter 3 to Display  Statistics of a Club ");
            System.out.println(" Please Enter 4 to Display the Premier League Table ");
            System.out.println(" Please Enter 5 to save data ");
            System.out.println(" Please Enter 6 to load data ");
            System.out.println(" Please Enter 7 to quit ");
            System.out.println("***********************************************************");
            System.out.print(" Please Enter your Choice: ");

            choice = inputValidation();
            switch (choice){

                case 1:
                    createClub();
                    break;
                case 2:
                    deleteClub();
                    break;
                case 3:
                    displayStatics();
                    break;
                case 4:
                    displayTable();
                    break;
                case 5:
                    save();
                    break;
                case 6:
                    load();
                    break;
                case 7:
                    quit();
                    break;
                default:
                    System.out.println("Invalid Input. Please try again ");

            }
        }
    }

    private static int inputValidation() {
        while (!Sc1.hasNextInt()) {
            System.out.println("Please Re-Enter!");
            Sc1.next();
        }
        return Sc1.nextInt();
    }

    private static void quit() {
        premierLeagueManager.quit();
    }

    private static void load() {
        premierLeagueManager.load();
    }

    private static void save() {
        premierLeagueManager.save();
    }

    private static void displayTable() {
        premierLeagueManager.displayTable();
    }

    private static void displayStatics() {
        premierLeagueManager.displayStatics();
    }

    private static void deleteClub() {
        premierLeagueManager.deleteClub();
    }

    private static void createClub(){ premierLeagueManager.createClub(); }
}
