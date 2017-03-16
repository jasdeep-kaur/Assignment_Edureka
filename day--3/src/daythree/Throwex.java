package daythree;

/**
 * Created by jasdeepkaur on 2/25/17.
 */

import java.io.IOException;

public class Throwex
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            System.out.println("THIS is a throw example! ");
            System.out.println(5/0);
        }
        catch(Exception e)
        {
            System.out.println("Exception ");
        }

    }
}