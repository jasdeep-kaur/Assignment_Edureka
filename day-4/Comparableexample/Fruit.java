package com.edureka.session_four.Comparable;

/**
 * Created by jasdeepkaur on 2/24/17.
 */

public class Vehicle implements Comparable<Vehicle>
{

    private String vehicleName;
    private int vehicletype;

    public Vehicle(String Name, String fruitDesc, int type)
    {
        super();
        this.vehicleName = Name;
        this.vehicletype = type;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(int vehicletype) {
        this.vehicletype = vehicletype;
    }

    public int compareTo( compareVehicle)
    {

        int comparetype = ((Fruit) compareVehicle).gettype();


        return this.vehicletype - comparetype;


    }
}

