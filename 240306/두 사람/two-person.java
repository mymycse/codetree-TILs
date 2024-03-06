import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        char s, t;

        a = sc.nextInt();
        s = sc.next().charAt(0);

        b = sc.nextInt();
        t = sc.next().charAt(0);

        if ( a >= 19 && s == 'M' || b >= 19 && t == 'M' )
        System.out.print(1);
    }
}