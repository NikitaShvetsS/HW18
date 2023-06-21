package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageUtilTest {

    @Test
    void calcAverage(){
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    double average = AverageUtil.calcAverage(numbers);

    assertEquals(3.0, average, 0.01);
    }
}