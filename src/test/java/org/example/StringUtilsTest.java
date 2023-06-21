package org.example;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void convertToUpperCase() {

        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        List<Pair<String, String>> result = StringUtils.convertToUpperCase(strings);

        assertEquals(3, result.size());
        assertEquals(Pair.of("one", "ONE"), result.get(0));
        assertEquals(Pair.of("two", "TWO"), result.get(1));
        assertEquals(Pair.of("three", "THREE"), result.get(2));

    }

    @Test
    void filterAndPrintLowerCaseWithLength() {

        List<String> strings = new ArrayList<>();
        strings.add("abcd");
        strings.add("efgh");
        strings.add("ijkl");
        strings.add("mnop");
        strings.add("QRST");
        strings.add("uvwx");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StringUtils.filterAndPrintLowerCaseWithLength(strings);

        String expectedOutput = "abcd\nefgh\nijkl\nmnop\nuvwx\n";

        assertEquals(expectedOutput, outContent.toString());


    }
}