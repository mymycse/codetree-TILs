import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dev = new int[6];
        int sum = 0;

        for ( int i = 0 ; i < 6 ; i++ ) {
            dev[i] = sc.nextInt();
            sum += dev[i];
        }

        int result = Integer.MAX_VALUE;

        for ( int i = 0 ; i < 6 ; i++ ) 
            for ( int j = i+1 ; j < 6 ; j++ )
                for ( int k = j+1 ; k < 6 ; k++ ) {
                    int group1 = dev[i]+dev[j]+dev[k];
                    int group2 = sum - group1;

                    result = Math.min(result, Math.abs(group1-group2));
                }

        System.out.println(result);
    }
}