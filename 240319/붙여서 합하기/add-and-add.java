import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String str1 = s1 + s2;
        String str2 = s2 + s1;

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        System.out.print(a+b);
    }
}