import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        int ans = 0;
        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ )
            arr[i] = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) {
            if ( arr[i] <= k ) {
                ans = Math.max(ans,cnt);
                cnt = 0;
            } else
                cnt++;
        }

        System.out.println(ans);
    }
}