import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[str.length()];
        int num = 0;

        for ( int i = 0 ; i < str.length() ; i++ )
            arr[i] = str.charAt(i) - '0';

        for ( int i = 0 ; i < str.length() ; i++ )
            num = num*2 + arr[i];

        System.out.println(num);
    }
}