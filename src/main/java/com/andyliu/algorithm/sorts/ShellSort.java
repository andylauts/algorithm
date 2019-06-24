package com.andyliu.algorithm.sorts;

public class ShellSort {

    public static int[] shellsort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex+gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex+gap] = temp;

            }
            gap/=2;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : shellsort(new int[]{23, 423, 3, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
