import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[][] map = new int[201][201];

        for ( int i = 0 ; i < n ; i++ ) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for ( int a = x1 ; a < x2 ; a++ )
                for ( int b = y1 ; b < y2 ; b++ )   
                    map[a+100][b+100] = i%2;
        }

        int area = 0;

        for ( int i = 0 ; i < 201 ; i++ )   
            for ( int j = 0 ; j < 201 ; j++ )   
                if ( map[i][j] == 1 )
                    area++;

        System.out.print(area);
    }
}