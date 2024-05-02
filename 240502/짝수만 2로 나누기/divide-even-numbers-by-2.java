import java.util.*;

public class Main {
    public static void even ( int[] arr2 ) {
        for ( int i = 0 ; i < arr2.length ; i++ ) {
            if ( arr2[i] % 2 == 0 )
                System.out.print(arr2[i]/2 + " ");
            else
                System.out.print(arr2[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ ) 
            arr[i] = sc.nextInt();

        even(arr);
    }
}