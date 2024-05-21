import java.util.Scanner;

public class Main {
    public static int n, m;
    public static boolean inRange(int x, int y) {
        return ( x >= 0 && x < n && y >= 0 && y < m );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 0;
        char[][] words = new char[n][m];
        int[] dx = {0,1,1,1,0,-1,-1,-1};
        int[] dy = {1,1,0,-1,-1,-1,0,1};

        for ( int i = 0 ; i < n ; i++ ) {
            String str = sc.next();
            for ( int j = 0 ; j < m ; j++ )
                words[i][j] = str.charAt(j);
            }

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = 0 ; j < m ; j++ ) {
                if ( words[i][j] == 'L' ) 
                for ( int d = 0 ; d < 8 ; d++ ) {
                    int LEE = 0;
                    int curX = i;
                    int curY = j;
                    for ( int k = 1 ; k <= 2 ; k++ ) {
                        int nx = curX + dx[d]*k;
                        int ny = curY + dy[d]*k;

                        if ( !inRange(nx,ny) )
                            break;

                        if ( words[nx][ny] == 'E' )
                            LEE++;
                    }

                    if ( LEE == 2 )
                        cnt++;
                }
            }

            System.out.println(cnt);
    }
}