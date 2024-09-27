package AlgoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    private String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> teamPoints = new HashMap<>();
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 0) {
                String teamName = competitions.get(i).get(1);
                if (teamPoints.containsKey(teamName)) {
                    teamPoints.put(teamName, teamPoints.get(teamName) + 3);
                } else {
                    teamPoints.put(teamName, 3);
                }
            } else {
                String teamName = competitions.get(i).get(0);
                if (teamPoints.containsKey(teamName)) {
                    teamPoints.put(teamName, teamPoints.get(teamName) + 3);
                } else {
                    teamPoints.put(teamName, 3);
                }
            }
        }
        int maxPoints = Integer.MIN_VALUE;
        String winning_Team = "";
        for (Map.Entry<String, Integer> entry : teamPoints.entrySet()) {
            int points = entry.getValue();
            if (points > maxPoints) {
                winning_Team = entry.getKey();
                maxPoints = points;
            }
        }
        return winning_Team;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> matches = new ArrayList<>();
        matches.add("HTML");
        matches.add("Java");
        competitions.add(matches);
        matches = new ArrayList<>();
        matches.add("Java");
        matches.add("Python");
        competitions.add(matches);
        matches = new ArrayList<>();
        matches.add("Python");
        matches.add("HTML");
        competitions.add(matches);
        matches = new ArrayList<>();
        matches.add("C#");
        matches.add("Python");
        competitions.add(matches);
        matches = new ArrayList<>();
        matches.add("Java");
        matches.add("C#");
        competitions.add(matches);
        matches = new ArrayList<>();
        matches.add("C#");
        matches.add("HTML");
        competitions.add(matches);
        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(1);
        results.add(1);
        results.add(1);
        results.add(0);
        results.add(1);
        TournamentWinner tournamentWinner = new TournamentWinner();
        System.out.println("The winner team is: " + tournamentWinner.tournamentWinner(competitions, results));
    }
}
