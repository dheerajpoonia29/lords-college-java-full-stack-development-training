package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(4);

        // 1,2,3,4,5

        // logic
        ArrayList<Integer> output = solution1(arr1); // 1,2,3
        ArrayList<Integer> tempArr = solution1(arr2); // 3,4,5

        for(Integer ele: tempArr) {
            if(output.contains(ele) == false) {
                output.add(ele);
            }
        }

        // print the output
        Question1.printArrayList(output);
        // 1,2,3,4,5
    }

    public static ArrayList<Integer> solution1(ArrayList<Integer> input) {
        ArrayList<Integer> output = new ArrayList<>();
        for (Integer ele: input) {
            if(output.contains(ele)==false) {
                output.add(ele);
            }
        }
        return output;
    }
}
