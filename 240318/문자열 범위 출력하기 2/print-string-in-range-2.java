import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        int leng = s.length();

        if ( n >= s.length() ) 
            System.out.print(s);
        else
            for ( int i = leng-1 ; i >= leng - n ; i-- )
                System.out.print(s.charAt(i));
    }
}