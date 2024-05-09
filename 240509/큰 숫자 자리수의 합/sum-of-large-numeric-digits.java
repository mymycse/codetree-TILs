import java.util.Scanner;

public class Main {
    public static int sum (int x) {
        if ( x == 0 )
            return 0;
        return sum(x/10)+(x%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;

        for ( int i = 0 ; i < 3 ; i++ ) {
            int a = sc.nextInt();
            result *= a;
        }
        System.out.print(sum(result));
    }
}