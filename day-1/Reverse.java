/**
 * Created by jasdeepkaur on 2/14/17.
 */
import java.util.Scanner;

public class Reverse
{
    public static void main(String[] aa)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int x = sc.nextInt();
        int temp=0,sum=0;
        while (x > 0)
        {
            temp=x%10;
            sum=(sum*10)+temp;
            x=x/10;
        }
        System.out.println("the no is="+sum);

    }
}