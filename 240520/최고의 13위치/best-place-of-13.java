import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for ( int i = 0 ; i < n ; i++ )
            for ( int j = 0 ; j < n ; j++ )
                map[i][j] = sc.nextInt();

        int res = 0;
        for ( int i = 0 ; i < n ; i++ )
            for ( int j = 0 ; j < n-2 ; j++ )
                res = Math.max(res,map[i][j]+map[i][j+1]+map[i][j+2]);

        System.out.println(res);
    }
}