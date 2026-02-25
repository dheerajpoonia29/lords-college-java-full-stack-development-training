package org.example.module_9_lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(Integer i : arr) {
            if(i>7)
                System.out.println(i);
        }

        Stream<Integer> stream = arr.stream(); // source
        stream.filter(i -> i > 7) // intermediate operation
                .forEach(System.out::println); // terminal operation

    }
}
