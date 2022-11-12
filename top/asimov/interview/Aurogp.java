package top.asimov.interview;

/**
 * 晨曦控股算法题
 */
public class Aurogp {

    /**
     * 写一个函数，将字符串 "hello this is a computer" 转换成 "computer a is this hello"
     */
    public static String solution(String target, String delimiter) {
        String[] split = target.split(delimiter);
        int length = split.length;
        String[] result = new String[length];
        int j = length;
        for (String value : split) {
            result[j - 1] = value;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s).append(delimiter);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String message = "hello this is a computer";
        String delimiter = " ";
        System.out.println("input: " + message);
        System.out.println("output: " + solution(message, delimiter));
    }
}
