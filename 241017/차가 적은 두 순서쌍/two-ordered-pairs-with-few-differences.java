import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i++ )
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;

        for ( int a = 0 ; a < n ; a++ ) {
            for ( int b = a+1 ; b < n ; b++ ) {
                for ( int c = b+1 ; c < n ; c++ ) {
                    for ( int d = c+1 ; d < n ; d++ ) {
                        int temp = Math.abs((arr[a]+arr[d]) - (arr[b]+arr[c]));

                        if ( temp < res )
                            res = temp;
                    }
                }
            }
        }

        System.out.println(res);
    }
}