public class SportsClub {

    private String ClubName;
    private String ClubLocation;

    public SportsClub(String ClubName, String ClubLocation){
        this.ClubName = ClubName;
        this.ClubLocation = ClubLocation;
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
}
