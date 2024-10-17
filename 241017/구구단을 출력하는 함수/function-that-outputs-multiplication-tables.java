import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < 3 ; i++ )
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for ( int i = arr[0] ; i <= arr[2] ; i++ ) {
            if ( i == arr[1] )
                continue;
            for ( int j = 1 ; j <= 9 ; j++ )
                System.out.printf("%d * %d = %d\n",i,j,i*j);
        }
    }
}