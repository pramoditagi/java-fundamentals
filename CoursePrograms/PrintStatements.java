package CoursePrograms;

public class PrintStatements {
  public static void main(String[] args) {
    /*
     * System: System is a final class from java.lang package
     * out: out is a public static final PrintStream out. It is an object of
     * PrintStream class
     * println: println is a method to print statements. It can evaluate expressions
     * and print them on console or screen
     * println is also called as print line.
     */

    // Statement: An instruction given to computer to perform something
    // Here System.out.println() is a statement. This statement used to print on the
    // console
    // We are passing an expression (2 * 3) to the predefined method. It calculates
    // an expression and print the value
    System.out.println(2 * 3);

    // Parameter: The value which is being passed to the method. Here (2 * 3) is a
    // parameter which is passed to the method System.out.println()

    // Method call syntax:
    // method_name(parameter)
    // Example: sum(2)

    // To print the passed parameter as it is using System.out.println()
    // We can use Strings. We need to enclose the parameter in double quotes ""
    // Strings will represented using double quotes.
    // Below will print 5 * 2 = 10 in console as it is. It won't calculate as they
    // are enclosed in the double quotes as Strings.
    System.out.println("5 * 2 = 10");

    // For expressions, space doesn't matter while calculating
    // Even though it has space, it will still calculate as return result
    System.out.println(3 * 4);

    // For strings, space matters. It will provide the space during printing
    System.out.println("Hello    World");
  }
}
