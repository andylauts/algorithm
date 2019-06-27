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
        for (int gap = len / 2; gap > 0; gap /= 2) //这个for循环实现分组功能
            for (int i = 0; i < gap; i++) { //每个i代表每一组  对每组进行分别遍历
                int min;
                int minindex;
                for (int j = i; j < len; j += gap) { //进行多趟排序 j每加一次gap ，j前面的数据就已经排好了
                    min = array[j];
                    minindex = j;
                    for (int k = minindex; k < len; k += gap)
                        if (array[k] < min) {
                            System.out.println("1111111111111111111");
                            min = array[k];
                            minindex = k;
                        }
                    for (int k = minindex; k >= j; k -= gap) {
                        System.out.println("22222222222222222222222");
                        if (k != j)
                            array[k] = array[k - gap];
                        else array[k] = min;

                    }
//                    if (array[j] < array[j-gap]){
//                        min = array[j];
//                        minindex = j;
//                    }
//                    if(i!=minindex){
//                        int changetmp = array[i];
//                        int firstint = array[minindex];
//                        array[i] = array[minindex];
//
//
//                    }
//
//                    array[j] = array[i];
//                    array[i] = temp;
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
