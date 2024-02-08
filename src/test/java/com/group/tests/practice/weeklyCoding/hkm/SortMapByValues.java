package com.group.tests.practice.weeklyCoding.hkm;

import java.util.*;

public class SortMapByValues {
    
    public static void main(String[] args) {
        // Creating an example map
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("olive", 7);
        unsortedMap.put("apple", 3);
        unsortedMap.put("banana", 8);
        unsortedMap.put("cherry", 4);
        unsortedMap.put("date", 2);
        unsortedMap.put("onion", 1);
        System.out.println(sortedMap(unsortedMap));

       // Sorting the map by values
        Map<String, Integer> sortedMap = sortByValue(unsortedMap);
        
        // Printing the sorted map
        System.out.println("Sorted Map:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        return sortedMap;
    }


        public static Map<String, Integer> sortedMap(Map<String,Integer>unsortedMap) {

            // Sort the map by values using streams
            Map<String, Integer> sortedMap = unsortedMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(
                            LinkedHashMap::new,
                            (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                            Map::putAll
                    );

            // Print the sorted map
           // sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
            return sortedMap;
        }
    }


