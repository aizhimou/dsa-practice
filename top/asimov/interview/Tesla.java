package top.asimov.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * 2022.11，面试特斯拉算法题
 */
public class Tesla {

    /**
     * 2022-11-16 笔试算法题
     * <p>
     * You are given an array A of integers. Find the maximum number of non-intersecting segments of length 2 (two adjacent elements), such that segments have an equal sum. For example, given A = [10, 1, 3, 1, 2, 2, 1, 0, 4] there are three non-intersecting segments, each whose sum is equal to 4: (1, 3), (2, 2), (0,4). Another three non-intersecting segments are (3, 1), (2, 2), (0,4).
     * 给你一个整数数组 A，找到长度为 2（两个相邻元素）的非相交段的最大数量，使得段的总和相等。例如，给定 A = [10, 1, 3, 1, 2, 2, 1, 0, 4] 有三个不相交的线段，每个线段的和等于 4：(1, 3), (2, 2), (0,4)。 另外三个不相交的线段是 (3, 1), (2, 2), (0,4)
     * <p>
     * Write a function:
     * 编写一个函数：
     * <p>
     * that, given an array A of N integers, returns the maximum number of segments with equal sums.
     * 给定一个包含 N 个整数的数组 A，返回总和相等的最大段数。
     * <p>
     * Examples:
     * <p>
     * 1. Given A = [10, 1, 3, 1, 2, 2, 1, 0, 4], the function should return 3, as explained above.
     * 给定 A = [10, 1, 3, 1, 2, 2, 1, 0, 4]，应该返回 3，如上所述
     * <p>
     * 2. Given A = [5, 3, 1, 3, 2, 3], the function should return 1. Each sum of two adjacent elements is different from the others.
     * 给定 A = [5, 3, 1, 3, 2, 3]，应该返回 1，两个相邻元素的总和各不相同。
     * <p>
     * 3. Given A = [9, 9, 9, 9, 9], the function should return 2.
     * 给定 A = [9, 9, 9, 9, 9]，应该返回 2，分别是 (9,9) 和 (9,9)
     * <p>
     * 4. Given A = [1, 5, 2, 4, 3, 3], the function should return 3. There are three segments: (1, 5), (2,4), (3,3) whose sums are equal to 6.
     * A = [1, 5, 2, 4, 3, 3], 应该返回 3，有三个段 (1,5)，(2,4)，(3,3) 的和为 6
     * <p>
     * Write an ****efficient**** algorithm for the following assumptions:
     * 为以下假设的情况编写一个高效的算法
     * <p>
     * - N is an integer within the range [2 - 100,000]
     * <p>
     * - each element of array A is an integer within the range [0 - 1,000,000,000]
     */
    public static int solution1(int[] A) {
        Map<Integer, Integer> sumIndex = new HashMap<>();
        Map<Integer, Integer> sumCount = new HashMap<>();

        for (int i = 0; i < A.length - 1; i++) {
            int sum = A[i] + A[i + 1];
            Integer lastIndex = sumIndex.get(sum);
            Integer lastCount = sumCount.get(sum);
            if (lastIndex == null) {
                sumCount.put(sum, 1);
                sumIndex.put(sum, i);
            } else {
                if (lastIndex + 1 != i) {
                    sumCount.put(sum, lastCount + 1);
                    sumIndex.put(sum, i);
                }
            }
        }

        int x = 1;
        for (Integer value : sumCount.values()) {
            if (value > x) {
                x = value;
            }
        }

        return x;
    }

    public static void test1() {
        int[] A = {10, 1, 3, 1, 2, 2, 1, 0, 4}; //3
        int[] B = {9, 9, 9, 9, 9}; //2
        int[] C = {5, 3, 1, 3, 2, 3}; //1
        int[] D = {1, 5, 2, 4, 3, 3}; //3
        System.out.println("result: " + solution1(A));
        System.out.println("result: " + solution1(B));
        System.out.println("result: " + solution1(C));
        System.out.println("result: " + solution1(D));
    }

    /**
     * 2022-11-17 面试算法题
     * <p>
     * 1.给定一个字符串：A&&B&&C，将 A 替换为 (C||D)，将 B 替换为 (E||F)，得到结果：(C||D)&&(E||F)&&C
     * 2.给定一个字符串：A&&(AB||C)&&ABC，将 A 替换为 (C||D)，将 AB 替换为 (E||F)，得到结果：(C||D)&&((E||F)||C)&&ABC
     * 关键点：ABC 是一个整体，不能单独将其中的 A 或者 AB 替换
     * <p>
     * 编写一个方法，实现替换任意一个字符串中给定字母的替换
     */
    public static String solution2(String message, Map<String, String> replacements) {
        return null;
    }

    public static void test2() {
        String message = "A&&(AB||C)&&ABC";
        Map<String, String> replacements = new HashMap<String, String>(){
            {
                put("A", "(C||D)");
                put("B", "(E||F)");
            }
        };
        String result = solution2(message, replacements);
        System.out.println(result);
    }

    public static void main(String[] args) {
        test1();
    }

}
