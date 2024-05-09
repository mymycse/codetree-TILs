import java.util.Scanner;

public class Main {
    public static int seq ( int x ) {
        if ( x == 1 )
            return 2;
        if ( x == 2 )
            return 4;
        return (seq(x-1)*seq(x-2))%100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(seq(n));
    }
}