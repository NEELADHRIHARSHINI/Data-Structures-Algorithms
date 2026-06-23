// 1. Consider Array of n elements, find frequency of each element.
// Print elements and their frequencies according  to input order

package Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> Lmap = new LinkedHashMap<>();
        int[] arr = {8,6,7,8,3,6,3,1,9,3};
        for(int i: arr){
            Lmap.put(i, Lmap.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : Lmap.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
