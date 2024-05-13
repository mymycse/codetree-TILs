import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[2001][2001];

        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();

        for ( int a = ax1 ; a < ax2 ; a++ )
            for ( int b = ay1 ; b < ay2 ; b++ )
                map[a+1000][b+1000]++;

        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        for ( int a = bx1 ; a < bx2 ; a++ )
            for ( int b = by1 ; b < by2 ; b++ )
                map[a+1000][b+1000]++;

        int minX=1000,maxX=-1000,minY=1000,maxY=-1000;

        for ( int i = ax1 ; i < ax2 ; i++ )
            for ( int j = ay1 ; j < ay2 ; j++ )
                if ( map[i+1000][j+1000] == 1 ) {
                    if ( minX > i )
                        minX = i;
                    if ( maxX < i )
                        maxX = i;
                    if ( minY > j )
                        minY = j;
                    if ( maxX < j )
                        maxY = j;
                }

        System.out.print((maxX-minX+1)*(maxY-minY+1));
    }
}