package org.example.module_9_advance_java.stream_api;

import java.util.List;

public class UseOfStreamAPI {
    public static void main(String[] args) {
        List<String> name = List.of("john", "michael", "susan", "anna", "peter", "alice", "bob", "adam");

        System.out.println("Names starting with 'a' using traditional way:");
        for (String n: name) {
            if(n.startsWith("a")) {
                System.out.print(n +" ");
            }
        }

        System.out.println("\nNames starting with 'a' using Stream API:");
        name.stream().filter(n -> n.startsWith("a")).forEach(System.out::println);
    }
}
