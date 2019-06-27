package com.andyliu.algorithm.sorts;

/**
 * 总是循环向后排序，相邻两个数值比较。
 * 1. 如果左边大于右边，则交换位置。否则，进行下一个位置比对。
 * 2. 这样，最后面的数据将会先排好。
 */
public class BubbleSort {
    public static int[] bubbleStort(int[] a) {

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1])
                    swap(a, j);
        return a;
    }

    private static void swap(int[] a, int j) {
        int tmp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = tmp;
    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : bubbleStort(new int[]{23, 423, 3, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
