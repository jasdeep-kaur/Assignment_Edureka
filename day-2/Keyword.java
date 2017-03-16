/**
 * Created by jasdeepkaur on 2/16/17.
 */
public class Keyword
{
    static final int c=10;
    static int a,b;

   Keyword(int a,int b)
    {
     this.a=a;
     this.b=b;

    }

    static void display()
    {
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public static void main(String[] args)
    {
        Keyword obj=new Keyword(10,20);
        System.out.println("the valur of c="+c);
        obj.display();
    }
}
