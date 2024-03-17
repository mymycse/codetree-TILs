import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for ( int i = 0 ; i < 5 ; i++ ) {
            String input = sc.nextLine();
            for ( int j = 0 ; j < 5 ; j++ ) {
                int tmp = (int)input.charAt(j);
                String output = "";

                if ( tmp > 64 && tmp < 91 ) {
                    output += (char)(tmp+32);
                    System.out.print(output + " ");
                }                
                else if ( tmp > 96 && tmp < 123) {
                    output += (char)(tmp-32);
                    System.out.print(output + " ");
                }
            }
            System.out.println();
        }
    }
}