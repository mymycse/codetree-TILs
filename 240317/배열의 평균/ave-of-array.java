import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[2][4];

        for ( int i = 0 ; i < 2 ; i++ ) {
            for ( int j = 0 ; j < 4 ; j++ )
            arr[i][j] = sc.nextInt();
        }

        for ( int i = 0 ; i < 2 ; i++ ) {
            int sum = 0, cnt = 0;
            double avg = 0;
            for ( int j = 0 ; j < 4 ; j++ ) {
                sum += arr[i][j];
                cnt++;
                }
            avg = (double)sum/cnt;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        for ( int j = 0 ; j < 4 ; j++ ) {
            int sum = 0, cnt = 0;
            double avg = 0;
            for ( int i = 0 ; i < 2 ; i++ ) {
                sum += arr[i][j];
                cnt++;
            }
            avg = (double)sum/cnt;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        int sum = 0, cnt = 0;

        for ( int i = 0 ; i < 2 ; i++ ) {
            for ( int j = 0 ; j < 4 ; j++ ) {
                sum += arr[i][j];
                cnt++;
            }
        }
        System.out.printf("%.1f", (double)sum/cnt);
    }
}