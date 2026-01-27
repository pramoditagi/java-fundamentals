package CodingExercises;

public class ValidTriangle {
  public static void main(String[] args) {
    ValidTriangle valid = new ValidTriangle();
    System.out.println(valid.isValidTriangle(55, 65, 60));
    System.out.println(valid.isRightAngled(3, 5, 4));
  }

  public boolean isValidTriangle(int angle1, int angle2, int angle3) {
    if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
      return false;
    }
    return (angle1 + angle2 + angle3 == 180);
  }

  public boolean isRightAngled(int side1, int side2, int side3) {
    if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
      return false;
    }

    if ((side3 * side3) == (side1 * side1) + (side2 * side2)) {
      return true;
    }

    if ((side1 * side1) == (side2 * side2) + (side3 * side3)) {
      return true;
    }

    if ((side2 * side2) == (side1 * side1) + (side3 * side3)) {
      return true;
    }

    return false;
  }
}
