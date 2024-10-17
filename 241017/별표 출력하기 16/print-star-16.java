import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int size = n*n;

        for ( int i = 0 ; i < n ; i++ ) {
            int temp = (int)Math.pow(n-i,2);

            for ( int j = 0 ; j < size-temp ; j++ )
                System.out.print(" ");

            for ( int j = 0 ; j < temp ; j++ )
                System.out.print("*");

            System.out.println();
        }
    }
}