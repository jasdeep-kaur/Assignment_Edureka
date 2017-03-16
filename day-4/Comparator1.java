package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Comparator1 {
    private int age;
    private String name;

    public Comparator1(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    class SizeComparator implements Comparator<Comparator1> {
    @Override
    public int compare(Comparator1 tv1, Comparator1 tv2) {
        int tv1Size = tv1.getSize();
        int tv2Size = tv2.getSize();

        if (tv1Size > tv2Size) {
            return 1;
        } else if (tv1Size < tv2Size) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Comparator1 tv1 = new Comparator1(55, "Samsung");
        Comparator1 tv2 = new Comparator1(60, "Sony");
        Comparator1 tv3 = new Comparator1(42, "Panasonic");

        ArrayList<Comparator1> al = new ArrayList<Comparator1>();
        al.add(tv1);
        al.add(tv2);
        al.add(tv3);

        Collections.sort(al, new SizeComparator());
        for (Comparator1 a : al) {
            System.out.println(a.getBrand());
        }
    }
}
