import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        for ( int j = 0 ; j < n ; j++ ) {
            char[] arr = s.toCharArray();
            int k = sc.nextInt();

            if ( k == 1 ) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char tmp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = tmp;
            }
            else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for ( int i = 0 ; i < s.length() ; i++ ) {
                    if ( arr[i] == a )
                        arr[i] = b;
                }
            }

            String str = String.valueOf(arr);
            System.out.println(str);
        }
    }
}