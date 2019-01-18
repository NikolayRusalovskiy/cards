package com.gl.interwievtask;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        String[] s = new String[]{"adyyu", "etgetgreg", "adadadwfwe", "adadwfwe", "adyyu", "ergyyrtegre", "adyyu"};
        String str = "";
        Integer count = 0;
        List<String> a = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            String strTmp = s[i];
            char[] chars = strTmp.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                String charTmp = "" + chars[j];
                Integer countTmp = map.get(charTmp);

                if (countTmp == null) {
                    countTmp = 1;
                } else {
                    countTmp++;
                }
                map.put(charTmp, countTmp);

                if (count.compareTo(countTmp) < 0) {
                    //TODO what will be if count == countTmp
                    count = countTmp;
                    str = charTmp;
                    a = new LinkedList<>();
                    a.add(charTmp);
                } else if (count.compareTo(countTmp) == 0) {
                    a.add(charTmp);
                }
            }
        }
        System.out.println(map);
        System.out.println("WINNER str = " + str + " (" + count + ")");
        System.out.println(a);
    }

}