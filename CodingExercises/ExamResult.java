package CodingExercises;

public class ExamResult {
    public boolean isPass(int marks) {
        if (marks <= 50) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        ExamResult exam = new ExamResult();
        System.out.println(exam.isPass(51));
    }
}
