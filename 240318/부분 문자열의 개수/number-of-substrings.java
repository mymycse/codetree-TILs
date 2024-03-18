import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String pur = sc.next();

        int s = str.length();
        int cnt = 0;

        for ( int i = 0 ; i < s-1 ; i++ ) 
            if ( str.charAt(i) == pur.charAt(0) && str.charAt(i+1) == pur.charAt(1) )
                cnt++;
        
        System.out.print(cnt);
    }
}