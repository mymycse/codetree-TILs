import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int distance = 0;
        int ans = Integer.MAX_VALUE;
        int[][] point = new int[n][2];
        for ( int i = 0 ; i < n ; i++ ) {
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }

        for ( int i = 1 ; i < n ; i++ )
            distance += Math.abs(point[i][0]-point[i-1][0]) + Math.abs(point[i][1]-point[i-1][1]);

        for ( int i = 1 ; i < n-1 ; i++ ) {
            int sum = distance;

            sum -= Math.abs(point[i][0]-point[i-1][0]) + Math.abs(point[i][1]-point[i-1][1]);
            sum -= Math.abs(point[i+1][0]-point[i][0]) + Math.abs(point[i+1][1]-point[i][1]);
            sum += Math.abs(point[i+1][0]-point[i-1][0]) + Math.abs(point[i+1][1]-point[i-1][1]);

            ans = Math.min(ans,sum);
        }

        System.out.println(ans);
    }
}