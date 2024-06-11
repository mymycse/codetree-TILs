import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10_001];

        int n = sc.nextInt();
        int k = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) {
            int loc = sc.nextInt();
            char c = sc.next().charAt(0);
            if ( c == 'G' )
                arr[loc] = 1;
            else
                arr[loc] = 2;
        }

        int result = 0;

        for ( int i = 0 ; i <= 10_000-k ; i++ ) {
            int sum = 0;
            for ( int j = i ; j <= i+k ; j++ )
                sum += arr[j];

            result = Math.max(result,sum);
        }

        System.out.println(result);
    }
}