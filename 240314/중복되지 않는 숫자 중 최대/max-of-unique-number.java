import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max1 = 0, max2=0;
        
        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();

            if ( arr[i] >= max1 ) {
                max2 = max1;
                max1 = arr[i];
            }
            else if ( arr[i] >= max2 )
            max2 = arr[i];
        }
        if ( max1 == max2 )
        System.out.print(-1);
        else
        System.out.print(max1);
    }
}