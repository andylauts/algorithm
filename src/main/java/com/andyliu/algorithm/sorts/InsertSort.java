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
     * 这个程序认为第i个之前的数据已经排好了 i+1的数据去与前i个对比 第i+1的数据插入到对应位置
     *
     * @param l
     * @return
     */


    public static List<Integer> selectSortBook(List<Integer> l) {

        for (int i = 1; i < l.size(); i++) {

            for (int j = i - 1; j >= 0; j--)
                if (l.get(i) >= l.get(j)) {
                    if(i-j==1)
                        break;
                    insertbook(l, i, j+1);
                    break;
                }
        }
        return l;
    }
    private static void insertbook(List<Integer> l, int i, int j) {
        l.add(j, l.get(i));
        l.remove(i + 1);
    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        List<Integer> l = new ArrayList();
        l.addAll(Arrays.asList(new Integer[]{1, 23, 423, 3, 234, 235, 3323, 3}));
        for (Integer x : selectSortBook(l))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
