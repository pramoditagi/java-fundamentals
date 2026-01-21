package CodingExercises;

public class RGBColor {
  private int red;
  private int green;
  private int blue;

  public RGBColor(int red, int green, int blue) {
      this.red = red;
      this.green = green;
      this.blue = blue;
  }

  public int getRed() {
      return red;
  }

  public int getGreen() {
      return green;
  }

  public int getBlue() {
      return blue;
  }

  public void invert() {
      red = 255 - red;
      green = 255 - green;
      blue = 255 - blue;
  }

  public static void main(String[] args) {
      RGBColor color = new RGBColor(255, 0, 0);
      System.out.println(color.getRed());
      System.out.println(color.getGreen());
      System.out.println(color.getBlue());

      color.invert();

      System.out.println(color.getRed());
      System.out.println(color.getGreen());
      System.out.println(color.getBlue());
  }
}
