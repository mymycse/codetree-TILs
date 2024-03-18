import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        char a = arr[0];
        char b = arr[1];

        for ( int i = 0 ; i < str.length() ; i++ ) 
            if ( arr[i] == b )
                arr[i] = a;
        
        str = String.valueOf(arr);
        System.out.print(str);
    }
}