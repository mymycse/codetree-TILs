import java.util.Scanner;

class Info {
    String code;
    char place;
    int time;

    public Info ( String code, char place, int time ) {
        this.code = code;
        this.place = place;
        this.time = time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        Info info1 = new Info(a,b,c);

        System.out.println("secret code : " + info1.code );
        System.out.println("meeting point : " + info1.place );
        System.out.println("time : " + info1.time );
    }
}