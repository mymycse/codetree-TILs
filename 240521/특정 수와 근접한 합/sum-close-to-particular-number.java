import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int sum = 0;
        int[] num = new int[n];
        for ( int i = 0 ; i < n ; i++ ) {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        int ans = sum;

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = i+1 ; j < n ; j++ )
                ans = Math.min(ans,Math.abs(sum-num[i]-num[j]-s));

        System.out.println(ans);
    }
}