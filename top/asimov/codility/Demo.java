package top.asimov.codility;

import java.util.Arrays;

/**
 * Codility demo task.
 */
public class Demo {
    /**
     * Write a function:
     * <p>
     * class Solution { public int solution(int[] A); }
     * <p>
     * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
     * 给定一个 N 个元素的数组 A，返回数组 A 中未出现的最小正整数
     * <p>
     * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
     * <p>
     * Given A = [1, 2, 3], the function should return 4.
     * <p>
     * Given A = [−1, −3], the function should return 1.
     * <p>
     * Write an efficient algorithm for the following assumptions:
     * <p>
     * N is an integer within the range [1..100,000];
     * each element of array A is an integer within the range [−1,000,000..1,000,000].
     */
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2}; // => 5
        int[] B = {1, 2, 3}; // => 4
        int[] C = {-1, -3}; // => 1
        System.out.println("{1, 3, 6, 4, 1, 2}: " + solution(A));
        System.out.println("{1, 2, 3}: " + solution(B));
        System.out.println("{-1, -3}: " + solution(C));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                A[i] = 0;
            }
        }

        int x = 1;
        for (int i = 0; i < A.length; i++) {

            if (x < A[i]) {
                return x;
            }

            x = A[i] + 1;

            if (i + 1 > A.length - 1) {
                return x;
            }

            if (x < A[i + 1]) {
                return x;
            }
        }
        return x;
    }
}
