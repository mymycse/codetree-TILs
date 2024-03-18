import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int leng = str.length();

        System.out.print( str.substring(0,2) + str.substring(3,leng-2) + str.substring(leng-1) );
    }
}