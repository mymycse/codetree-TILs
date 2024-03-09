import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while ( true ) {
            if ( n == 1 ) {
                System.out.print(sum);
                break;
            }
            if ( n % 2 == 1 ) {
                n *= 3;
                n++;
            }
            else {
                n /= 2;
            }

            sum++;
        }
    }
}