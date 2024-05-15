import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student();
        System.out.printf("user %s lv %d\n", st1.id, st1.lv);

        Student st2 = new Student(sc.next(), sc.nextInt());
        System.out.printf("user %s lv %d", st2.id, st2.lv);
    }
}
class Student {
    String id;
    int lv;
    
    public Student() {
        this.id = "codetree";
        this.lv = 10;
    }
    public Student ( String str, int n ) {
        this.id = str;
        this.lv = n;
    }
}