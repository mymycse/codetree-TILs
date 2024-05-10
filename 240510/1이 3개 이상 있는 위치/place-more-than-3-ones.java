import java.util.Scanner;

public class Main {
    public static boolean range(int x, int y, int n) {
        return ( 0<=x && x<n && 0<=y && y<n );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,count = 0;
        int n = sc.nextInt();
        
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        int[][] map = new int[n][n];

        for ( int i = 0 ; i < n ; i++ ) 
            for ( int j = 0 ; j < n ; j++ )
                map[i][j] = sc.nextInt();
        
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                int cnt = 0;
                for ( int k = 0 ; k < 4 ; k++ ) {
                    x = i + dx[k];
                    y = j + dy[k];

                    if ( range(x,y,n) && map[x][y] == 1 )
                        cnt++;
                }
                if ( cnt >= 3 )
                    count++;
            }
        }

        System.out.println(count);
    }
}