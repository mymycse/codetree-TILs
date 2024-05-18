import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] block = new int[n+1];

        while(k-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for ( int i = a ; i <= b ; i++ )
                block[i]++;
        }

        Arrays.sort(block);

        System.out.println(block[n]);
    }
}