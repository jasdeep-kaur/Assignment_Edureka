package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */


import java.util.HashSet;
class CustomHashSet {
    public static void main(String args[]) {

        HashSet<String> has = new HashSet<String>();



        has.add("jasdeep kaur");
        has.add("chokria");

        has.add("1320129");
        has.add("Rayat-Bahra");

        has.add(null);
        has.add(null);


        System.out.println(has);
    }
}