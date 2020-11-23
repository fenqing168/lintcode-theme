package cn.fenqing168.lintcode;

/**
 * @author fenqing
 */
public class Theme283 {

    /**
     * @param num1: An integer
     * @param num2: An integer
     * @param num3: An integer
     * @return: an interger
     */
    public static int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here
        int max = num1;
        if(max < num2){
            max = num2;
        }
        if(max < num3){
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxOfThreeNumbers(1, 2, 3));
    }

}
