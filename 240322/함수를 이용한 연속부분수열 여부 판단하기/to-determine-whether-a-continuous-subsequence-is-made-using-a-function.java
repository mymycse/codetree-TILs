import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        for ( int i = 0 ; i < a ; i++ )
            arr1[i] = sc.nextInt();
        for ( int i = 0 ; i < b ; i++ )
            arr2[i] = sc.nextInt();

        for ( int j = 0 ; j <= a-b+1 ; j++ ) {
            cnt = 0;
            int k = j;
            for ( int i = 0 ; i < b ; i++ ) {
                if ( arr1[k] == arr2[i] ) 
                    cnt++;
                else
                    break;
                k++;
            }
            if ( cnt == b )
                break;
        }

        if ( cnt == b )
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}