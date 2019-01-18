package com.gl.mypackmap;

import java.util.HashMap;
import java.util.Map;

public class ClientPage {
    Map<String,String> regform = new HashMap();
    Map<String,String> map1 = new HashMap();
    public void getFillPage (HashMap map){
map1.putAll(map);


        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println("ID =  " + entry.getKey() + " День недели = " + entry.getValue());
        }

        System.out.println();
//        for (Map.Entry<String,String> entry:map.entrySet()
//             ) {
//            System.out.println(entry.getKey()+entry.getValue());
//        }
//        System.out.println("Client1 -> "+map.get("Client1"));
        System.out.println("Client2 -> "+map1.get("Client2"));
        System.out.println("Result -> "+(map1.containsKey("Result")?"Result":"default"));
    }
}
