package com.thoughtworks;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    /**
     * 倒序打印给定数组,打印格式为: [3,2,1]
     */
    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        System.out.print("[");
        for (int end = array.length - 1; end >= 0; end--) {
            if (end != 0) {
                System.out.print(array[end] + ",");
            } else {
                System.out.print(array[end] + "]");
            }
        }
    }
}
