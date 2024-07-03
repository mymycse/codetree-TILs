import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coin = new int[n][n];

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = 0 ; j < n ; j++ )
                coin[i][j] = sc.nextInt();

        int[][] map = new int[n][n-2];

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = 0 ; j < n-2 ; j++ )
                map[i][j] = coin[i][j]+coin[i][j+1]+coin[i][j+2];

        int result = 0;

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = 0 ; j < n-2 ; j++ )
                for ( int r = 0 ; r < n ; r++ )
                    for ( int c = 0 ; c < n-2 ; c++ ) {
                        if ( i == r && Math.abs(j-c) < 2 )
                            continue;
                        result = Math.max(result,map[i][j]+map[r][c]);
                    }

        System.out.println(result);
    }
}