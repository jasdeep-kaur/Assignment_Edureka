/**
 * Created by jasdeepkaur on 2/14/17.
 */
import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] aa)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int x= sc.nextInt();

        int f1=0,f2=1;
        int f3=0;
        System.out.print(f1+" "+f2);

        for(int i=0;i<=x;i++)
        {

            f3=f1+f2;

            //f1=f2;
            f2=f3;
            f1=f2;
            System.out.print(" "+f1+" ");
        }

      }
}
