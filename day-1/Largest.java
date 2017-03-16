/**
 * Created by jasdeepkaur on 2/14/17.
 */
import java.util.Scanner;
class Largest {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int z=0;
        System.out.println("Enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
         z=(x>y)?x:y;
        System.out.println("largest ="+z);




        System.out.println("Enter the value of a,b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res=0;
        int res1=0;
        res=a>b?a:b;
        res1=res>c?res:c;
        System.out.println("largest_three="+res1);



    }


}
