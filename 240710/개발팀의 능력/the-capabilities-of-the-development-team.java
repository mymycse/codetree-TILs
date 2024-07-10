import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abilities = new int[5];
        for (int i = 0; i < 5; i++)
            abilities[i] = sc.nextInt();
        
        int result = findMinDifference(abilities);
        System.out.println(result);
    }

    private static int findMinDifference(int[] abilities) {
        List<int[]> allCombinations = new ArrayList<>();
        for (int i = 0; i < abilities.length; i++)
            for (int j = i + 1; j < abilities.length; j++)
                allCombinations.add(new int[]{abilities[i], abilities[j]});
        
        int minDifference = Integer.MAX_VALUE;
        boolean possible = false;
        
        for (int i = 0; i < allCombinations.size(); i++)
            for (int j = i + 1; j < allCombinations.size(); j++)
                if (isDistinct(allCombinations.get(i), allCombinations.get(j), abilities)) {
                    int team1Sum = allCombinations.get(i)[0] + allCombinations.get(i)[1];
                    int team2Sum = allCombinations.get(j)[0] + allCombinations.get(j)[1];
                    int remaining = totalSum(abilities) - team1Sum - team2Sum;
                    
                    if (team1Sum != team2Sum && team1Sum != remaining && team2Sum != remaining) {
                        int maxTeam = Math.max(Math.max(team1Sum, team2Sum), remaining);
                        int minTeam = Math.min(Math.min(team1Sum, team2Sum), remaining);
                        minDifference = Math.min(minDifference, maxTeam - minTeam);
                        possible = true;
                    }
                }
        
        return possible ? minDifference : -1;
    }
    
    private static boolean isDistinct(int[] team1, int[] team2, int[] abilities) {
        Set<Integer> set = new HashSet<>();
        set.add(team1[0]);
        set.add(team1[1]);
        set.add(team2[0]);
        set.add(team2[1]);
        return set.size() == 4;
    }
    
    private static int totalSum(int[] abilities) {
        int sum = 0;
        for (int ability : abilities)
            sum += ability;
            
        return sum;
    }
}