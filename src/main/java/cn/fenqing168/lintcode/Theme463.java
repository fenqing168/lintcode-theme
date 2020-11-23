package cn.fenqing168.lintcode;

import java.util.Arrays;

/**
 * @author fenqing
 */
public class Theme463 {

    /**
     * @param a: an integer array
     * @return: nothing
     */
    public static void sortIntegers(int[] a) {
        // write your code here
        for (int i = 0; i < a.length; i++) {
            for (int i1 = i; i1 < a.length; i1++) {
                if(a[i] > a[i1]){
                    int temp = a[i];
                    a[i] = a[i1];
                    a[i1] = temp;
                }

            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] ints = {3, 99,1,4,5,-1, 56};
        sortIntegers(ints);
        System.out.println(Arrays.toString(ints));
    }

}
