/**
 * Created by jasdeepkaur on 2/14/17.
 */
import java.util.Scanner;

public class Star
{
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     //System.out.println("enter the no.");
     //int x=sc.nextInt();

     for(int r=1;r<=3;r++)
     {
         for(int c=1;c<=r;c++)
         {
             System.out.print("*");
         }

        System.out.print("\n");
     }
     for(int r=4;r<=7;r++)
     {
         for(int c=1;c<=r;c++)
         {
             System.out.print(" ");
         }

         System.out.print("\n");
     }

     for(int r=9;r<=9;r++)
     {
         for(int c=1;c<=r;c++)
         {
             System.out.print("*");
         }

         System.out.print("\n");
     }


 }

}
