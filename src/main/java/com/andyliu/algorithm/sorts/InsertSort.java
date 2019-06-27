package com.andyliu.algorithm.sorts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. 从第0个位置开始，第0个位置自己是有序的。
 * 2. 第一个位置和第0个位置比较，如果第1个比第0个大，则将第1个插到第0个前面。
 * 3. 这样，到第k个的时候，第k-1前面的数据是有序的，只要知道第k个值应该放到哪个位置就行了，所以第k值向前查找合适的位置，并插入到那个位置即可。
 */
public class InsertSort {



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
