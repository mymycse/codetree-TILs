import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A_temp, B_temp, C_temp;
        char a, b, c, s, t, r;

        a = sc.next().charAt(0);
        A_temp = sc.nextInt();

        b = sc.next().charAt(0);
        B_temp = sc.nextInt();

        c = sc.next().charAt(0);
        C_temp = sc.nextInt();
        
        if ( a == 'Y' ) {
            if ( A_temp >= 37 )
            s = 'A';
            else 
            s = 'C';
        }
        else {
            if ( A_temp >= 37 )
            s = 'B';
            else 
            s = 'D';
        }
        
        if ( b == 'Y' ) {
            if ( B_temp >= 37 )
            t = 'A';
            else 
            t = 'C';
        }
        else {
            if ( B_temp >= 37 )
            t = 'B';
            else 
            t = 'D';
        }
        
        if ( c == 'Y' ) {
            if ( C_temp >= 37 )
            r = 'A';
            else 
            r = 'C';
        }
        else {
            if ( C_temp >= 37 )
            r = 'B';
            else 
            r = 'D';
        }
        if ( s == 'A' && t == 'A' && r == 'A' || s != 'A' && t == 'A' && r == 'A' || s == 'A' && t != 'A' && r == 'A' || s == 'A' && t == 'A' && r != 'A')
        System.out.print("E");
        else
        System.out.print("N");
    }
}