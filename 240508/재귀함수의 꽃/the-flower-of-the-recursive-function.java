import java.util.*;

public class Main {
    public static void num(int n) {
        if ( n == 0 )
            return;
        System.out.print(n+" ");
        num(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        num(n);
    }
}