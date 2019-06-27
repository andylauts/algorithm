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

//    /**
//     * 这个是我手工写的，外层的排序是shell排序的思想，而里层排序，并不是shell排序，而是选择排序，算则出最小的放到前面。
//     * 这个是错误的shell排序算算法。
//     * @param array
//     * @return
//     */
//    @Deprecated
//    public static int[] shellsorthand(int[] array) {
//        int len = array.length;
//        int temp = len / 2;
//        for (int gap = len / 2; gap > 0; gap /= 2) //这个for循环实现分组功能
//            for (int i = 0; i < gap; i++) { //每个i代表每一组  对每组进行分别遍历
//                int min;
//                int minindex;
//                for (int j = i; j < len; j += gap) { //进行多趟排序 j每加一次gap ，j前面的数据就已经排好了
//                    min = array[j];
//                    minindex = j;
//                    for (int k = minindex; k < len; k += gap)
//                        if (array[k] < min) {
//                            System.out.println("1111111111111111111");
//                            min = array[k];
//                            minindex = k;
//                        }
//                    for (int k = minindex; k >= j; k -= gap) {
//                        System.out.println("22222222222222222222222");
//                        if (k != j)
//                            array[k] = array[k - gap];
//                        else array[k] = min;
//
//                    }
////                    if (array[j] < array[j-gap]){
////                        min = array[j];
////                        minindex = j;
////                    }
////                    if(i!=minindex){
////                        int changetmp = array[i];
////                        int firstint = array[minindex];
////                        array[i] = array[minindex];
////
////
////                    }
////
////                    array[j] = array[i];
////                    array[i] = temp;
//                }
//            }
//        return array;
//    }

    public static int[] shellsort(int[] array) {
        int len = array.length;
        int temp = len / 2;
        for (int gap = len / 2; gap > 0; gap /= 2) //这个for循环实现分组功能
            for (int i = 0; i < gap; i++) { //每个i代表每一组  对每组进行分别遍历
                int min;
                int minindex;
                for (int j = i + gap; j < len; j += gap) { //进行多趟排序 j每加一次gap ，j前面的数据就已经排好了
                    //从第二个位置开始排序 与前面的数进行对比
                    for (int k = j - gap; k >= 0; k -= gap) {//k前面的数据默认都已经排好序了 要排第j个了
                        if (array[j] >= array[k] && gap == j - k)
                            break;
                        if (array[j] >= array[k]) {
                            insert(array, j, k + gap, gap);
                            break;
                        }
                    }
                }
            }
        return array;
    }

    private static void insert(int[] array, int j, int k, int gap) {
        int temp = array[j];
        for (int a = j; a >= k; a -= gap)
            array[a] = array[a - gap];
        array[k] = temp;

    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : shellsort(new int[]{23, 423, 334, 238, 4, 201, 4753, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
