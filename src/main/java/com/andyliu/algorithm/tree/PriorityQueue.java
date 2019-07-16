package com.andyliu.algorithm.tree;

public class PriorityQueue {

    public static void priorityqueue(int[] array) {
        int maxlen = array.length - 1;

        for (int i = maxlen; i >= 0; i--) {
            System.out.println(array[0]);
            if (i == 0)
                break;
            array[0] = array[i];
            int j = 0;
            while (2 * j + 1 <= i) {
                if (array[j] <= array[2 * j + 1] && (((2 * j + 2 <= i) && array[j] <= array[2 * j + 2]) || 2 * j + 2 > i))
                    break;
                if ((2 * j + 2 > i)||(2 * j + 2 <= i && array[2 * j + 1] < array[2 * j + 2])) {
                    int tmp = array[j];
                    array[j] = array[2 * j + 1];
                    array[2 * j + 1] = tmp;
                    j = 2 * j + 1;
                } else {
                    int tmp = array[j];
                    array[j] = array[2 * j + 2];
                    array[2 * j + 2] = tmp;
                    j = 2 * j + 2;
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
