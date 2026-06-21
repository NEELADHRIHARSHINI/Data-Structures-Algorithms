package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "chetan");
        map.put(46, "loki");
        map.put(17, "abhi");
        map.put(7, "bhargav");

        for(String i: map.values()){
            System.out.println(i);
        }
        //no order 
        //abhi
        // chetan
        // bhargav
        // loki
    }
}
