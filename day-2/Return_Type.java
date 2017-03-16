/**
 * Created by jasdeepkaur on 2/15/17.
 */
import java.util.Scanner;
public class Return_Type
{
    Scanner sc=new Scanner(System.in);
    int a,b;
    void input()
    {
        System.out.println("enter the valueof a=");
        a=sc.nextInt();
        System.out.println("enter the valueof b=");
         b=sc.nextInt();

    }
    int  output()
    {
        return a+b;

    }
    double  output1(double x, double y )
    {
        return x + y;

    }
    boolean ans(int m,int n)
    {   if(m<n)
        return false;
        else
        return true;
    }
    public static void main(String aa[])
    {
        Return_Type obj=new Return_Type();
        obj.input();
        System.out.println(obj.output());
        System.out.println("Sum of 12.22+12.22="+obj.output1(12.22,12.22));
        System.out.println(" 10 is greater than 20 --");

        System.out.println(obj.ans(10,20));
    }
}
