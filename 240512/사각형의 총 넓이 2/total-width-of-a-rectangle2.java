import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[201][201];

        for ( int i = 0 ; i < n ; i++ ) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for ( int x = x1 ; x < x2 ; x++ ) {
                for ( int y = y1 ; y < y2 ; y++ )
                    map[x+100][y+100] = 1;
            }
        }

        int sum = 0;

        for ( int i = 0 ; i <= 200 ; i++ )
            for ( int j = 0 ; j <= 200 ; j++ )
                sum += map[i][j];

        System.out.print(sum);
    }
}