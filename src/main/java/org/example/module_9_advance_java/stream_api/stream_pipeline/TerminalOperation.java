package org.example.module_9_advance_java.stream_api.stream_pipeline;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) {
        // source
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // stream from source
        Stream<Integer> stream = arr.stream();

        System.out.println("Terminal operation: forEach");
        stream.forEach(System.out::println);

        System.out.println("Terminal operation: collect");
        ArrayList<Integer> newArr = (ArrayList<Integer>) arr.stream().map(x -> x*2).collect(Collectors.toList());
        newArr.forEach(System.out::println);

        System.out.println("Terminal operation: count");
        long count = arr.stream().filter(x -> x>2).count();
        System.out.println("Count of elements greater than 2: " + count);

        System.out.println("Terminal operation: reduce");
        int sum = arr.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all elements: " + sum);
    }


}
