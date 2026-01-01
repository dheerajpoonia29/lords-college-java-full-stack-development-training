package org.example.module_5_collections_map_generic.collection_framework.set.hashSet.questions;

import java.util.HashSet;

public class Question3 {
    public static void main(String[] args) {
//        String input = "abcabcbb";

        String input = "abcaaxyzabcbb";

        // logic to find longest substring without repeating characters
        HashSet<Character> ht = new HashSet<>();

        int left = 0, right = 0, maxLength = 0;

        for (; right<input.length(); right++) {
            Character charAtRight = input.charAt(right);

            while(ht.contains(charAtRight)) {
                ht.remove(input.charAt(left));
                left++;
            }

            ht.add(charAtRight);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}
