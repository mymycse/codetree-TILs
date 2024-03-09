import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        for (;;) {
            n = sc.nextInt();
            if ( n < 25 ) {
                System.out.println("Higher");
                continue;
            }
            else if ( n > 25 ) {
                System.out.println("Lower");
                continue;
            }
            else {
                System.out.println("Good");
                break;
            }
        }
    }
}