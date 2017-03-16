package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Collection {
    public static void main(String a[]){
        List<String> li = new ArrayList<String>();
        li.add("BOOM");
        li.add("SHAKA");
        li.add("LAKA");
        li.add("LAKA");
        System.out.println("List: "+li);
        TreeSet<String> boom = new TreeSet<String>(li);
        System.out.println("Set: "+boom);
    }
}