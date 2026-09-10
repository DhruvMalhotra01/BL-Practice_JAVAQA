package IPLAnalyzer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IPLAnalyzer {

    private final Map<String, TeamStats> teamStats;

    public IPLAnalyzer() {
        teamStats = new HashMap<>();
    }

    // -----------------------------
    // READ AND VALIDATE CSV
    // -----------------------------

    public List<Match> readMatches(String fileName)
            throws IOException {

        List<Match> matches = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                if (data.length != 4) {
                    System.out.println(
                        "Invalid row: " + line
                    );
                    continue;
                }

                int matchId;

                try {
                    matchId = Integer.parseInt(data[0].trim());
                } catch (NumberFormatException e) {

                    System.out.println(
                        "Invalid match ID: " + line
                    );

                    continue;
                }

                String team1 = data[1].trim();
                String team2 = data[2].trim();
                String winner = data[3].trim();

                if (team1.isEmpty()
                        || team2.isEmpty()
                        || winner.isEmpty()) {

                    System.out.println(
                        "Missing data: " + line
                    );

                    continue;
                }

                if (!winner.equals(team1)
                        && !winner.equals(team2)) {

                    System.out.println(
                        "Invalid winner: " + line
                    );

                    continue;
                }

                matches.add(
                    new Match(
                        matchId,
                        team1,
                        team2,
                        winner
                    )
                );
            }
        }

        return matches;
    }

    // -----------------------------
    // ANALYZE MATCHES
    // -----------------------------

    public void analyze(List<Match> matches) {

        for (Match match : matches) {

            String team1 = match.getTeam1();
            String team2 = match.getTeam2();
            String winner = match.getWinner();

            TeamStats stats1 =
                teamStats.computeIfAbsent(
                    team1,
                    TeamStats::new
                );

            TeamStats stats2 =
                teamStats.computeIfAbsent(
                    team2,
                    TeamStats::new
                );

            if (winner.equals(team1)) {

                stats1.addWin();
                stats2.addLoss();

            } else {

                stats2.addWin();
                stats1.addLoss();
            }
        }
    }

    // -----------------------------
    // DISPLAY RESULTS
    // -----------------------------

    public void displayResults() {

        System.out.println("\n--- IPL Statistics ---");

        for (TeamStats stats : teamStats.values()) {
            System.out.println(stats);
        }
    }

    // -----------------------------
    // FIND TEAM WITH MOST WINS
    // -----------------------------

    public TeamStats getTeamWithHighestWins() {

        TeamStats bestTeam = null;

        for (TeamStats stats : teamStats.values()) {

            if (bestTeam == null
                    || stats.getWins() > bestTeam.getWins()) {

                bestTeam = stats;
            }
        }

        return bestTeam;
    }

    // -----------------------------
    // GET ALL RESULTS
    // -----------------------------

    public List<TeamStats> getResults() {

        return new ArrayList<>(teamStats.values());
    }

    // -----------------------------
    // WRITE CSV
    // -----------------------------

    public void writeCSV(String fileName)
            throws IOException {

        try (BufferedWriter writer =
                     new BufferedWriter(
                         new FileWriter(fileName))) {

            writer.write(
                "team,matchesPlayed,wins,losses"
            );

            writer.newLine();

            for (TeamStats stats : teamStats.values()) {

                writer.write(
                    stats.getTeam() + ","
                    + stats.getMatchesPlayed() + ","
                    + stats.getWins() + ","
                    + stats.getLosses()
                );

                writer.newLine();
            }
        }
    }

    // -----------------------------
    // WRITE JSON
    // -----------------------------

    public void writeJSON(String fileName)
            throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(
            new java.io.File(fileName),
            getResults()
        );
    }
}
