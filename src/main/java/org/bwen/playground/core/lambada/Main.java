package org.bwen.playground.core.lambada;

import java.util.Arrays;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import java.util.List;

public class Main {

    public static void  main(String args[]) {
        List<String> words = Arrays.asList("hello", "world","A","B");
        words.sort(naturalOrder());
        System.out.println(words);
        words.sort(comparingInt(String::length).reversed());
        System.out.println(words);
    }
}
