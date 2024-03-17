import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] str = new String [2];
        int [] arr = new int [2];

        for ( int i = 0 ; i < 2 ; i++ ) {
            str[i] = sc.next();
            arr[i] = str[i].length();
        }

        if ( arr[1] > arr[0] )
            System.out.print( str[1] + " " + arr[1] );
        else if ( arr[1] < arr[0] )
            System.out.print( str[0] + " " + arr[0] );
        else
            System.out.print("same");
    }
}