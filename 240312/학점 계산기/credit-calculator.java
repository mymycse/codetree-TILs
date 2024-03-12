import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];
        int cnt = 0;
        double sum = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
            cnt++;
        }

        double avg = (double)sum/cnt;
        System.out.printf("%.1f", avg);

        System.out.println();

        if ( avg >= 4.0 )
        System.out.print("Perfect");
        else if ( avg >= 3.0 )
        System.out.print("Good");
        else
        System.out.print("Poor");
    }
}