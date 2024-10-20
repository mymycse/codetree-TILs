import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for ( int i = n ; i > 0 ; i-- ) {
            for ( int j = n ; j > i ; j-- )
                System.out.print("  ");

            for ( int j = 1 ; j <= i ; j++ )
                System.out.print( j + " " );

            System.out.println();
        }
    }
}