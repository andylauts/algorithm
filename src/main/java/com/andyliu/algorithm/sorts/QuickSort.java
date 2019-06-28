package com.andyliu.algorithm.sorts;

/**
 * 快速排序是取出一个数字 用其分割出两个数组分别在这个数字的左右两边。
 * 左边小，右边大，再对左右两边进行分别递归排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 423, 3, 234, 235, 23, 3};
        quicksort(arr, 0, arr.length - 1);
        for (int x : arr)
            System.out.println(x);
    }

    public static void quicksort(int array[], int start, int end) {
        if (start >= end)
            return;
        int midindex = start;
        for (int i = start + 1; i <= end; i++)
            if (array[midindex] > array[i])
                moveright(array, midindex++, i);
        quicksort(array, start, midindex - 1);
        quicksort(array, midindex + 1, end);
    }

    private static void moveright(int[] array, int midindex, int i) {
        int tmp = array[i];
        for (int n = i; n > midindex; n--)
            array[n] = array[n - 1];
        array[midindex] = tmp;
    }

}
