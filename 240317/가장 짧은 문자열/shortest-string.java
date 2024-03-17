import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Max = 0, Min = 20;

        for ( int i = 0 ; i < 3 ; i++ ) {
            String s = sc.next();
            int a = s.length();
            if ( a > Max )
                Max = a;
            if ( a < Min )
                Min = a;
        }
        System.out.print(Max-Min);
    }
}