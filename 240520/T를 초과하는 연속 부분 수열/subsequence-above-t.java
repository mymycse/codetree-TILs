import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        int ans = 0;
        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();

            if ( arr[i] > k )
                if ( i > 0 && arr[i] > arr[i-1] ) 
                    cnt++;
                else
                    cnt = 1;
            else
                cnt = 0;

            ans = Math.max(ans,cnt);
        }

        System.out.println(ans);
    }
}