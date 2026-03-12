package org.example.module_9_advance_java.stream_api.stream_pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class SourcesOfStream {
    public static void main(String[] args) {
        // source: collection
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // 1st way to get stream from collection
        Stream<Integer> stream1 = arr.stream();

        // source: array
        String[] names = {"john", "michael", "susan"};
        // 2nd way to get stream from array
        Stream<String> stream2 = Arrays.stream(names);

        // 3rd way to get stream from array
        Stream<String> stream3 = Stream.of(names);

    }
}
