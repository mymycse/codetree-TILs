import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] map = new int[101];

        while(n-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for ( int i = a ; i <= b ; i++ )
                map[i]++;
        }

        Arrays.sort(map);

        System.out.println(map[100]);
    }
}