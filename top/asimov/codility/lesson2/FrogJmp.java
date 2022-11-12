package top.asimov.codility.lesson2;

public class FrogJmp {

  public static void main(String[] args) {
    int X = 10, Y = 85, D = 30;
    // int result = 3;
    System.out.println("result: " + solution(X, Y, D));
  }

  public static int solution(int X, int Y, int D) {
    int distant = Y - X;
    return distant % D > 0 ? distant/D + 1 : distant/D;
  }

}
