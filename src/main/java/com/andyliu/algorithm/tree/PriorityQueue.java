package com.andyliu.algorithm.tree;

public class PriorityQueue {

    public static void priorityqueue(int[] array) {
        int maxlen = array.length - 1;

        for (int i = maxlen; i >= 0; i--) {
            System.out.println(array[0]);
            array[0] = array[i];
            int j = 0;
            while (j < i) {
                if (array[j] >= array[2 * j] && array[j] >= array[2 * j + 1])
                    break;
                if (array[2 * j] > array[2 * j + 1]) {

                    int tmp = array[j];
                    array[j] = array[2 * j];
                    array[2 * j] = tmp;
                    j=2*j;
                } else {

                    int tmp = array[j];
                    array[j] = array[2 * j + 1];
                    array[2 * j + 1] = tmp;
                    j=2*j+1;

                }

            }
        }


    }


    public static void main(String[] args) {
        int[] array = new int[]{1, 23, 423, 3, 234, 235, 23, 3};
        BinaryHeap.minHeap(array);
        priorityqueue(array);

    }
}
