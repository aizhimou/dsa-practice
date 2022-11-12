package top.asimov.codility.lesson1;

import java.util.Arrays;

public class CyclicRotation {

  public static void main(String[] args) {
    int[] A = {9, 7, 6, 3, 8};
    // int result = {9, 7, 6, 3, 8};
    int K = 3;
    System.out.println("result: " + Arrays.toString(solution(A, K)));
  }

  public static int[] solution(int[] A, int K) {
    if (K == 0) {
      return A;
    }
    int[] result = rotation(A);
    for (int i = 0; i < K - 1; i++) {
      result = rotation(result);
    }
    return result;
  }

  public static int[] rotation(int[] A) {
    int length = A.length;
    if (length == 1 || length == 0) {
      return A;
    }
    int[] result = new int[length];
    result[0] = A[length - 1];
    for (int i = 0; i < A.length - 1; i++) {
      result[i + 1] = A[i];
    }
    return result;
  }

}
