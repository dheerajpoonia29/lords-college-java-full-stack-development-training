package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 1, 4));
//        input.add(4);
//        input.add(5);
//        input.add(1);
//        input.add(2);
//        input.add(1);
//        input.add(4);

        int result = 0;
        // logic
        for(int i=0; i<input.size(); i++) {
            Integer ele = input.get(i);

            int j = i+1; // 1+1 = 2
            for(; j<input.size(); j++) {
                Integer nextEle =  input.get(j);
                if(ele == nextEle) {
                    break;
                }
            }
            if(j==input.size()) {
                result = ele;
                break;
            }
        }

        System.out.println("Result: "+result);

    }
}
