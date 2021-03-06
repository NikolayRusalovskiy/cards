package com.gl.interwievtask;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleLRUCache <K,V> extends LinkedHashMap {
    private final int capacity;


    public SimpleLRUCache(int capacity) {
        super(capacity+1,1.1f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return this.size()>capacity;
    }
}
