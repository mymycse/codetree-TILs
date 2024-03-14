import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=0;
        int max = Integer.MIN_VALUE;

        Integer [] arr = new Integer [n];

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print(arr[0] + " " + arr[1]);
    }
}