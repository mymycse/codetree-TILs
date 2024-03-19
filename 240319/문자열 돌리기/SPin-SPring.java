import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int l = str.length();

        System.out.println(str);

        for ( int i = 0 ; i < l ; i++ ) {
            str = str.substring(l-1) + str.substring(0,l-1);
            System.out.println(str);
        }
    }
}