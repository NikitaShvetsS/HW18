package org.example;


import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    public static List<Pair<String, String>> convertToUpperCase(List<String> strings){
        return strings.stream()
                .map(s -> Pair.of(s, s.toUpperCase()))
                .collect(Collectors.toList());
    }

    public static void filterAndPrintLowerCaseWithLength(List<String> strings) {
        strings.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .forEach(System.out::println);
    }


}
