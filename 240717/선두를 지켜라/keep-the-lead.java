import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] temp = new int[n][2];
        int totalTime = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            temp[i][0] = sc.nextInt();
            temp[i][1] = sc.nextInt();

            totalTime += temp[i][1];
        }

        int[] posA = new int[totalTime+1];
        int[] posB = new int[totalTime+1];

        int currentTime = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            int v = temp[i][0];
            int t = temp[i][1];

            for ( int j = 0 ; j < t ; j++ ) {
                currentTime++;
                posA[currentTime] = posA[currentTime-1] + v;
            }
        }

        currentTime = 0;

        for ( int i = 0 ; i < m ; i++ ) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for ( int j = 0 ; j < t ; j++ ) {
                currentTime++;
                posB[currentTime] = posB[currentTime-1] + v;
            }
        }

        int leadChanges = 0;
        int currentLeader = 0;

        for ( int i = 0 ; i < totalTime ; i++ ) {
            if (posA[i] > posB[i]) {
                if (currentLeader != 1) {
                    leadChanges++;
                    currentLeader = 1;
                }
            } else if (posB[i] > posA[i]) {
                if (currentLeader != 2) {
                    leadChanges++;
                    currentLeader = 2;
                }
            }
        }

        int result = leadChanges == 0 ? leadChanges : leadChanges-1 ;
        
        System.out.println(result);
    }
}