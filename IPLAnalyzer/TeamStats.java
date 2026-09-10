package IPLAnalyzer;

public class TeamStats {

    private String team;
    private int matchesPlayed;
    private int wins;
    private int losses;

    public TeamStats() {
    }

    public TeamStats(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void addWin() {
        wins++;
        matchesPlayed++;
    }

    public void addLoss() {
        losses++;
        matchesPlayed++;
    }

    @Override
    public String toString() {
        return team +
                " | Matches: " + matchesPlayed +
                " | Wins: " + wins +
                " | Losses: " + losses;
    }
}
