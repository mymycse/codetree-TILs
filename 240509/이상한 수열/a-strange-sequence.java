import java.util.Scanner;

public class Main {
    public static int seq ( int x ) {
        if ( x <= 2 )
            return x;
        return seq(x/3)+seq(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(seq(n));
    }
}