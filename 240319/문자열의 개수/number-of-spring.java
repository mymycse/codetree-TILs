import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[200];

        int cnt = 0;

        while ( sc.hasNextLine() ) {
            arr[cnt] = sc.next();

            if ( arr[cnt] == "0" )
                break;
            
            cnt++;
        }

        System.out.println(cnt-1);
        
        for ( int i = 0 ; i < cnt ; i++ ) {
            if ( i % 2 == 0 )
                System.out.println(arr[i]);
        }
    }
}