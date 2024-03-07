import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, i, s;
        a = sc.nextInt();
        b = sc.nextInt();

        for ( i = 0 ; a <= b ; a += 2 ) {
            System.out.print( a + " " );
        }
    }
}