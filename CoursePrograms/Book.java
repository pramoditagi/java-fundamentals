package CoursePrograms;

public class Book {
  private int noOfCopies;

  Book(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  public int getNoOfCopies() {
    return noOfCopies;
  }

  public void setNoOfCopies(int noOfCopies) {
    if (noOfCopies > 0) {
      this.noOfCopies = noOfCopies;
    }
  }

  void increaseNoOfCopies(int byHowMuch) {
    setNoOfCopies(this.noOfCopies + byHowMuch);
  }

  void decreaseNoOfCopies(int byHowMuch) {
    setNoOfCopies(this.noOfCopies - byHowMuch);
  }

  public static void main(String[] args) {
    Book artOfComputerProgramming = new Book(100);
    Book effectiveJava = new Book(150);
    Book cleanCode = new Book(200);

    // Print initial values
    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());

    // Set new copies
    artOfComputerProgramming.setNoOfCopies(1000);
    effectiveJava.setNoOfCopies(800);
    cleanCode.setNoOfCopies(600);

    // Print updated copies
    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());

    // Increase copies
    artOfComputerProgramming.increaseNoOfCopies(100);
    effectiveJava.increaseNoOfCopies(150);
    cleanCode.increaseNoOfCopies(200);

    // Print updated copies
    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());

    // decrease copies
    artOfComputerProgramming.decreaseNoOfCopies(100);
    effectiveJava.decreaseNoOfCopies(150);
    cleanCode.decreaseNoOfCopies(200);

    // Print updated copies
    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());
  }
}
