package CodingExercises;

public class Student {
  private int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    public char assignGrade() {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            return 'C';
        } else if (marks >= 60 && marks < 70) {
            return 'D';
        } else if (marks >= 50 && marks < 60) {
            return 'E';
        } else if (marks >= 0 && marks < 50) {
            return 'F';
        } else {
            return 'X';
        }
    }

    public static void main(String[] args) {
        Student student = new Student(100);
        System.out.println(student.assignGrade());
    }
}
