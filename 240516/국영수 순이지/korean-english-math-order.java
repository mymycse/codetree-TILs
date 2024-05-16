import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    Student ( String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if ( this.kor == student.kor ) 
            if ( this.eng == student.eng )
                return student.math - this.math;
            else return student.eng - this.eng;
        return student.kor - this.kor;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for ( int i = 0 ; i < n ; i++ )
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        Arrays.sort(students);

        for ( int i = 0 ; i < n ; i++ )
            System.out.printf("%s %d %d %d\n", students[i].name, students[i].kor, students[i].eng, students[i].math);
    }
}