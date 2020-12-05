public class UniversityFootballClub {

    private int UniversityId;
    private String UniversityName;
    private String CaptainName;
    private String CoachName;
    private int NumOfPlayers;

    public UniversityFootballClub(int universityCode, String universityName, String captainName, String coachName, int numOfPlayers) {
        this.UniversityId = universityCode;
        this.UniversityName = universityName;
        this.CaptainName = captainName;
        this.CoachName = coachName;
        this.NumOfPlayers = numOfPlayers;
    }

    public int getUniversityCode() {
        return UniversityId;
    }

    public void setUniversityCode(int universityCode) {
        this.UniversityId = universityCode;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        this.UniversityName = universityName;
    }

    public String getCaptainName() {
        return CaptainName;
    }

    public void setCaptainName(String captainName) {
        this.CaptainName = captainName;
    }

    public String getCoachName() {
        return CoachName;
    }

    public void setCoachName(String coachName) {
        this.CoachName = coachName;
    }

    public int getNumOfPlayers() {
        return NumOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.NumOfPlayers = numOfPlayers;
    }
}
