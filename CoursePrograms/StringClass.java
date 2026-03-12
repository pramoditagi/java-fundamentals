package CoursePrograms;

public class StringClass {
  public static void main(String[] args) {
    /*
     * String:
     * String is an inbuilt reference type
     * 
     * Whenever we create any strings, it becomes an "instance" or "object"
     * Example:
     * Below "Test" string becomes an instance or object and on that we can perform
     * any String operations
     */
    "Test".length();

    // Creation of String:
    String str = "Test";
    // this is same as
    // String str = new String("Test");
    // We can use shortcut String str = "Test"; to create Strings
    // Basically, this creates an object and we can perform operations on that

    /*
     * length(): This method calculates the length of the given string and returns
     * number. It calculates number of characters present in String
     * 
     * Example:
     * "Test".length()
     * -> 4
     */
    System.out.println("Test".length());

    /*
     * charAt(value): This method returns the character which is present at given
     * index. Note that, index starts from 0
     * Returns character value and return type will be 'char'
     * 
     * index: It is a position of each character
     * Example: "abc"
     * index 0 -> a
     * index 1 -> b
     * index 2 -> c
     * 
     * Example:
     * "Test".charAt(2)
     * -> 's'
     * 
     * Note: If we provide index value greater than length of string, it will throw
     * IndexOutOfBond exception
     */
    System.out.println("Test".charAt(2));

    /*
     * substring(start)
     * or
     * substring(start, end)
     * 
     * This method is used to get the substring (part) of the string.
     * It can be used in 2 ways
     * 
     * substring(start): If we provide only 1 index, from that index to till end of
     * string it will consider
     * 
     * Example:
     * System.out.println("Test".substring(1));
     * -> "est"
     * 
     * substring(start, end): If we provide both start and end indexes, from start
     * (inclusive) to end (exclusive) string it will consider
     * 
     * Example:
     * System.out.println("Test 123".substring(5, 8));
     * -> "123"
     * 
     * Here we have provided 8 as 8 is exclusive and we want end of the string index
     * as well. If we provide 7, it will consider 7 - 1 = 6.
     * Only 12 will get printed
     * 
     * Note: If we provide index value greater than length of string, it will throw
     * IndexOutOfBond exception
     */
    System.out.println("Test".substring(1));
    System.out.println("Test 123".substring(5, 8));

    String someString = "this is a lot of text again";

    /*
     * contains("str"): This method is used to check with whether the passed string
     * or text is present in the given string or not
     * 
     * Returns true or false based on condition
     * 
     * Example: someString.contains("lot")
     * -> true
     */
    System.out.println(someString.contains("lot"));

    /*
     * indexOf("str"): This method is used to get the index of passed string or
     * character. It will return the index of "first" occurrence string or character
     * 
     * Returns integer value of the index
     * 
     * Example: someString.indexOf("lot")
     * -> 10
     */
    System.out.println(someString.indexOf("lot"));

    /*
     * lastIndexOf("str"): This method is used to get the index of passed string or
     * character. It will return the index of "last" occurrence string or character
     * 
     * Returns integer value of the index
     * 
     * Example: someOtherString.lastIndexOf("lot")
     * -> 23
     * 
     * Notice that even though 2 "lot" are present, lastIndexOf will consider last
     * value
     */
    String someOtherString = "this is a lot of text, lot";
    System.out.println(someOtherString.lastIndexOf("lot"));

    /*
     * startsWith("str"): This method is used to check whether string starts with
     * passed "str" or character or not. It may not be exactly same. It will act as
     * a regex
     * 
     * Returns boolean true or false based on condition
     * 
     * Example: someOtherString.startsWith("this")
     * -> true
     * 
     */
    System.out.println(someOtherString.startsWith("this"));

    /*
     * endsWith("str"): This method is used to check whether string ends with
     * passed "str" or character or not. It may not be exactly same. It will act as
     * a regex
     * 
     * Returns boolean true or false based on condition
     * 
     * Example: someOtherString.endsWith("ot")
     * -> true
     * 
     */
    System.out.println(someOtherString.endsWith("ot"));

    /*
     * isEmpty(): This method is used to check with String is empty or not.
     * Empty is denoted by "";
     * 
     * Return boolean true or false based on the condition
     * 
     * Example:
     * System.out.println(stringEmpty.isEmpty());
     * -> true
     * 
     * System.out.println("Hello".isEmpty());
     * -> false
     */
    String stringEmpty = "";
    System.out.println(stringEmpty.isEmpty());

    /*
     * equals(): This method is used to check if two strings are equal or not. Here
     * it's case sensitive.
     * 
     * Equal refers to same in characters, length and case.
     * 
     * Returns boolean true or false based on the condition
     * "Test".equals("test");
     * -> false
     * 
     * "Test".equals("Test");
     * -> true
     */
    System.out.println("Test".equals("test"));
    System.out.println("Test".equals("Test"));

    /*
     * equalsIgnoreCase(): This method is used to check if two strings are equal or
     * not. Here it's case insensitive.
     * 
     * Equal refers to same in characters, length and but not the case.
     * 
     * Returns boolean true or false based on the condition
     * "Test".equalsIgnoreCase("test");
     * -> true
     * 
     * "Test".equalsIgnoreCase("Test123");
     * -> false
     * 
     * Note: Behind the scenes, it will convert both the strings to uppercase and
     * compare them
     */
    System.out.println("Test".equalsIgnoreCase("test"));
    System.out.println("Test".equalsIgnoreCase("Test123"));

    // Note: Important!
    // Strings are immutable (Cannot be changed). Once the value is assigned to a
    // variable, it cannot be changed

    /*
     * concat("str"): This method is used to concatenate the string with the passed
     * string. It will return new string
     * 
     * Example: "test".concat("ing");
     * -> "testing"
     */
    System.out.println("test".concat("ing"));

    /*
     * trim(): This method is used to remove the spaces which are present at the
     * front and rear. In between spaces will not be removed
     * 
     * This returns trimmed string
     * 
     * Example: "test ".trim();
     * -> "test"
     */
    System.out.println("  test ".trim());

    /*
     * toUpperCase(): This method is used to convert string to "UPPERCASE"
     * characters and returns new string
     * 
     * This returns a new string in UPPERCASE characters
     * 
     * Example: "test".toUpperCase();
     * -> "TEST"
     */
    System.out.println("test".toUpperCase());

    /*
     * toLowerCase(): This method is used to convert string to "lowercase"
     * characters and returns new string
     * 
     * This returns a new string in lowercase characters
     * 
     * Example: "TesT".toLowerCase();
     * -> "test"
     */
    System.out.println("test".toLowerCase());

    /*
     * replace("oldValue", "newValue"): This method is used replace the old passed
     * string with new passed string.
     * 
     * This returns modified string
     * 
     * Example: "HeLLO".replace("LLO", "llo")
     * -> "Hello"
     */
    System.out.println("HeLLO".replace("LLO", "llo"));

    /*
     * join("delimiter", "chars"): This is the "Static" method used to join the
     * characters by using delimiter passed
     * 
     * Delimiter can be anything
     * Characters should be separated by comma(,) and they should be in String
     * 
     * This returns a new String
     * 
     * Example: String.join(".", "a", "b", "c", "d")
     * -> "a.b.c.d"
     */
    System.out.println(String.join("a", "a", "b", "c", "d"));

    /*
     * StringBuffer: StringBuffer is the special class which can be used to
     * perform String operations.
     * 
     * The main thing to note here is, StringBuffers are mutable. It means, strings
     * created using StringBuffers can be mutated (Can be changed).
     * 
     * Same thing is not possible in String class
     * 
     */
    StringBuffer sb = new StringBuffer("String");
    System.out.println(sb.append("Abc"));
    System.out.println(sb);
    // We can see that sb returns modified value. It means we can modify the string
    // variable using StringBuffer

    /*
     * StringBuilder: StringBuilder is the special class which can be used to
     * perform String operations.
     * 
     * Note:!!! StringBuffer and StringBuilder both are same. Differ in usages
     * 
     * The main thing to note here is, StringBuilder are mutable. It means, strings
     * created using StringBuilder can be mutated (Can be changed).
     * 
     * Same thing is not possible in String class
     * 
     */
    StringBuilder sb1 = new StringBuilder("String");
    System.out.println(sb1.append("Abc"));
    System.out.println(sb1);
    // We can see that sb1 returns modified value. It means we can modify the string
    // variable using StringBuilder

    /*
     * Difference between StringBuffer and StringBuilder
     * 
     * StringBuffer:
     * 
     * 1. Mutable
     * 2. Synchronized (Thread safe) [Multiple threads]
     * 3. Slow
     * 4. Less memory efficient
     * 
     * StringBuilder:
     * 
     * 1. Mutable
     * 2. Not Synchronized (Single thread)
     * 3. Fast
     * 4. More memory efficient
     * 
     * Note 1: If we are concatenating more Strings, go for either StringBuffer or
     * StringBuilder.
     * 
     * Note 2: If we are not using multi threading, go for String Builder
     */
  }
}
