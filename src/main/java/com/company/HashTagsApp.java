package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashTagsApp {

    void sortByValue(Map<String, Integer> map)
    {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        printMap(sortedMap);
    }

    private void printMap(Map<String, Integer> sortedMap) {
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() +"\t"+entry.getValue());
        }
    }

    public Map<String, Integer> findHashTags(List<String> str){
        Map<String, Integer> hashTags = new HashMap<>();
        Set<String> stringSet;

        for (String s : str) {
            String[] strs = s.split(" ");

            stringSet = new HashSet<>();
            for (String value : strs){
                if (value.contains("#") && !stringSet.contains(value)){

                    hashTags.put(value, hashTags.getOrDefault(value, 0) + 1);
                    stringSet.add(value);
                }
            }
        }

        sortByValue(hashTags);
        return hashTags;
    }


}
