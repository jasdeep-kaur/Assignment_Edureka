package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */
import java.util.HashMap;
import java.util.Map;

class MapHash {

    public static void main(String[] args) {
        Map alpha = new HashMap();

        
        alpha.put("AAAAAA", 3);
        alpha.put("BBBBBB", 5);
        alpha.put("CCCCCC", 2);
        alpha.put("DDDDDD", 8);

        System.out.println("alphabets: " + alpha.size());

        for(Object key: alpha.keySet())
            System.out.println(key + " - " + alpha.get(key));
        System.out.println();

        String search = "CCCCCC";
        if(alpha.containsKey(search))
            System.out.println("Answer" + alpha.get(search) + " "
                    + search + " cars!\n");

        alpha.clear();

        System.out.println("then: " + alpha.size());
    }
}