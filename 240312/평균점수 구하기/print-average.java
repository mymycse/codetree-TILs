import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for ( int i = 0 ; i < 8 ; i++ ) {
            double a = sc.nextDouble();
            sum += a;
        }
        System.out.printf("%.1f", (double)sum/8);
    }
}