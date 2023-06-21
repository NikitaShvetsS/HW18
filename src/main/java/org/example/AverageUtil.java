package org.example;

import java.util.List;

public class AverageUtil {

    public static double calcAverage(List<Integer> nums){
        return nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

    }

}
