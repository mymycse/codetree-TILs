import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s = 0;

        for ( int i = a ; i <= b ; i++ ) {
            if ( i % c == 0 ) {
                s++;
                break;
            }
        }
        if ( s == 1 )
        System.out.print("YES");
        else 
        System.out.print("NO");
    }
}