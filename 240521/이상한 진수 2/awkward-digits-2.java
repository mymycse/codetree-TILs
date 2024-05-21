import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] digit = new int[str.length()];
        for ( int i = 0 ; i < str.length() ; i++ )
            digit[i] = str.charAt(i) - '0';

        int ans = 0;

        for ( int i = 0 ; i < str.length() ; i++ ) {
            int sum = 0;
            digit[i] = (digit[i]+1)%2;

            for ( int j = 0 ; j < str.length() ; j++ )
                sum = sum*2 + digit[j];

            ans = Math.max(sum,ans);
            digit[i] = (digit[i]+1)%2;
        }

        System.out.println(ans);
    }
}