import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if ( str1.length() != str2.length() )
            System.out.print("No");
        else {
            char[] fir = new char[str1.length()];
            char[] sec = new char[str2.length()];

            for ( int i = 0 ; i < str1.length() ; i++ ) {
                fir[i] = str1.charAt(i);
                sec[i] = str2.charAt(i);
            }
            Arrays.sort(fir);
            Arrays.sort(sec);

            boolean check = true;

            for ( int i = 0 ; i < str1.length() ; i++ ) {
                if ( fir[i] != sec[i] ) {
                    check = false;
                    break;
                }
            }
            if ( check )
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }
}