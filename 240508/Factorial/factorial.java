import java.util.Scanner;

public class Main {
    public static int fib ( int n ) {
        if ( n == 0 || n == 1 )
            return 1;
        return n*fib(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(fib(n));
    }
}