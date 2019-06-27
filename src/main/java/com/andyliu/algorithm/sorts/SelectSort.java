package com.andyliu.algorithm.sorts;

/**
 * 选择排序是选择最小的放到最前面。
 * 1. 如果当前位置是0，则向后选择最小的，放到第0个位置，其余数据顺延后排。
 * 2. 如果当前是第k个位置，则说明k-1的数据已经排好，则在k~n的位置选择最小的，放到k的位置上。其余顺延后排。
 * 3. 以此类推，知道排到最后一个位置。
 */
public class SelectSort {


    private static void swap(int[] a, int i, int k) {
        int tmp = a[i];
        a[i] = a[k];
        a[k] = tmp;
    }

    public static int[] selectSortBook(int[]a){
        int minIndex =0;
        for(int i=0;i<a.length;i++) {
            minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minIndex]>a[j])
                    minIndex = j;
            }
            swap(a,i,minIndex);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : selectSortBook(new int[]{1,23, 423, 3, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
