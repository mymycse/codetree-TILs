import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[2001][2001];

        for ( int i = 0 ; i < 2 ; i++ ) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for ( int a = x1 ; a < x2 ; a++ )
                for ( int b = y1 ; b < y2 ; b++ )
                    map[a+1000][b+1000]++;
        }

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        for ( int a = x1 ; a < x2 ; a++ )
            for ( int b = y1 ; b < y2 ; b++ )
                if ( map[a+1000][b+1000] == 1 )
                    map[a+1000][b+1000]--;

        int res = 0;

        for ( int i = 0 ; i <= 2000 ; i++ )
            for ( int j = 0 ; j <= 2000 ; j++ )
                if ( map[i][j] == 1 )
                    res++;
        
        System.out.print(res);
    }
}