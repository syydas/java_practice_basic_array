package com.thoughtworks;

public class ArrayPractice2 {

    /**
     * 把给定数组中的最大值保存到数组中的第1个元素且原第一个数换到最大值的位置
     */
    public static int[] exchange() {
        int[] array = new int[]{10, 8, 1, 7, 0, 20, 16, 19};
        for (int max = 0; max < array.length; max++) {
            if (array[max] > array[0]) {
                int temp = array[0];
                array[0] = array[max];
                array[max] = temp;
            }
        }
        return array;
    }
}
