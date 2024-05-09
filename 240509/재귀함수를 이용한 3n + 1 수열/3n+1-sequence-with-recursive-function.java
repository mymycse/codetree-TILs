import java.util.Scanner;

public class Main {
    public static int seq ( int x ) {
        if ( x == 1 )
            return 0;
        if ( x % 2 == 0 )
            return seq(x/2)+1;
        else
            return seq(x*3+1)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(seq(n));
    }
}