/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {
     public static void hashMap() {

        HashMap<String, Integer > good2count = new java.util.HashMap<>();

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            String goodName = scanner.nextLine();

            if (goodName.equals("LIST")) {
                printHashMap(good2count);
                continue;
            }

            int count = 1;
            if (good2count.containsKey(goodName)) {
                count = good2count.get(goodName) + 1;
            }
            good2count.put(goodName, count);     //.put - добавляет(типа .add)
        }
    }

    private static void printHashMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}