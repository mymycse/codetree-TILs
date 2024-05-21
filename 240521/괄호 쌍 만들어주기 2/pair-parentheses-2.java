import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] st = str.toCharArray();
        int cnt = 0;

        for ( int i = 0 ; i < st.length ; i++ )
            for ( int j = i+2 ; j < st.length-1 ; j++ )
                if ( st[i] == '(' && st[i+1] == '(' && st[j] == ')' && st[j+1] == ')' )
                    cnt++;
        System.out.println(cnt);
    }
}