import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k = 0, sum = 0;

        for ( ;; ) {
            n = sc.nextInt();
            if ( n >= 30 || n < 20 )
            break;

            sum += n;
            k++;
        }

        System.out.printf("%.2f", (double)sum/k);
    }
}