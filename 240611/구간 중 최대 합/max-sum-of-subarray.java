import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ )
            arr[i] = sc.nextInt();

        int result = 0;

        for ( int i = 0 ; i <= n-k ; i++ ) {
            int now = 0;
            for ( int j = i ; j < i+k ; j++ )
                now += arr[j];

            result = Math.max(result,now);
        }

        System.out.println(result);
    }
}