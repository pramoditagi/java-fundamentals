package CoursePrograms;

public class EscapeCharacters {
  public static void main(String[] args) {
    /*
     * To escape characters, we need to use \ (back slash)
     * Print double quotes
     * Note: Escaping special characters doesn't mean it will skip them. It just
     * make sure no errors are thrown and special characters will be printed too
     * System.out.println("Hello \"World"); // Hello "World
     */

    // New line character (\n)
    // It will print the sentence into next line
    System.out.println("Hello\nWorld");
    // Output:
    // Hello
    // World

    // Tab (/t)
    // This will provide a tab space
    System.out.println("Hello\tWorld"); // Hello World

    // Printing \ back slash itself
    // If we want two slash, then 4 slash need to be given. It will double
    System.out.println("Hello \\ World"); // Hello \ World
  }
}
