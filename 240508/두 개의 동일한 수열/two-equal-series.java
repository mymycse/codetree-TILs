import java.util.*;

public class Main {
    static int[] arr1;
    static int[] arr2;
    public static boolean check( int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            if ( arr1[i] != arr2[i] )
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr1 = new int[n];
        arr2 = new int[n];

        for ( int i = 0 ; i < n ; i++ )
            arr1[i] = sc.nextInt();
        for ( int i = 0 ; i < n ; i++ )
            arr2[i] = sc.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if ( check(n) )
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}