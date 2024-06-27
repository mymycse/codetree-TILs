import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        boolean[] res = new boolean[100_001];
        int cnt = 0;

        for ( int i = 0 ; i < n ; i++ )
            num[i] = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) 
            for ( int j = i ; j < n ; j++ ) {
                double sum = 0;
                boolean exist = false;

                for ( int k = i ; k <= j ; k++ )
                    sum += num[k];
                
                sum /= (j-i+1);

                for ( int k = i ; k <= j ; k++ )
                    if ( num[k] == sum ) {
                        exist = true;
                        break;
                    }
                
                if ( exist )
                    cnt++;
            }
        
        System.out.println(cnt);
    }
}