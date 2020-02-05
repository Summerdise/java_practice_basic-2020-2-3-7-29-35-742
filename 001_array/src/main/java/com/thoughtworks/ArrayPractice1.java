
package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    /**
     * 倒序打印给定数组,打印格式为: [3,2,1]
     */
    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(result));
    }
}
