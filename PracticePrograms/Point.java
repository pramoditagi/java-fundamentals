package PracticePrograms;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // Implement the method to move the point by dx and dy in x and y
  // direction respectively
  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }

  // Implement the method to calculate the distance from this point to
  // another point
  public double distanceTo(Point other) {
    return Math.sqrt((other.x - this.x) * (other.x - this.x) + ((other.y - this.y) * (other.y - this.y)));
  }

  public static void main(String[] args) {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(6, 8);

    p1.move(1, 1);
    double distance = p1.distanceTo(p2);
    System.out.println(distance);

  }
}
