package com.group.tests.Ion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("A",325);
        student.put("B",25);
        student.put("C",3);
        student.put("D",35);
        student.put("E",8563);
        student.put("F",52);

        ArrayList<Integer> number = new ArrayList<>();
        number.add(0,14);
        number.add(1,6);
        number.add(2,50);
        number.add(3,56);
        number.add(4,-1);


        //Maps.frequence("AaAaAaBbBCcC"); // ->A3a3B2b1C2c1
        //System.out.println(Maps.minValue(student)); // -> 3

        //ListTask.ascList(number);
        //ListTask.descList(number);

    }
}
