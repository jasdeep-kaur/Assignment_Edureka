/**
 * Created by jasdeepkaur on 2/15/17.
 */
public class Cons_over
{       Cons_over(int a, String b)
        {   System.out.println("1st Constructor");
            System.out.println("sr.no="+a);
            System.out.println("name.="+b);

        }
        Cons_over(String x,int y )
        {      System.out.println("2nd Constructor");
            System.out.println("name="+x);
            System.out.println("roll_no.="+x);

        }
        Cons_over()
        {
         System.out.println("Default Constructor");
        }

public static void main(String args[])
{
    Cons_over obj1=new Cons_over(12,"jass");
    Cons_over obj2=new Cons_over("jazz",129);
    Cons_over obj3=new Cons_over();
}
}
