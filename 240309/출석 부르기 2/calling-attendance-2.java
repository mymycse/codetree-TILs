import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        for (;;) {
            n = sc.nextInt();

            if ( n == 1 ) {
                System.out.println("John");
                continue;
            }
            else if ( n == 2 ) {
                System.out.println("Tom");
                continue;
            }
            else if ( n == 3 ) {
                System.out.println("Paul");
                continue;
            }
            else if ( n == 4 ) {
                System.out.println("Sam");
                continue;
            }
            else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}