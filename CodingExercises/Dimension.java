package CodingExercises;

public class Dimension {
  private int feet;
  private int inches;

  public Dimension(int inches) {
    this.inches = inches;
  }

  public int getFeet() {
    if (inches < 0)
      return -1;
    this.feet = this.inches / 12;
    return this.feet;
  }

  public int getInches() {
    if (inches < 0)
      return -1;
    this.inches = this.inches % 12;
    return this.inches;
  }

  public static void main(String[] args) {
    Dimension dim = new Dimension(25);
    System.out.println(dim.getFeet());
    System.out.println(dim.getInches());
  }
}
