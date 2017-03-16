/**
 * Created by jasdeepkaur on 2/14/17.
 */
import java.util.Scanner;
public class Largest_three {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a,b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = 0;
        int res1 = 0;
        res = a > b ? a : b;
        res1 = res > c ? res : c;
        System.out.println("largest_three=" + res1);
    }
}
