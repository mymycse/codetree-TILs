import java.util.Scanner;

public class Main {
    public static boolean div( int n ) {

        int sum = 0;

        String str = Integer.toString(n);

        for ( int i = 0 ; i < str.length() ; i++ ) {
            int a = (int)str.charAt(i) - 48;
            sum += a;
        }
        return n % 2 == 0 && sum % 5 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ( div(n) )
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}