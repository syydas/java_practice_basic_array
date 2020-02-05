package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] insertArr = new int[array.length + 1];
        int index = array.length;
        for (int i = 0; i < array.length; i++) {
            if (number < array[i]) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < insertArr.length; i++) {
            if (index > i) {
                insertArr[i] = array[i];
            } else if (index == i) {
                insertArr[i] = number;
            } else {
                insertArr[i] = array[i - 1];
            }
        }
        return insertArr;
    }
}
