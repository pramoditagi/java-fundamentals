package CoursePrograms;

public class CharacterDataType {
  public static void main(String[] args) {
    /*
     * Character (char)
     * This is used to store single character.
     * It should be enclosed within single quotes ''
     * It cannot have more than 1 character
     * Range: -128 to 127
     */

    // Example:
    char grade = 'A';
    System.out.println("Grade of a student: " + grade);

    /*
     * Unicode: These are different kind of special characters which can be
     * represented using char
     * 
     * Like Roman, Latin etc.
     * 
     */

    // For unicode characters, it should start with /u
    // Refer google for different kind of unicode characters and their values
    char ch = '\u0022';
    System.out.println(ch); // ""

    /*
     * Note:
     * Numbers can be used to represent alphabets and numbers as char
     * 
     * Numbers:
     * - 47 -> '0'
     * - 56 -> '9'
     * 
     * UpperCase Alphabets
     * - 65 -> 'A'
     * - 90 -> 'Z'
     * 
     * lowerCase alphabets
     * - 97 -> 'a'
     * - 122 -> 'z'
     * 
     */
    char ch1 = 48;
    System.out.println(ch1); // '0'

    char ch2 = 65;
    System.out.println(ch2); // 'A'

    char ch3 = 97;
    System.out.println(ch3); // 'a'

    // We can perform operations on char using operators
    ch++;
    ch += 5; // Here ch will be char and 5 is integer, the result will be integer
    // as Integer is greater than char

    // Casting character to integer
    // This will help us to find the alphabet number
    int number = (int) ch;
    System.out.println(number);
  }
}
