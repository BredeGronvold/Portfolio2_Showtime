package com.example.Portfolio2_Showtime.test;

import com.example.Portfolio2_Showtime.item.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> savedItems = new ArrayList(Arrays.asList("v", "p", "r", "s", "f", "l", "b"));

        for (int i = 0; i < savedItems.size(); i++) {
            for (int j = savedItems.size()-1; j >= 0; j--) {
                if (savedItems.get(i).compareTo(savedItems.get(j)) < 0) {
                    String item = savedItems.get(i);
                    savedItems.add(i, savedItems.get(j));
                    savedItems.add(j, item);
                }
            }
        }
        for (String str : savedItems) {
            System.out.print(str + " ");
        }

    }
}
