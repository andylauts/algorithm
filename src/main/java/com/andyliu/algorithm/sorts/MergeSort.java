package com.andyliu.algorithm.sorts;

/**
 * 归并排序是先将数组分开分别进行排序
 * 排序回来后再进行整合
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 423, 3, 234, 235, 23, 3};
        mergesort(arr);
        for (int x : arr)
            System.out.println(x);
    }

    public static void mergesort(int array[]) {
        int start = 0;
        int end = array.length - 1;
        calcutesort(array, start, end);
    }

    public static void calcutesort(int[] array, int start, int end) {
        if (start >= end)
            return;

        int start1 = start;
        int arrlen = end - start + 1;
        int[] arr = new int[arrlen];
        int mid = start +((end-start) >> 1);
        int start2 = mid + 1;
        calcutesort(array, start, mid);
        calcutesort(array, start2, end);
        int k = 0;//临时数组位置
        while (start <= mid && start2 <= end) {
            arr[k++] = array[start] < array[start2] ? array[start++] : array[start2++];
        }
        while (start <= mid)
            arr[k++] = array[start++];
        while (start2 <= end)
            arr[k++] = array[start2++];
        for (int x = 0; x < arr.length; x++) {
            array[start1 + x] = arr[x];
        }
    }
}
