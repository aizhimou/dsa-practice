package top.asimov.codility.lesson2;

import java.util.Arrays;

public class PermMissingElem {

  public static void main(String[] args) {
    int[] A = {1, 3, 2, 5};
    // int result = 4;
    System.out.println("result: " + solution(A));
  }

  public static int solution(int[] A) {
    Arrays.sort(A);

    if (A.length == 0) {
      return 1;
    }

    for (int i = 0; i < A.length; i++) {

      if (A[0] > 1) {
        return 1;
      }

      if (i + 1 > A.length - 1) {
        return A[i] + 1;
      }
      if (A[i] + 1 != A[i + 1]) {
        return A[i] + 1;
      }
    }
    return 0;
  }
}
