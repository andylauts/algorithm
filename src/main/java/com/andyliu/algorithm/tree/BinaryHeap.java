package com.andyliu.algorithm.tree;

/**
 * 讲一个完全二叉树调整为一个最大堆和最小堆
 */
public class BinaryHeap {
    static void minHeap(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[i / 2]) {
                for (int t = i; t > 0; t /= 2) {
                    if (array[t] < array[t / 2]) {
                        int tmp = 0;
                        tmp = array[t];
                        array[t] = array[t / 2];
                        array[t / 2] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }

    private static void maxHeap(int[] array) {

    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 123, 423, 30, 234, 235, 23, 3};
        minHeap(array);
        maxHeap(array);

    }
}
