import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, a = 0;

        for ( int i = 1 ; sum <= n ; i++ ) {
            sum += i;
            a++;
        }

        System.out.print(a);
    }
}