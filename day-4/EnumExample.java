package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;

class EnumExample {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("jasdeep");
        arrayList.add("kaur");
        arrayList.add("Chokria");
        Enumeration<String> e = Collections.enumeration(arrayList);

        System.out.println("ArrayList elements: ");
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}