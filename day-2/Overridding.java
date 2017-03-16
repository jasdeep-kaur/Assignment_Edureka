/**
 * Created by jasdeepkaur on 2/16/17.
 */
public class Overridding
{

    public static void main(String[] args)
    {
        B obj=new B();
        C obj1=new C();
        D obj2=new D();
        System.out.println("the roll no A is ="+ obj.roll_no());

        System.out.println("the roll no B is ="+ obj1.roll_no());

        System.out.println("the roll no C is ="+ obj2.roll_no());
    }
}
class A
{
    int roll_no()
    {
        return 21;


    }

}
     class B extends A {

         int roll_no() {
             //super.roll_no();

             return 22;
         }
     }
         class C extends B {
             int roll_no() {
                 return 23;
             }
         }
        class D extends C
        {
            int roll_no() {
                return 24;
            }
        }



