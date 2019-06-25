package com.andyliu.algorithm.sorts;

public class ShellSort {

    public static int[] shellsortbook(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;

            }
            gap /= 2;
        }
        return array;
    }

    public static int[] shellsorthand(int[] array) {
        int len = array.length;
        int temp = len / 2;
        for (int gap = len / 2; gap > 0; gap /= 2)
            for (int i = 0; i < gap; i++) {
                int first = i;
                int min = array[i];
                int minindex = i;
                for (int j = i + gap; j < len; j += gap) {
                    if (array[j] > array[j-gap]){
                        min = array[j];
                        minindex = j;
                    }
                    if(i!=minindex){
                        int changetmp = array[i];
                        int firstint = array[minindex];
                        array[i] = array[minindex];


                    }

                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : shellsorthand(new int[]{23, 423, 3, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
