import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;
        char c = sc.next().charAt(0);

        for ( int i = 0 ; i < 6 ; i++ ) {
            if ( word[i] == c ){
            idx = i;
            break;
            }
        }
        if ( idx == -1 )
        System.out.print("None");
        else
        System.out.print(idx);
    }
}