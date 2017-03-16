/**
 * Created by jasdeepkaur on 2/14/17.
 */

import java.util.Scanner;
public class Odd {
    public static void main(String[] aa)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two no.");
        int x=sc.nextInt();
        int y=sc.nextInt();

        for(int i=x;i<=y;i++)
        {
            if(i%2!=0)
            System.out.println(i);
        }

    }
}
