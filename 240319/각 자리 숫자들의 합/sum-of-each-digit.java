import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int sum = 0;

        for ( int i = 0 ; i < str.length() ; i++ ) {
            char c = str.charAt(i);
            int a = (int)c - 48;
            sum += a;
        }
        System.out.print(sum);
    }
}