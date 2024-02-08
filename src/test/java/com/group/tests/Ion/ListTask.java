package com.group.tests.Ion;

import java.util.*;

public class ListTask {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(0,4);
        number.add(1,6);
        number.add(2,70);
        number.add(3,5);
        number.add(4,5);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A",325);
        map.put("B",25);
        map.put("C",3);
        map.put("D",35);
        map.put("E",8563);
        map.put("F",52);

        descList(number);

    }
    public static void ascList(List<Integer> numbers){

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - 1 -i; j++) {
                if(numbers.get(j) > numbers.get(j+1)){
                    int num = numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1,num);
                }
            }
        }
        System.out.println("numbers = " + numbers);
    }

    public static void descList(List<Integer> numbers){

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - 1 -i; j++) {
                if(numbers.get(j) < numbers.get(j+1)){
                    int num = numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1,num);
                }
            }
        }
        System.out.println("numbers = " + numbers);

    }

}
