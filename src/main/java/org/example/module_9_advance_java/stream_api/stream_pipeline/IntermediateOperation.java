package org.example.module_9_advance_java.stream_api.stream_pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {
        // source
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // stream from source
        Stream<Integer> stream = arr.stream();

        System.out.println("Intermediate operation: filter");
        stream.filter(x -> x>2).forEach(System.out::println);

        System.out.println("Intermediate operation: map");
        stream = arr.stream();
        stream.map(x -> x/2).forEach(System.out::println);

        System.out.println("Intermediate operation: sorted");
        stream = arr.stream();
        stream.sorted((a, b) -> b - a).forEach(System.out::println);

    }
}
