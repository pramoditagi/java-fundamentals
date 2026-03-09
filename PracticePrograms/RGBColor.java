package PracticePrograms;

public class RGBColor {
  // The Red, Green, Blue color values range from 0 to 255.
  private int red;
  private int green;
  private int blue;

  public RGBColor(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed() {
    return this.red;
  }

  public int getGreen() {
    return this.green;
  }

  public int getBlue() {
    return this.blue;
  }

  // Method to invert the color. The inversion is done by subtracting each color
  // component from 255.
  public void invert() {
    // red
    if (this.red - 255 < 0) {
      this.red = 255 - this.red;
    } else {
      this.red -= 255;
    }

    // green
    if (this.green - 255 < 0) {
      this.green = 255 - this.green;
    } else {
      this.green -= 255;
    }

    // blue
    if (this.blue - 255 < 0) {
      this.blue = 255 - this.blue;
    } else {
      this.blue -= 255;
    }
  }

  public static void main(String[] args) {
    RGBColor rGBColor = new RGBColor(255, 0, 0);
    System.out.println(rGBColor.getRed());
    System.out.println(rGBColor.getGreen());
    System.out.println(rGBColor.getBlue());
    rGBColor.invert();
    System.out.println(rGBColor.getRed());
    System.out.println(rGBColor.getGreen());
    System.out.println(rGBColor.getBlue());
  }
}
