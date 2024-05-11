import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n*2];

        for ( int i = 0 ; i < n*2 ; i++ )
            num[i] = sc.nextInt();

        Arrays.sort(num);
        int sumMax = 0;

        for ( int i = 0 ; i < n*2 ; i++ ) {
            int sum = num[i] + num[n*2-1-i];
            if ( sum > sumMax )
                sumMax = sum;
        }

        System.out.print(sumMax);
    }
}