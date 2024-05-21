import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for ( int i = 0 ; i < n ; i++ )
            num[i] = sc.nextInt();

        int ans = 0;
        for ( int i = 0 ; i < n ; i++ )
            for ( int j = i+2 ; j < n ; j++ )
                ans = Math.max(ans,num[i]+num[j]);
                
        System.out.println(ans);
    }
}