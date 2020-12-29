package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PremierLeagueManager implements LeagueManager{

    static private List< FootballClub> club1 = new ArrayList<>();
    Scanner Sc1 = new Scanner(System.in);
    String ClubName, ClubLocation;
    int ClubId, choice, numOfWins, numOfDraws, numOfDefeats, numOfScoredGoals, numOfReceivedGoals, points, numOfMatches, numOfPlayers;

    public void createClub(){
        
        System.out.println("*********************************");
        System.out.println("Please Enter the name of the club:");
        ClubName = Sc1.next();
        System.out.println("Please Enter the Id of the club:");
        ClubId = Sc1.nextInt();
        System.out.println("Please Enter the Location of the club:");
        ClubLocation = Sc1.next();
        System.out.println("Please Enter the Number of wins of the club:");
        numOfWins = Sc1.nextInt();
        System.out.println("Please Enter the Number of defeats of the club:");
        numOfDefeats = Sc1.nextInt();
        System.out.println("Please Enter the Number of draws of the club:");
        numOfDraws = Sc1.nextInt();
        System.out.println("Please Enter the Number of Scored Goals");
        numOfScoredGoals = Sc1.nextInt();
        System.out.println("Please Enter the Number of Received Goals");
        numOfReceivedGoals = Sc1.nextInt();
        System.out.println("Please Enter the Number of Points of the club:");
        points = Sc1.nextInt();
        System.out.println("Please Enter the Number of Matches");
        numOfMatches = Sc1.nextInt();
        System.out.println("Please Enter the Number of Players");
        numOfPlayers = Sc1.nextInt();

        SportsClub sportsClub = new FootballClub(ClubName, ClubLocation, ClubId, numOfWins, numOfDefeats, numOfDraws, numOfScoredGoals, numOfReceivedGoals, points, numOfMatches, numOfPlayers);
        club1.add((FootballClub)sportsClub);
        System.out.println();
    }

    public void deleteClub(){
        System.out.println("**************************************");
        System.out.println("Please Enter the name of the club:");
        String deleteClub = Sc1.next();

        for(SportsClub club: club1){
            if (club.getClubName().equals(deleteClub)){
                System.out.println("Are you sure you want to Delete ? (yes = y , No = n)");
                String yn = Sc1.next();
                if (yn.equals("y")){
                    club1.remove(club);
                    System.out.println(club.getClubName() + " Delete Successfully");
                    return;
                }else{
                    System.out.println("Club not deleted");
                }
            }
        }
        System.out.println("Please Enter a Valid Club name:");
    }

    public void addScore(){

    }

    public void displayStatics(){
        System.out.println("**************************************");
        System.out.println("Please enter the Club name:");
        String name = Sc1.next();

        for (FootballClub footballClub : club1){
            if(footballClub.getClubName().equals(name)){
                System.out.format("+------------*-----------------*------------*----------------*--------------------*-----------------*------------------------*--------------------------*------------------*-------------------+-------------------*%n");
                System.out.format("|  Club Name |  Club Location  |   Club Id  | Number of Wins |  Number of Defeats | Number of Draws | Number of Scored Goals | Number of Received Goals | Number of Points | Number of Matches | Number of Players |%n");
                System.out.format("+------------*-----------------*------------*----------------*--------------------*-----------------*------------------------*--------------------------*------------------*-------------------+-------------------*%n");
                String leftAlignFormat = "| %-10s | %-15s | %-10s | %-14s | %-18s | %-15s | %-22s | %-24s | %-16s | %-17s | %-17s |%n";
                System.out.format(leftAlignFormat, footballClub.getClubName(), footballClub.getClubLocation(), footballClub.getClubId(), footballClub.getNumOfWins(), footballClub.getNumOfDefeats(),
                        footballClub.getNumOfDraws(), footballClub.getNumOfScoredGoals(), footballClub.getNumOfReceivedGoals(), footballClub.getPoints(), footballClub.getNumOfMatches(), footballClub.getNumOfPlayers());
                System.out.println();
            }
        }
    }

    public void displayTable(){
        System.out.println("**************************************");
        System.out.println();

        System.out.format("+------------*-----------------*------------*----------------*--------------------*-----------------*------------------------*--------------------------*------------------*-------------------+-------------------*%n");
        System.out.format("|  Club Name |  Club Location  |   Club Id  | Number of Wins |  Number of Defeats | Number of Draws | Number of Scored Goals | Number of Received Goals | Number of Points | Number of Matches | Number of Players |%n");
        System.out.format("+------------*-----------------*------------*----------------*--------------------*-----------------*------------------------*--------------------------*------------------*-------------------+-------------------*%n");

        for (FootballClub list: club1){
            String leftAlignFormat = "| %-10s | %-15s | %-10s | %-14s | %-18s | %-15s | %-22s | %-24s | %-16s | %-17s | %-17s |%n";
            System.out.printf(leftAlignFormat, list.getClubName(), list.getClubLocation(), list.getClubId(), list.getNumOfWins(), list.getNumOfDefeats(),
                    list.getNumOfDraws(), list.getNumOfScoredGoals(), list.getNumOfReceivedGoals(), list.getPoints(), list.getNumOfMatches(), list.getNumOfPlayers());
            System.out.println();
        }

    }

    public void save(){
        File file1 = new File("output.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(file1);
            bw = new BufferedWriter(fw);
            bw.write(String.format("+------------*-----------------*------------*----------------*--------------------*-----------------*------------------------*--------------------------*------------------*-------------------+-------------------*%n"));
            bw.write(String.format("|  Club Name |  Club Location  |   Club Id  | Number of Wins |  Number of Defeats | Number of Draws | Number of Scored Goals | Number of Received Goals | Number of Points | Number of Matches | Number of Players |%n"));
            bw.write(String.format("+------------*-----------------*------------*----------------*--------------------*-----------------*------------------------*--------------------------*------------------*-------------------+-------------------*%n"));
            String leftAlignFormat2 = "| %-10s | %-15s | %-10s | %-14s | %-18s | %-15s | %-22s | %-24s | %-16s | %-17s | %-17s |%n";
            for (FootballClub items : club1){
                bw.write(String.format(leftAlignFormat2, items.getClubName(), items.getClubLocation(), items.getClubId(), items.getNumOfWins(), items.getNumOfDefeats(), items.getNumOfDraws(),items.getNumOfScoredGoals(),
                        items.getNumOfReceivedGoals(), items.getPoints(), items.getNumOfMatches(), items.getNumOfPlayers()));
            }
            bw.flush();
        }catch (IOException exception){
            exception.printStackTrace();
        }finally {
            try {
                bw.close();
                fw.close();
                System.out.println("Successfully saved");
            }catch(IOException exception){
                exception.printStackTrace();
            }
        }

    }

    public void load(){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("output.txt");
            br = new BufferedReader(fr);
            String input;
            while ((input = br.readLine()) != null){
                System.out.println(input);
            }
        }catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try{
                fr.close();
                br.close();
            }catch (IOException exception){
                System.out.println("An error has happened");
                exception.printStackTrace();
            }
        }
    }

    public void quit(){
        System.out.println("\n\n******        +--------------------+          ******");
        System.out.println(" Thank you for using the Football Management System");
        System.out.println("\t\t\tExiting Program...");
        System.out.println("                  **-------** ");
        System.exit(0);

    }
}
