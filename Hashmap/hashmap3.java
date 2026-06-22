package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "chetan");
        map.put(46, "loki");
        map.put(17, "abhi");
        map.put(7, "bhargav");

        
        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());
        }
        //no order 
        // 17: abhi
        // 23: chetan
        // 7: bhargav
        // 46: loki
    }
}
