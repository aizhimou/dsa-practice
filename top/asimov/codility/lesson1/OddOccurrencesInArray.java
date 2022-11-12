package top.asimov.codility.lesson1;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

  public static void main(String[] args) {
    int[] A = {9, 3, 9, 3, 9, 7, 9};
    // int result = 7;
    System.out.println("result: " + solution(A));
  }

  public static int solution(int[] A) {
    Map<Integer, Long> collect = Arrays.stream(A).boxed().collect(Collectors.groupingBy(p -> p, Collectors.counting()));
    for (Entry<Integer, Long> entry : collect.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        return entry.getKey();
      }
    }
    return 0;
  }

}
