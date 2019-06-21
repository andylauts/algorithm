package com.andyliu.algorithm.sorts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 插入排序
 */
public class InsertSort {
    public static List<Integer> selectSort(List<Integer> l) {

        for (int i = 0; i < l.size(); i++) {
            //处理的第i个位置
            int k = i;
            for (int j = i; j < l.size(); j++)
                if (l.get(i) > l.get(j)) {
                    insert(l, i, j);
                }
        }
        return l;
    }

    private static void insert(List<Integer> l, int i, int j) {
        l.add(i, l.get(j));
        l.remove(j + 1);
    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        List<Integer> l = new ArrayList();
        l.addAll(Arrays.asList(new Integer[]{1, 23, 423, 3, 234, 235, 3323, 3}));
        for (Integer x : selectSort(l))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
