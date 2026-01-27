package CourseProblems;

public class Book {

  public Book(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  private int noOfCopies;

  void setNoOfCopies(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  int getNoOfCopies() {
    return noOfCopies;
  }

  void increaseNoOfCopies(int howMuch) {
    noOfCopies += howMuch;
  }

  public static void main(String[] args) {
    Book artOfComputerProgramming = new Book(10);
    Book effectiveJava = new Book(12);
    Book cleanCode = new Book(14);

    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());

    artOfComputerProgramming.setNoOfCopies(150);
    effectiveJava.setNoOfCopies(120);
    cleanCode.setNoOfCopies(100);

    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());

    artOfComputerProgramming.increaseNoOfCopies(10);
    effectiveJava.increaseNoOfCopies(10);
    cleanCode.increaseNoOfCopies(10);

    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());

  }
}
