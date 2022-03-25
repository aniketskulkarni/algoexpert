package com.java.problem.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TournamentWinner {

    // O(n) time | O(k) space - where n is the number
    // of competitions and k is the number of teams
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> scores = new HashMap<>();
        int resultIndex = 0;
        int winningPoints = 3;
        for (List<String> competition : competitions) {
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            Integer winningTeam = results.get(resultIndex);
            if (!scores.containsKey(homeTeam)) {
                scores.put(homeTeam, 0);
            }

            if (!scores.containsKey(awayTeam)) {
                scores.put(awayTeam, 0);
            }

            if (winningTeam == 0) {
                int score = scores.get(awayTeam);
                scores.put(awayTeam, score + winningPoints);
            } else {
                int score = scores.get(homeTeam);
                scores.put(homeTeam, score + winningPoints);
            }

            resultIndex += 1;
        }

        int winningScore = 0;
        String winningTeam = "";
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > winningScore) {
                winningScore = entry.getValue();
                winningTeam = entry.getKey();
            }
        }
        return winningTeam;
    }

    // O(n) time | O(k) space - where n is the number
    // of competitions and k is the number of teams
    // improved version, single for loop
    public String tournamentWinner1(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        
        Map<String, Integer> scores = new HashMap<>();
        
        int winningPoints = 3;
        
        String tournamentWinner = "";
        scores.put(tournamentWinner, 0);

        for (int index = 0; index < competitions.size(); index++) {

            List<String> competition = competitions.get(index);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            Integer result = results.get(index);

            String winningTeam = result == 1 ? homeTeam : awayTeam;

            if (!scores.containsKey(winningTeam)) {
                scores.put(winningTeam, 0);
            }

            int score = scores.get(winningTeam);
            scores.put(winningTeam, score + winningPoints);

            if (scores.get(winningTeam) > scores.get(tournamentWinner)) {
                tournamentWinner = winningTeam;
            }
        }

        return tournamentWinner;
    }

}
