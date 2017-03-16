/**
 * Created by jasdeepkaur on 2/14/17.
 */

import java.util.Scanner;

public class Word
{
    public static void main(String[] args)
    {
     String n[]={"zero","one","two,","three","four","five","six","seven","eight","nine"};
   Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();

        int temp=0,sum=0;

        while (x > 0)
        {
            temp=x%10;
            sum=(sum*10)+temp;
            x=x/10;
        }
        x=sum;
        while (x > 0)
        {
            temp=x%10;
            System.out.print(n[temp]+" ");
            x=x/10;
        }

    }
}
