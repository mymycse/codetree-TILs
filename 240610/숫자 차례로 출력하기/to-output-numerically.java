import java.util.Scanner;

public class Main {
    static void num1(int n) {
        if ( n == 0 )
            return;
        num1(n-1);
        System.out.print(n + " ");
    }
    static void num2(int n) {
        if ( n == 0 )
            return;
        System.out.print(n+" ");
        num2(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        num1(n);
        System.out.println();
        num2(n);
    }
}