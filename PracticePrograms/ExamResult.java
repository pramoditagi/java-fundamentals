package PracticePrograms;

public class ExamResult {
  public boolean isPass(int marks) {
    return marks > 50;
  }

  public static void main(String[] args) {
    ExamResult examResult = new ExamResult();
    System.out.println(examResult.isPass(50));
  }
}
