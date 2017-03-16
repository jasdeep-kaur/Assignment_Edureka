/**
 * Created by jasdeepkaur on 2/15/17.
 */
public class Parameterized
{
    Parameterized(int a,int b)
    {
        System.out.println(a+"+"+b+"=");

        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        System.out.println("the sum of two no.s=");

        Parameterized obj=new Parameterized(10,10);
    }
}
