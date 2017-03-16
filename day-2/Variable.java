/**
 * Created by jasdeepkaur on 2/15/17.
 */
import java.io.*;
public class Variable
{

    private static double salary;

    public static final String DEPARTMENT = "CSE";

    public static void main(String args[]) {
        salary = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}
