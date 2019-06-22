package com.andyliu.algorithm.sorts;

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
