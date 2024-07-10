import java.util.Scanner;

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
        int minDifference = Integer.MAX_VALUE;
        boolean possible = false;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                int team1Sum = abilities[i] + abilities[j];

                for (int k = 0; k < 5; k++) {
                    if (k == i || k == j) continue;
                    for (int l = k + 1; l < 5; l++) {
                        if (l == i || l == j) continue;

                        int team2Sum = abilities[k] + abilities[l];
                        int team3Sum = 0;
                        for (int m = 0; m < 5; m++) {
                            if (m != i && m != j && m != k && m != l) {
                                team3Sum = abilities[m];
                                break;
                            }
                        }

                        if (team1Sum != team2Sum && team1Sum != team3Sum && team2Sum != team3Sum) {
                            int maxTeam = Math.max(Math.max(team1Sum, team2Sum), team3Sum);
                            int minTeam = Math.min(Math.min(team1Sum, team2Sum), team3Sum);
                            minDifference = Math.min(minDifference, maxTeam - minTeam);
                            possible = true;
                        }
                    }
                }
            }
        }
        
        return possible ? minDifference : -1;
    }
}