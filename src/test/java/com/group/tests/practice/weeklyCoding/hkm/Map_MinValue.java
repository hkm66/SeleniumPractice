package com.group.tests.practice.weeklyCoding.hkm;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Map_MinValue {
    //Write a method that can return the minimum value from ta map (DO NOT use sort method)



    //Solution:
    public  static  int  minValue( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }
}
