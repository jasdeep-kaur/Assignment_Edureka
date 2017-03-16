/**
 * Created by jasdeepkaur on 2/16/17.
 */

class A
{
    A()
    {

        System.out.println("Constructor no.1");
    }
}
class B extends A
{
    B()
    {

        System.out.println("Constructor no.2");
    }
}
class C extends B
{
    C()
    {


        System.out.println("Constructor no.3");
    }

}
public class Const_Inheritence
{
    public static void main(String[] args)
    {
        C a=new C();

    }
}