import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        int[][] arr2rd = new int[n][n];

        for ( int j = 0 ; j < n ; j++ ) {
            for ( int i = 0 ; i < n ; i++ ) {
                arr2rd[i][j] = cnt;
                cnt++;
            }
        }

        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) 
                System.out.print(arr2rd[i][j] + " ");
            System.out.println();
        }
    }
}