import java.util.Scanner;

public class Main {
    public static void hello(int n) {
        if ( n == 0 )
            return;
        else {
            hello(n-1);
            System.out.println("HelloWorld");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hello(n);
    }
}