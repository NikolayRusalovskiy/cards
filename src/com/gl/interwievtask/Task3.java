package com.gl.interwievtask;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String[] s = new String[]{"adu", "etgetgyreg", "adadyydwfwe", "adadadwfwe", "adyyu", "ergyyrtegre", "adyyu"};
        Map<Character, Integer> map = new HashMap<>();
        Character resultMax = null;
        Integer repeateMax = 0;
        for (String str : s) {
            for (int i = 0; i < str.length(); i++) {
                Character c = str.charAt(i);
                Integer res = 0;
                if (map.containsKey(c)) {
                    res = map.get(c) + 1;
                    map.put(c, res);
                } else map.put(c, 1);
                map.put(c, (map.containsKey(c)) ? (res) : 1);

                if (repeateMax.compareTo(res) < 0) {
                    resultMax = c;
                    repeateMax = res;
                }
            }
        }
        System.out.println("------>>>>>>>>>>>>>>>>>" + repeateMax + resultMax);
        System.out.println(map);
    }
}
