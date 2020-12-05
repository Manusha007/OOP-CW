public class SchoolFootballClubs {

    private int SchoolId;
    private String SchoolName;
    private String CaptainName;
    private String CoachName;
    private int NumOfPlayers;

    public SchoolFootballClubs(int schoolId, String schoolName, String captainName, String coachName, int numOfPlayers) {
        this.SchoolId = schoolId;
        this.SchoolName = schoolName;
        this.CaptainName = captainName;
        this.CoachName = coachName;
        this.NumOfPlayers = numOfPlayers;
    }

    public int getSchoolId() {
        return SchoolId;
    }

    public void setSchoolId(int schoolId) {
        this.SchoolId = schoolId;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        this.SchoolName = schoolName;
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
