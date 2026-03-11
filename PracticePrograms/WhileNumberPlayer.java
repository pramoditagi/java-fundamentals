package PracticePrograms;

public class WhileNumberPlayer {

  private int number;

  public WhileNumberPlayer(int number) {
    this.number = number;
  }

  void printSquaresUpToLimit() {
    int i = 1;
    while ((i * i) < number) {
      System.out.print((i * i) + " ");
      i++;
    }
    System.out.println("");
  }

  void printCubesUpToLimit() {
    int i = 1;
    while ((i * i * i) < number) {
      System.out.print((i * i * i) + " ");
      i++;
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    WhileNumberPlayer whileNumberPlayer = new WhileNumberPlayer(30);
    whileNumberPlayer.printSquaresUpToLimit();
    whileNumberPlayer.printCubesUpToLimit();
  }

}
