import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int height, weight;

    Student(String a, int b, int c) {
        this.name = a;
        this.height = b;
        this.weight = c;
    }

    @Override
    public int compareTo(Student student){
        if (student.height == this.height)
            return student.weight - this.weight;
        return this.height - student.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] info = new Student[n];

        for ( int i = 0 ; i < n ; i++ )
            info[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());

        Arrays.sort(info);

        for ( int i = 0 ; i < n ; i++ )
            System.out.printf("%s %d %d\n", info[i].name, info[i].height, info[i].weight);
    }
}