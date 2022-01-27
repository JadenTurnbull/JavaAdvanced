package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args) {

        String match, team1, team2;
        String[] sides, s1, s2;
        Integer t1Score, t2Score, teamTotal;

        TreeMap<String, Integer> LeagueLog = new TreeMap<>();

        Scanner sc = null;
        try {
            File file = new File("C:\\Users\\jaden\\Desktop\\JavaAdvanced\\SoccerLeague\\src\\Main\\result.txt");
            sc = new Scanner(file);

            while (sc.hasNextLine()) {

                match = sc.nextLine();
                sides = match.split(",");
                s1 = sides[0].split(" ");
                team1 = s1[0];
                t1Score = Integer.parseInt(s1[1]);

                s2 = sides[1].split(" ");
                team2 = s2[0];
                t2Score = Integer.parseInt(s2[1]);

                teamTotal = 0;

                if (t1Score > t2Score){

                    LeagueLog.put(team1, LeagueLog.getOrDefault(team1, teamTotal) + 3);

                }else if (t1Score < t2Score){

                    LeagueLog.put(team2, LeagueLog.getOrDefault(team2, teamTotal) +3);

                }else {
                    LeagueLog.put(team1, LeagueLog.getOrDefault(team1, teamTotal) + 1);
                    LeagueLog.put(team2, LeagueLog.getOrDefault(team2, teamTotal) + 1);
                }

            }

            LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

            LeagueLog.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

            System.out.println("League Ranks: " + reverseSortedMap);

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            if (sc != null) sc.close();
        }
    }
}
