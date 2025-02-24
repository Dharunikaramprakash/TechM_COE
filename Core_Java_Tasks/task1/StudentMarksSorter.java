package pack1;

import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = 0;
        for (int mark : marks) {
            this.total += mark;
        }
        this.average = (double) this.total / marks.length;
    }

    @Override
    public String toString() {
        return name + " - Total: " + total + ", Average: " + average;
    }
}

public class StudentMarksSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();
            int[] marks = new int[subjects];
            System.out.print("Enter marks: ");
            for (int j = 0; j < subjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine();
            students.add(new Student(name, marks));
        }


        students.sort(Comparator.comparingInt(s -> -s.total));


        System.out.println("\nSorted student list:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
