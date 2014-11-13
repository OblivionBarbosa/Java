package exercise0;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Radu.Hoaghe on 10/29/2014.
 *
 * Exercise 0: Iterate over the keys of a Map using keySet method (this method returns a Set of all the map keys)
 */
public class Exercise0 {

    public Exercise0(){

    }

    // TODO Exercise #0 a) iterate over a Map's keys using keySet method
    public void iterateThroughMap(){

        // TODO Exercise #0 b) Create a Map (HashMap) and add elements to it (using put() method)

        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("mere", "Romania");
        hashMap.put("pere", "Italia");
        hashMap.put("gutui", "Romania");
        hashMap.put("kiwi", "Egipt");

        // TODO Exercise #0 b) Don't forget to specify the types of the key and value when creating the Map
        Set<String> keys = hashMap.keySet();
        // TODO Exercise #0 c) Iterate over the Map using keySet() method and print all its elements
        System.out.print("[");
        for(String key : keys)
            System.out.print(key + "=" + hashMap.get(key) + " ");
        System.out.print("]");
        // TODO Exercise #0 c) The elements are printed like this: [key1=value1, key2=value2, ...]
        
    }

    public static void main(String[] args) {
        Exercise0 exercise0 = new Exercise0();
        exercise0.iterateThroughMap();
    }
}