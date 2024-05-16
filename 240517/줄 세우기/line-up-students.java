import java.util.*;

class Student implements Comparable<Student>{
    int height, weight, num;

    Student(int a, int b, int c) {
        this.height = a;
        this.weight = b;
        this.num = c;
    }

    @Override
    public int compareTo(Student student) {
        if ( this.height == student.height )
            return student.weight - this.weight;
        return student.height - this.height;
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
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].num);
    }
}