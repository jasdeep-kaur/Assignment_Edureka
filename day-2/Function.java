/**
 * Created by jasdeepkaur on 2/15/17.
 */
public class Function
{
     static String name;
     static int age;
    public static void input(String a,  int b)
    {
        name=a;
        age=b;
    }
    public static void output()
    {
        System.out.println("the name of the person:"+name);

        System.out.println("the age of the person:"+age);
    }

    public static void main(String[] aa)
    {
        System.out.println("Functions");
        input("jass",12);
        output();

    }
}
