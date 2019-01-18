package com.gl.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMultipleRequirementsLesoon {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?=\\b\\w{6}\\b)\\w*cat\\w*");
        Matcher matcher = p.matcher("wecate");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println("--------> The end");
    }
}