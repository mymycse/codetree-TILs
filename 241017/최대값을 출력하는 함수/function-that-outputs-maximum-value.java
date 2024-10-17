import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int res = sc.nextInt();

        for ( int i = 0 ; i < 2 ; i++ ) {
            int temp = sc.nextInt();
            if ( res < temp )
                res = temp;
        }

        System.out.print(res);
    }
}