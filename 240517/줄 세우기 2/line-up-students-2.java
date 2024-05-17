import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h, w, num;

    Student(int a, int b, int c){
        this.h = a;
        this.w = b;
        this.num = c;
    }

    @Override
    public int compareTo(Student student){
        if ( student.h == this.h )
            return student.w - this.w;
        return this.h - student.h;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for ( int i = 0 ; i < n ; i++ ) 
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);

        Arrays.sort(students);

        for ( int i = 0 ; i < n ; i++ )
            System.out.println(students[i].h + " " + students[i].w + " " + students[i].num);
    }
}