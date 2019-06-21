package com.andyliu.algorithm.sorts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 插入排序
 */
public class InsertSort {
    /**
     * 这个方法自己造的 貌似有点问题 照课本写一个 再对照吧
     *
     * @param l
     * @return
     */
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

    public static List<Integer> selectSortBook(List<Integer> l) {

        for (int i = 1; i < l.size(); i++) {
            //处理的第i个位置
            int k = i;
            for (int j = i+1; j > 0; j--)
                if (l.get(i) > l.get(j)) {
                    insert(l, i, j);
                }
        }
        return l;
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
