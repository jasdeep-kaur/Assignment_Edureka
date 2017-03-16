/**
 * Created by jasdeepkaur on 2/15/17.
 */
public class Fun_Para
{
    static int x,y;
    static void input(int a,int b)
    {
        x=a;
        y=b;
    }
    static void output()
    {
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
    public static void main(String[] aa)
    {
        input(10,20);
        output();
    }
}
