package com.gl.interwievtask;

public class Task7 {
    public static void main(String[] args) {
        String s = " adad   werwrf wefwfrtt    werwerwr  wrwrwwr     ";




//        while (s.contains("  ")){
//            s=s.replace("  "," ");
//        }
//        System.out.println(s.trim());


        ///////////////////////////////////////////
//     s= s.replaceAll("[\\s]{2,}", " ").trim();
     s= s.replaceAll("\\s+", " ").trim();
        System.out.println(s);
    }
}
