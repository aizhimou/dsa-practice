package top.asimov.interview;

/**
 * 晨曦控股算法题
 */
public class Aurogp {

    /**
     * 写一个函数，将字符串 "quick fox jumps over the lazy dog" 转换成 "dog lazy the over jumps fox quick"
     */
    public static String solution(String target, String delimiter) {
        StringBuilder result = new StringBuilder();
        String[] split = target.split(delimiter);
        for (int i = split.length - 1; i >= 0; i--) {
            result.append(split[i]).append(delimiter);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String message = "quick fox jumps over the lazy dog";
        String delimiter = " ";
        System.out.println("input: " + message);
        System.out.println("output: " + solution(message, delimiter));
    }
}
