import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        for ( int i = 0 ; i < 5 ; i++ )
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for ( int i = 0 ; i < 5 ; i++ )
            System.out.printf("%s %d %.1f\n", students[i].name, students[i].height, students[i].weight);

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return b.height - a.height;
            }
        });

        System.out.println("\nheight");
        for ( int i = 0 ; i < 5 ; i++ )
            System.out.printf("%s %d %.1f\n", students[i].name, students[i].height, students[i].weight);
    }
}