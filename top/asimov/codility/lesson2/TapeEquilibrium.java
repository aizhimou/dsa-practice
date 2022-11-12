package top.asimov.codility.lesson2;

import java.util.ArrayList;
import java.util.List;

/**
 * https://app.codility.com/c/run/trainingNFVD7B-7MM/
 */
public class TapeEquilibrium {

  public static void main(String[] args) {
    int[] A = {3, 1, 2, 4, 3};
    // int result = 1;
    System.out.println("result: " + solution(A));
  }

  public static int solution(int[] A) {
    List<Integer> totals = new ArrayList<>();
    for (int p = 1; p < A.length; p++) {

      int leftSum = 0;
      for (int i = 0; i < p; i++) {
        leftSum += A[i];
      }

      int rightSum = 0;
      for (int i = p; i < A.length; i++) {
        rightSum += A[i];
      }

      totals.add(Math.abs(leftSum - rightSum));
    }
    return totals.stream().reduce(Integer::min).orElse(0);
  }

}
