import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] grid = new char[r][c];

        for ( int i = 0 ; i < r ; i++ )
            for ( int j = 0 ; j < c ; j++ )
                grid[i][j] = sc.next().charAt(0);

        char start = grid[0][0];
        char end = grid[r-1][c-1];
        int cnt = 0;

        for ( int i = 1 ; i < r-2 ; i++ )
            for ( int j = 1 ; j < c-2 ; j++ )
                for ( int a = i+1 ; a < r-1 ; a++ )
                    for ( int b = j+1 ; b < c-1 ; b++ )
                        if ( start != grid[i][j] && end != grid[a][b] )
                            cnt++;

        System.out.println(cnt);
    }
}