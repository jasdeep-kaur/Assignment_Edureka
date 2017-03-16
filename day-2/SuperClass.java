/**
 * Created by jasdeepkaur on 2/16/17.
 */
public class SuperClass
{
    public static void main(String[] args)
    {
     B b=new B();
       // b.show();
        b.display();
    }
}

class A
{
    void display()
    {
        System.out.println("This is a Super-class");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("This is a baseclass");
    }
}