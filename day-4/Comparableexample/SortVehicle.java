package com.edureka.session_four.Comparable;

/**
 * Created by jasdeepkaur on 2/24/17.
 */
import java.util.Arrays;

public class SortVehicle{

    public static void main(String args[]){

        Vehicle[] vehicle = new Vehicle[4];

       vehicle pineappale = new vehicle("Swift",2);
        vehicle apple = new vehicle("Vespa",1);
        vehicle orange = new vehicle("Truck",8);

        vehicle[0]=Swift;
        vehicle[1]=Vespa;
        vehicle[2]=Truck;


        Arrays.sort( vehicle);

        int i=0;
        for( Vehicle temp:  vehicle){
            System.out.println(" vehicle " + ++i + " : " + temp.getVehicleName() +
                    ", type : " + temp.getVehicleType());
        }

    }
}
