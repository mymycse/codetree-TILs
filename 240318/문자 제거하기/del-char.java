import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = str.length();

        for ( int j = 0 ; j < n-1 ; j++ ) {
            int a = sc.nextInt();
            char[] arr = str.toCharArray();
            String sum = "";

            if ( a >= str.length() )
                for ( int i = 0 ; i < str.length()-1 ; i++ )
                        sum += arr[i];
            else
                for ( int i = 0 ; i < str.length() ; i++ )
                    if ( i != a )
                        sum += arr[i];
            
            str = sum;
            System.out.println(str);
        }
    }
}