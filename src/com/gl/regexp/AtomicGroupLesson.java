package com.gl.regexp;

public class AtomicGroupLesson {
    public static void main(String[] args) {
        System.out.println("abcc".matches("a(?>b|bc)c"));
        System.out.println("integers".matches("\\b(?>integer|insert|in)\\b"));
    }
}