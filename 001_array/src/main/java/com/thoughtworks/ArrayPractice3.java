package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        int resLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] != 0) {
                resLength++;
            }
        }
        int[] result = new int[resLength];
        for (int i = 0; i < array.length; i++) {
            int index = 0;
            if (array[0] != 0) {
                result[index] = array[i];
                index++;
            }
        }
        return null;
    }
}
