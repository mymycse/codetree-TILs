import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i++ )
            arr[i] = Integer.parseInt(str.nextToken());

        Arrays.sort(arr);

        int st = 0;
        int en = n-1;
        long sum = Integer.MAX_VALUE;
        long[] res = new long[2];

        while ( st < en ) {
            long temp = arr[st]+arr[en];

            if ( Math.abs(temp) < sum ) {
                res[0] = arr[st];
                res[1] = arr[en];
                sum = Math.abs(temp);
            } else if ( Math.abs(temp) == sum ) {
                if ( arr[st] < res[0] ) {
                    res[0] = arr[st];
                    res[1] = arr[en];
                }
            } 

            if ( temp >= 0 ) 
                st++;
            else
                en--;
        }

        System.out.println(res[0] + " " + res[1]);
    }
}