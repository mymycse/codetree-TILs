import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=0;
        int max1 = 0, max2 = 0;

        int [] arr = new int [n];

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
        }

        if ( arr[0] > arr[1] ) {
            max1 = arr[0];
            max2 = arr[1];
        }
        else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for ( int i = 2 ; i < n ; i++ ) {
            if ( arr[i] >= max1 ) {
                max2 = max1;
                max1 = arr[i];
            }
            else if ( arr[i] >= max2 )
            max2 = arr[i];
        }

        System.out.print(max1 + " " + max2);
    }
}