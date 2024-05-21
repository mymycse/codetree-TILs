import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[19][19];

        for ( int i = 0 ; i < 19 ; i++ )
            for ( int j = 0 ; j < 19 ; j++ )
                map[i][j] = sc.nextInt();

        int win = 0;
        int r = 0;
        int c = 0;

        // 가로
        for ( int i = 0 ; i < 19 ; i++ )
            for ( int j = 0 ; j < 16 ; j++ )
                if ( map[i][j] != 0 && map[i][j] == map[i][j+1] && map[i][j+1] == map[i][j+2] &&
                map[i][j+2] == map[i][j+3] && map[i][j+3] == map[i][j+4] ) {
                    win = map[i][j];
                    r = i+1; c = j+3;
                }
        
        // 세로
        if ( win == 0 )
        for ( int i = 0 ; i < 16 ; i++ )
            for ( int j = 0 ; j < 19 ; j++ )
                if ( map[i][j] != 0 && map[i][j] == map[i+1][j] && map[i+1][j] == map[i+2][j] &&
                map[i+2][j] == map[i+3][j] && map[i+3][j] == map[i+4][j] ) {
                    win = map[i][j];
                    r = i+3; c = j+1;
                }

        // 대각선
        if ( win == 0 )
        for ( int i = 0 ; i < 16 ; i++ )
            for ( int j = 0 ; j < 16 ; j++ )
                if ( map[i][j] != 0 && map[i][j] == map[i+1][j+1] && map[i+1][j+1] == map[i+2][j+2] &&
                map[i+2][j+2] == map[i+3][j+3] && map[i+3][j+3] == map[i+4][j+4] ) {
                    win = map[i][j];
                    r = i+3; c = j+3;
                }

        System.out.println(win);
        System.out.println(r + " " + c);
    }
}