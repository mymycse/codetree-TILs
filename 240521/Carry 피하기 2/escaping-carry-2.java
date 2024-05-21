import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = -1;
        int[] num = new int[n];
        for ( int i = 0 ; i < n ; i++ )
            num[i] = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = i+1 ; j < n ; j++ )
                for ( int k = j+1 ; k < n ; k++ ) {
                    int a = num[i]; int b = num[j]; int c = num[k];
                    boolean carry = false;

                    while ( true ) {
                        if ( a%10 + b%10 + c%10 > 9 ) {
                            carry = true; 
                            break;
                        }
                        a /= 10; b /= 10; c /= 10;
                        
                        if ( a == 0 && b == 0 && c == 0 )
                            break;
                    }

                    if ( !carry )
                        ans = Math.max(ans, num[i]+num[j]+num[k]);
                }
        System.out.println(ans);
    }
}