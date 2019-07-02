package com.andyliu.algorithm.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public static int[] countingsort(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (min > array[i]) min = array[i];
            else if (max < array[i]) max = array[i];

        int[] tmp = new int[max - min + 1];
        for (int i = 0; i < array.length; i++)
            tmp[array[i] - min]++;
        int cnt=0;
        for(int i=0;i<tmp.length;i++)
            for(int j =0;j<tmp[i];j++)
                array[cnt++] = i+min;
        return array;

    }

    public static void main(String[] args) {
        System.out.println("alksdjfalkdsjf");
        for (int x : countingsort(new int[]{23, 423, 334, 238, 4, 201, 4753, 234, 235, 23, 3}))
            System.out.println(x);
        System.out.println("alksdjfalkdsjf");
    }
}
