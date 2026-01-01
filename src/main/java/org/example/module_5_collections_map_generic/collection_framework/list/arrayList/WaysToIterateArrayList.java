package org.example.module_5_collections_map_generic.collection_framework.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class WaysToIterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> weekends = new ArrayList<>();

        weekends.add("Saturday");
        weekends.add("Sunday");
        weekends.add("Monday");
        weekends.add("Tuesday");
        weekends.add("Wednesday");
        weekends.add("Thursday");
        weekends.add("Friday");

        System.out.println("Using for loop:");
        for(int i = 0; i<weekends.size(); i++) {
            System.out.println("Index " + i + ": " + weekends.get(i));
        }

        System.out.println("\nUsing enhanced for loop (for-each loop):");
        for(String day: weekends) {
            System.out.println(day);
        }

        System.out.println("\nUsing while loop:");
        int i = 0;
        while(i < weekends.size()) {
            System.out.println("Index " + i + ": " + weekends.get(i));
            i++;
        }

        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = weekends.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        System.out.println("\nUsing forEach method:");
        weekends.forEach(element -> System.out.println(element));
    }
}
