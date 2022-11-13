package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PositiveNumsApp {

    public List<Integer> findPositiveNumbers(Integer[] arr){
        return Arrays.stream(arr).filter(a -> a >= 0).sorted(Comparator.reverseOrder()).toList();
    }
}
