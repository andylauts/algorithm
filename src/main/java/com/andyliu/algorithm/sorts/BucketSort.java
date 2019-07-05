package com.andyliu.algorithm.sorts;

import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    public static int[] bucketsort(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int x = 1; x < array.length; x++)
            if (min > array[x])
                min = array[x];
            else if (max < array[x])
                max = array[x];
            int len = max/10-min/10+1;
            List<List<Integer>> l = new LinkedList<>();
            for(int i=0;i<len;i++)
                l.add(new LinkedList<Integer>());
            for(int j=0;j<array.length;j++)
                l.get(array[j]/10).add(array[j]);
            Integer m =0;
            for(int i=0;i<len;i++) {
             List<Integer> ll =    InsertSort.selectSortBook(l.get(i));
             for(Integer ii:ll)
                 array[m++] = ii;
            }
            return array;
    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : bucketsort(new int[]{23, 423, 3, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
