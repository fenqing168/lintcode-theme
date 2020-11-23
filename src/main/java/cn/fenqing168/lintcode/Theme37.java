package cn.fenqing168.lintcode;

/**
 * @author fenqing
 */
public class Theme37 {

    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public static int reverseInteger(int number) {
        // write your code here
        String str = String.valueOf(number);
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1, length = chars.length; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return Integer.parseInt(String.valueOf(chars));
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }

}
