import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1st = new int[3][3];
        int[][] arr2nd = new int[3][3];

        for ( int i = 0 ; i < 3 ; i++ )
            for ( int j = 0 ; j < 3 ; j++ )
                arr1st[i][j] = sc.nextInt();

        for ( int i = 0 ; i < 3 ; i++ )
            for ( int j = 0 ; j < 3 ; j++ )
                arr2nd[i][j] = sc.nextInt();

        for ( int i = 0 ; i < 3 ; i++ ) {
            for ( int j = 0 ; j < 3 ; j++ )
                System.out.print(arr1st[i][j]*arr2nd[i][j] + " ");

            System.out.println();
        }
    }
}