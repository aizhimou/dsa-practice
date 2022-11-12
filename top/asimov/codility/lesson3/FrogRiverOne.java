package top.asimov.codility.lesson3;

public class FrogRiverOne {

  public static void main(String[] args) {
    int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
    int X = 5;
    // int result = 6;
    System.out.println("result: " + solution(X, A));

  }

  public static int solution(int X, int[] A) {
    for (int i = 0; i < A.length; i++) {
      if (A[i] == X) {
        return i;
      }
    }
    return -1;
  }

}
