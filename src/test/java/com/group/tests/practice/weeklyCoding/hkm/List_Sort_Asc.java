package com.group.tests.practice.weeklyCoding.hkm;

import java.util.ArrayList;
import java.util.Arrays;

public class List_Sort_Asc {

    /*
    ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.


ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new  ArrayList(Arrays.asList(1,2,8,6,9,0,65,3));

        SortingArrayAsc(list);
        SortingArrayDsc(list);

    }

    public static void SortingArrayAsc(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println(list);
    }

    public static void SortingArrayDsc(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println(list);
    }

}
