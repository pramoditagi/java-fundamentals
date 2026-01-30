package CourseProblems;

public class StringWrapper {
  public static void main(String[] args) {
    System.out.println("Text".length()); // "Text" is instance of class String and length() is inbuilt method of String
                                         // class

    // String is special class. It doesn't need any constructor to create string.
    // Only below is enough
    // String str = "Text"; and String str = new String("Text"). both are same
    String str = "Text";

    // length(): Used to get length of the string.
    System.out.println(str.length()); // 4

    // charAt(index): Used to character at specific index. Return would be char ''
    // Index starts from 0
    System.out.println(str.charAt(1)); // 'e'

    String biggerString = "This is a lot of text";

    // substring(startingIndex): It will get string from mentioned index to complete
    // string
    System.out.println(biggerString.substring(3)); // s is a lot of text

    // substring(startingIndex, endingIndex): It will get string from mentioned
    // starting index to ending index
    // Note that startingIndex is inclusive and endingIndex is exclusive. Its like
    // endingIndex < (less than). Equal to not there.
    // Below it considered till l even though o is present at 11
    System.out.println(biggerString.substring(3, 11)); // s is a l

    // If we specify the index more than the actual string length, we will get
    // StringIndexOutOfBoundsException: Index 14 out of bounds for length 4
    // System.out.println("text".charAt(14));

    // indexOf(value): Used to get index of the passed value. Value can be string or
    // character
    System.out.println(biggerString.indexOf("lot")); // 10 as l is present at index 10 and returns first index
    System.out.println(biggerString.indexOf('i')); // 2 as it returns first occurrence of character index

    // lastIndexOf(value): gets last index of passed character
    System.out.println(biggerString.lastIndexOf('e')); // 18 as it gets last index of passed character

    // contains(value): This is used to check if string contains passed text or
    // character. Returns true or false
    System.out.println(biggerString.contains("lot"));

    // startsWith(value): This is used to check whether string starts with passed
    // string or character. Returns true or false based on condition.
    // Note: condition is case sensitive
    // startsWith("This") -> true
    // startsWith("this") -> false
    System.out.println(biggerString.startsWith("This"));

    // endsWith(value): This is used to check whether string ends with passed
    // string or character. Returns true or false based on condition.
    // Note: condition is case sensitive
    // endsWith("This") -> true
    // endsWith("this") -> false
    System.out.println(biggerString.endsWith("of"));

    // isEmpty(): This is used to check if string is empty or not
    // Returns true or false based on condition.
    String newString = "";
    System.out.println(newString.isEmpty());

    // equals(): This is used to check if 2 strings are equal or not.
    // Returns true or false based on condition.
    System.out.println("true".equals("true"));

    // equalsIgnoreCase(): This is used to check if 2 strings are equal or not.
    // It will ignore the case and compare.
    // Behind the scenes, it converts both strings to upper case and compares.
    // Returns true or false based on condition.
    System.out.println("true".equalsIgnoreCase("True"));

    // concat(value): This is used to concatenate(add) string with passed string.
    // Returns new string
    System.out.println("hello".concat(" world"));

    // toUpperCase(): This is used to convert the string to UPPER case letters
    System.out.println("hello".toUpperCase());

    // toLowerCase(): This is used to convert the string to lower case letters
    System.out.println("HeLLo".toLowerCase());

    // trim(): This is used to trim spaces present in starting and ending of string
    System.out.println("  hello  ".trim());

    // join("delimiter", "string1", "string2" ..): This is used to join passed
    // individual strings to make one single separated by delimiter
    System.out.println(String.join(",", "a", "b", "c"));
    // Note: If passed string is only 1, it will return same.
    System.out.println(String.join(",", "a"));

    // replace(oldValue, newValue): This is used to replace old value with new value
    // for the given string and return modified value
    System.out.println("hello".replace("el", "12"));

  }
}
