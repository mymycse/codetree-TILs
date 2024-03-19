import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ )
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int Min = Integer.MAX_VALUE;

        for ( int i = 1 ; i < n-1 ; i++ ) {
            if ( arr[i] - arr[i-1] < Min )
                Min = arr[i] - arr[i-1];
        }

        System.out.print(Min);
    }
}