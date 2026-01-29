package CourseProblems;

public class StringBufferAndBuilder {
  public static void main(String[] args) {

    // StringBuffer
    // Mutable
    // Synchronized (Multi threading - thread safe)
    // Slow
    // Less memory efficient
    StringBuffer sb = new StringBuffer("TExt");
    System.out.println(sb.append(" 123"));
    sb.setCharAt(1, 'e');
    System.out.println(sb);

    // StringBuilder
    // Mutable
    // Not Synchronized (Single thread)
    // fast
    // More memory efficient
    StringBuilder sb1 = new StringBuilder("TEXt");
    System.out.println(sb1.append(" 12345"));
    sb1.setCharAt(3, 'T');
    System.out.println(sb1);
  }
}
