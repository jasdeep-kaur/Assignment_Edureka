/**
 * Created by jasdeepkaur on 2/15/17.
 */
import java.util.Scanner;
public class Object_class
{
    String name;
    int age;
    String occ;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the name of the Person");
        name=sc.next();
        System.out.println("Enter the  age");
        age=sc.nextInt();
        System.out.println("Enter the occupation");
        occ=sc.next();

    }
    void output()
    {
        System.out.print(" The name of the Person:");
        System.out.println(name);
        System.out.print(" The  age              :");
        System.out.println(age);
        System.out.print(" The occupation        :");
        System.out.println(occ);



    }


    public static void main(String aa[])
    {
        Object_class obj=new Object_class();
        obj.input();
        obj.output();


    }
}