import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1st = new int[n][m];
        int[][] arr2nd = new int[n][m];

        for ( int i = 0 ; i < n ; i++ ) 
            for ( int j = 0 ; j < m ; j++ )
                arr1st[i][j] = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) 
            for ( int j = 0 ; j < m ; j++ )
                arr2nd[i][j] = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < m ; j++ ) {
                if ( arr1st[i][j] == arr2nd[i][j] )
                System.out.print("0 ");
                else
                System.out.print("1 ");
            }

            System.out.println();
        }
    }
}