package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PremierLeagueManager implements LeagueManager{

    static private List< FootballClub> club1 = new ArrayList<>();
    Scanner Sc1 = new Scanner(System.in);
    String ClubName, ClubLocation;
    int ClubId, choice;

    public void createClub(){
        
        System.out.println("*********************************");
        System.out.println("Please Enter the name of the club:");
        ClubName = Sc1.next();
        System.out.println("Please Enter the Id of the club:");
        ClubId = Sc1.nextInt();
        System.out.println("Please Enter the Location of the club:");
        ClubLocation = Sc1.next();

        SportsClub sportsClub = new FootballClub(ClubName, ClubLocation, ClubId, 3,5,6,14,23,10,12,15);
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
                System.out.println("No wins " + footballClub.getNumOfWins());
                System.out.println("No draws " + footballClub.getNumOfDraws());
                System.out.println("No loses " + footballClub.getNumOfDefeats());
                System.out.println("No Scored Goals " + footballClub.getNumOfScoredGoals());
                System.out.println("No Received Goals " + footballClub.getNumOfRecivedGoals());
                System.out.println("Total Points " + footballClub.getPoints());
            }
        }
    }

    public void displayTable(){
        System.out.println("**************************************");

        for (FootballClub list: club1){
            System.out.println(" Club Name     : " + list.getClubName());
            System.out.println(" Club Location : " + list.getClubLocation());
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
            for (FootballClub items : club1){
                bw.write(items.getClubName() + "," + items.getClubLocation() + "," + items.getClubId() +
                        "," + items.getNumOfWins() + "," + items.getNumOfDraws() + "," + items.getNumOfScoredGoals() + "," + items.getNumOfRecivedGoals() + "," + items.getPoints() + "\n" );
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
        System.exit(0);
    }
}
