import java.util.*;

public class Main {
    public static int sum ( int n ) {
        if ( n < 3 )
            return n;
        return n+sum(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(sum(n));
    }
}