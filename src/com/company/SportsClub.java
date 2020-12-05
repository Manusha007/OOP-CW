package com.company;

public class SportsClub {
    private String ClubName;
    private String ClubLocation;
    private int ClubId;

    public SportsClub(String ClubName, String ClubLocation, int clubId){
        this.ClubName = ClubName;
        this.ClubLocation = ClubLocation;
        this.ClubId = ClubId;
    }

    public String getClubName() {
        return ClubName;
    }

    public void setClubName(String clubName) {
        this.ClubName = clubName;
    }

    public String getClubLocation() {
        return ClubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.ClubLocation = clubLocation;
    }

    public int getClubId() {
        return ClubId;
    }

    public void setClubId(int clubId) {
        this.ClubId = clubId;
    }
}
