import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[201][201];

        for ( int k = 0 ; k < n ; k++ ) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for ( int i = x; i < x+8 ; i++ )
                for ( int j = y ; j < y+8 ; j++ )
                    map[i+100][j+100] = 1;
        }

        int res = 0;

        for ( int i = 0 ; i < 201 ; i++ )
            for ( int j = 0 ; j < 201 ; j++ )
                res += map[i][j];

        System.out.print(res);
    }
}