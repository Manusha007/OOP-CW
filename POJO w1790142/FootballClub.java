public class FootballClub {

    private int NumOfWins;
    private int NumOfDraws;
    private int NumOfDefeats;
    private int NumOfScoredGoals;
    private int NumOfRecivedGoals;
    private int Points;
    private int NumOfMatches;
    private int NumOfPlayers;

    public FootballClub(int numOfWins, int numOfDraws, int numOfDefeats, int numOfScoredGoals, int numOfRecivedGoals, int points, int numOfMatches, int numOfPlayers) {
        this.NumOfWins = numOfWins;
        this.NumOfDraws = numOfDraws;
        this.NumOfDefeats = numOfDefeats;
        this.NumOfScoredGoals = numOfScoredGoals;
        this.NumOfRecivedGoals = numOfRecivedGoals;
        this.Points = points;
        this.NumOfMatches = numOfMatches;
        this.NumOfPlayers = numOfPlayers;
    }

    public int getNumOfWins() {
        return NumOfWins;
    }

    public void setNumOfWins(int numOfWins) {
        this.NumOfWins = numOfWins;
    }

    public int getNumOfDraws() {
        return NumOfDraws;
    }

    public void setNumOfDraws(int numOfDraws) {
        this.NumOfDraws = numOfDraws;
    }

    public int getNumOfDefeats() {
        return NumOfDefeats;
    }

    public void setNumOfDefeats(int numOfDefeats) {
        this.NumOfDefeats = numOfDefeats;
    }

    public int getNumOfScoredGoals() {
        return NumOfScoredGoals;
    }

    public void setNumOfScoredGoals(int numOfScoredGoals) {
        this.NumOfScoredGoals = numOfScoredGoals;
    }

    public int getNumOfRecivedGoals() {
        return NumOfRecivedGoals;
    }

    public void setNumOfRecivedGoals(int numOfRecivedGoals) {
        this.NumOfRecivedGoals = numOfRecivedGoals;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int points) {
        this.Points = points;
    }

    public int getNumOfMatches() {
        return NumOfMatches;
    }

    public void setNumOfMatches(int numOfMatches) {
        this.NumOfMatches = numOfMatches;
    }

    public int getNumOfPlayers() {
        return NumOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.NumOfPlayers = numOfPlayers;
    }
}
