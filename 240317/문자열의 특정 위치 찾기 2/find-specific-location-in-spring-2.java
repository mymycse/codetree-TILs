import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        int count = 0;

        String[] str = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

        for ( int i = 0 ; i < 5 ; i++ ) {
            String s = str[i];
            int leng = s.length();
            int cnt = 0;
            for ( int j = 0 ; j < leng ; j++ )
                if ( s.charAt(2) == c || s.charAt(3) == c ) 
                    cnt++;
            if ( cnt > 0 ) {
                System.out.println(str[i]);
                count++;
                }
        }
        System.out.println(count);
    }
}