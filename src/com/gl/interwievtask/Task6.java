package com.gl.interwievtask;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
//        set.add(1);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);

//
//        SortedSet<Integer> set = new TreeSet<>();
//        for (int i = 1; i <=10 ; i++) {
//            set.add(i);
//        }
//
//        for (Iterator it = set.iterator(); it.hasNext(); ) {
//            Integer integer = (Integer) it.next();
//            System.out.println(integer);
//        }



//        HashMap<Integer,String> m = new SimpleLRUCache<>(5);
//        m.put(5,"a");
//        m.put(4,"b");
//        m.put(3,"c");
//        m.put(2,"d");
//        m.put(1,"e");
//        m.get(2);
//        m.put(6,"f");
//        System.out.println(m);

Map <Object,String> map = new WeakHashMap<Object, String>();
Object data = new Object();
map.put(data,"information");
data =null;
System.gc();
        for (int i = 1; i <10000 ; i++) {

            if (map.isEmpty()){
                System.out.println(i);
                System.out.println("Empty!");
                break;
            }
        }


    }
}