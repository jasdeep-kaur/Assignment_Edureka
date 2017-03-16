/**
 * Created by jasdeepkaur on 2/14/17.
 */

import java.util.Scanner;

public class Table
{
    public static void main(String[] aa)
    {
        Scanner sc=new Scanner(System.in);
        int res=0;
        System.out.println("Enter the no.");
        int x=sc.nextInt();

        for(int i=1;i<=10;i++)
        {

            res = x * i;
            System.out.println("1."+x+"*"+i+"="+res);

        }
    }

}
