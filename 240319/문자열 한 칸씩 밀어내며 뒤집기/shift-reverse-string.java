import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);

        int n = sc.nextInt();
        int a = str.length();

        for ( int i = 0 ; i < n ; i++ ) {
            int k = sc.nextInt();
            String result = "";

            if ( k == 1 ) 
                str = str.substring(1) + str.charAt(0);

            else if ( k == 2 ) 
                str = str.charAt(a-1) + str.substring(0,a-1);

            else {
                char[] arr = str.toCharArray();

char temp;
for(int j = 0; j < a / 2; j++) {
    temp = arr[j];
    arr[j] = arr[a - j - 1];
    arr[a - j - 1] = temp;
}

str = new String(arr);
            }

            System.out.println(str);

        }
    }
}