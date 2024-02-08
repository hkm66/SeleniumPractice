package com.group.tests.Roman;

import java.util.*;

public class Week11_hkm {

    public static ArrayList<Integer> list;

    //arrayList in asc order
    //first solution with recursion and swapping
    public static ArrayList<Integer> sortArrayInAscRecurs(ArrayList<Integer> arrayList) {
        if (arrayList.size() <= 1)
            return arrayList;

        list = new ArrayList<>(arrayList);
        for (int i = 1; i < list.size(); i++) {
            bubbleUp(i, i-1);
        }

        return list;
    }

    private static void bubbleUp(int currentIndex, int previousIndex) {
        if (previousIndex < 0)
            return;

        if (list.get(currentIndex) < list.get(previousIndex)) {
            var temp = list.get(currentIndex);
            list.set(currentIndex, list.get(previousIndex));
            list.set(previousIndex, temp);
        }

        bubbleUp(previousIndex, previousIndex - 1);
    }

    //arrayList in asc order
    //second solution with priorityQueue
    public static ArrayList<Integer> sortArrayInAsc (ArrayList<Integer> arrayList) {
        var queue = new PriorityQueue<Integer>();
        queue.addAll(arrayList);

        list = new ArrayList<>();
        while (!queue.isEmpty())
            list.add(queue.poll());

        return list;
    }

    //arrayList in descOrder
    //first solution with recursion and swapping
    public static ArrayList<Integer> sortArrayInDescRecurs(ArrayList<Integer> arrayList) {
        if (arrayList.size() <= 1)
            return arrayList;

        list = new ArrayList<>(arrayList);
        for (int i = 1; i < list.size(); i++) {
            bubbleDown(i, i-1);
        }

        return list;
    }

    private static void bubbleDown(int currentIndex, int previousIndex) {
        if (previousIndex < 0)
            return;

        if (list.get(currentIndex) > list.get(previousIndex)) {
            var temp = list.get(currentIndex);
            list.set(currentIndex, list.get(previousIndex));
            list.set(previousIndex, temp);
        }

        bubbleDown(previousIndex, previousIndex-1);
    }

    //second solution with priorityQueue and stack
    public static ArrayList<Integer> sortArrayInDesc (ArrayList<Integer> arrayList) {
        var queue = new PriorityQueue<Integer>();
        queue.addAll(arrayList);

        var stack = new Stack<Integer>();
        while (!queue.isEmpty()) {
            stack.add(queue.poll());
        }

        list = new ArrayList<>();
        while (!stack.isEmpty())
            list.add(stack.pop());

        return list;
    }

    //sorted map by values
    // 1,2   2,4   3,1  4,0  5,8
    //
    public static LinkedHashMap<Integer, Integer> sortedMapByValues(HashMap<Integer, Integer> map) {
        var queue = new PriorityQueue<Integer>(map.values());
        var linkedMap = new LinkedHashMap<Integer, Integer>();
        var keysSet = new HashSet<>(map.keySet());

        while (!queue.isEmpty()) {
            //min value from map values
            var value = queue.poll();
            //iterating keys to find matching value
            for (Integer key : keysSet) {
                if (map.get(key) == value) {
                    linkedMap.put(key, value);
                    map.remove(key);
                }
            }
        }

        return linkedMap;
    }
}
