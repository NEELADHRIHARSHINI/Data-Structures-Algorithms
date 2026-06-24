package Hashmap;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> Tmap = new TreeMap<>(Collections.reverseOrder());
        int[] arr = {8,6,7,8,3,6,3,1,9,3};
        for(int i: arr){
            Tmap.put(i, Tmap.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : Tmap.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
