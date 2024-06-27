import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int cnt = 0;

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for ( int i = 0 ; i < n ; i++ )
            arr1[i] = sc.nextInt();

        for ( int i = 0 ; i < m ; i++ )
            arr2[i] = sc.nextInt();

        Arrays.sort(arr2);

        for ( int i = 0 ; i < n-m+1 ; i++ ) {
            int[] tmp = new int[m];

            for ( int j = i ; j < i+m ; j++ )
                tmp[j-i] = arr1[j];

            Arrays.sort(tmp);

            boolean check = true;

            for ( int j = 0 ; j < m ; j++ )
                if ( tmp[j] != arr2[j] ) {
                    check = false;
                    break;
                }
            
            if ( check )
                cnt++;
        }

        System.out.println(cnt);
    }
}