import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        char s;
        double b;

        for ( int i = 0 ; i < 3 ; i++ ) {
            s = sc.next().charAt(0);
            b = sc.nextDouble();

            if ( s == 'Y' ) {
                if (b >= 37)
                arr[0]++;
                else
                arr[2]++;
            }
            else {
                if (b >= 37)
                arr[1]++;
                else
                arr[3]++;
            }
        }
            for ( int i = 0 ; i < 4 ; i++ )
            System.out.print(arr[i] + " ");

            if ( arr[0] >= 2 )
            System.out.print("E");
        
    }
}