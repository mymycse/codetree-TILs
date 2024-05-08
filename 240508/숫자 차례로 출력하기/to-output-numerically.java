import java.util.*;

public class Main {
    public static void reverse(int n) {
        if ( n == 0 )
            return;
        reverse(n-1);
        System.out.print(n + " ");
    }
    public static void num(int n) {
        if ( n == 0 )
            return;
        System.out.print(n+" ");
        num(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverse(n);
        System.out.println();
        num(n);
    }
}