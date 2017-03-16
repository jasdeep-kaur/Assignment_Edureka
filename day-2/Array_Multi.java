/**
 * Created by jasdeepkaur on 2/15/17.
 */
import java.util.Scanner;
public class Array_Multi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no of rows and columns");
        int m=sc.nextInt();
        int n=sc.nextInt();

        int a[][]=new int[m][n];

        System.out.println("enter the array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
            a[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
