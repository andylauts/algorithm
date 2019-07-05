package com.andyliu.algorithm.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {
    public static void radixsort(List<Integer> l) {
        Integer min = l.get(0);
        Integer max = l.get(0);
        //取出最小值和最大值
        for (Integer i : l) {
            if (min > i) min = i;
            else if (max < i) max = i;
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int m = 0; m < 10; m++) {
            list.add(new ArrayList<Integer>());
        }
        Integer fortimes = max.toString().length();
        for (Integer i = 0; i < fortimes; i++) {
            for (int m = 0; m < 10; m++) {
                list.get(m).clear();
            }
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j).toString().length() - 1 < i)
                    list.get(0).add(l.get(j));
                else list.get(l.get(j).toString().charAt(i)).add(l.get(j));

            }
            l.clear();
            for (int k = 0; k < list.size(); k++)
                for (int j = 0; j < list.get(k).size(); j++)
                    l.add(list.get(k).get(j));
        }
    }

    public static void main(String[] args) {
//        System.out.println(Math.pow(2, 3));
        List l = new ArrayList();
        l.addAll(Arrays.asList(new Integer[]{1, 23, 423, 3, 234, 235, 3323, 3}));
        radixsort(l);
        l.stream().forEach(x -> {
            System.out.println(x);
        });
    }
}
