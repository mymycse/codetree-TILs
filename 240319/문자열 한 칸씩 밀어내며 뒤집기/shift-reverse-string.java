import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        int a = str.length();

        for ( int i = 0 ; i < n ; i++ ) {
            int k = sc.nextInt();

            if ( k == 1 ) 
                str = str.substring(1) + str.substring(0,1);

            else if ( k == 2 ) 
                str = str.substring(a-1) + str.substring(0,a-1);

            else {
                String sum = "";
                for ( int j = a-1 ; j >= 0 ; j-- ) 
                    sum += str.charAt(j);
                str = sum;
            }
            System.out.println(str);
        }
    }
}