package com.andyliu.algorithm.sorts;

public class SelectSort {
    public static int[] selectSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int k = i;
            int dvalue = 0;
            for (int j = i; j < a.length; j++)
                if (a[i] - a[j] > dvalue) {
                    dvalue = a[i] - a[j];
                    k = j;
                }
            if (i != k)
                swap(a, i, k);
        }
        return a;
    }

    private static void swap(int[] a, int i, int k) {
        int tmp = a[i];
        a[i] = a[k];
        a[k] = tmp;
    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : selectSort(new int[]{1,23, 423, 3, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
